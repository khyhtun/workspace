package uber;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import constant.Constants;
import constant.TrainColor;
import models.Leg;
import models.QuickPlannerDepart;
import models.QuickPlannerDepartRoot;
import models.ResultDisplayBean;
import models.TrainTime;
import models.Trip;
import util.BartAPI;

@Controller
public class ResultController 
{
	@GetMapping("/showResult")
	public String retrieveAndShow(Model model, HttpSession session, HttpServletRequest request)
	{
		HashMap<String, ResultDisplayBean> resultDisplayBeanMap = new HashMap<String, ResultDisplayBean>();
		TrainColor trainColor = new TrainColor();
		LocalDateTime now = LocalDateTime.now();
		
		QuickPlannerDepart quickPlannerDepart;
		String selectedStation = request.getParameter("selectedStation");
		session.setAttribute("selectedStation", selectedStation);
		//"http://api.bart.gov/api/sched.aspx?cmd=depart&b=0&a=6&key=MW9S-E7SL-26DU-VV8V&json=y&time=now&dest=WOAK&orig=24TH";
		StringBuffer urlBuffer = new StringBuffer("http://api.bart.gov/api/sched.aspx?cmd=depart&b=0&a=6&key=MW9S-E7SL-26DU-VV8V&json=y&time=now&dest=");
		urlBuffer.append(Constants.DESTINATION_STATION).append("&orig=").append(selectedStation);
		
		String responseString = BartAPI.invokeBartAPI(urlBuffer.toString());
		
		
		//RICH (color code of train line) : 12 min (ETA 12:05pm PST), 26 min (ETA 12:31pm PST), 41 min (ETA 12:56pm)

		if(null != responseString)
		{
			ResultDisplayBean tempBean = new ResultDisplayBean();
			try
			{
				quickPlannerDepart = new Gson().fromJson(responseString, QuickPlannerDepart.class);
			}
			catch(JsonSyntaxException e)
			{
				return "landing";
			}
			if(null == quickPlannerDepart) return null;
			QuickPlannerDepartRoot departRoot = quickPlannerDepart.getQuickPlannerDepartRoot();
			if(null == departRoot) return null;
			ArrayList<Trip> tripList = departRoot.getSchedule().getQuickPlannerDepartRequest().getTripList();
			if(null == tripList)
				return null;
			for(Trip trip : tripList)
			{
				System.out.println(tripList.size());
				ArrayList<Leg> legs = trip.getLegList();
				if(null == legs) return null;
				for(Leg leg : legs)
				{
					System.out.println(legs.size());
					String routeNumber = leg.getLine();
					LocalDateTime originalDateTime =  getLocalDateTime(leg.getOrigTimeDate(), leg.getOrigTimeMin());
					Duration duration = Duration.between(now, originalDateTime);
					String terminus = leg.getTrainHeadStation();
					if(resultDisplayBeanMap.containsKey(terminus))
						tempBean = resultDisplayBeanMap.get(terminus);
					else
					{
						tempBean = new ResultDisplayBean();
						resultDisplayBeanMap.put(terminus, tempBean);
					}	
					tempBean.setColor(trainColor.getColor(routeNumber));
					tempBean.setTrainHeadStation(terminus);
					TrainTime tempTrainTime = new TrainTime();
					tempTrainTime.setDuration(duration.toMinutes());
					tempTrainTime.setEta("(ETA " + leg.getDestTimeMin() + ")");
					tempBean.addTrainTime(tempTrainTime);
					
				}
			}
		}
		model.addAttribute("resultDisplayBeanMap", resultDisplayBeanMap);
		return "landing";
		
	}
	
	private LocalDateTime getLocalDateTime(String date, String time)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm a");
		String dateTime = date + " " + time;
		try
		{
			Date datie = sdf.parse(dateTime);
			return datie.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
		return null;
	}
}

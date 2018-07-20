package uber;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.google.gson.Gson;

import models.AllStationsResponse;
import models.AllStationsRoot;
import models.Station;
import models.Stations;
import util.BartAPI;

@Controller
public class LandingController 
{
	@GetMapping("/")
	public String landing(Model model, HttpSession session)
	{
		//this is the landing page, trying to retrieve all BART stations for dropdown
		String url = "http://api.bart.gov/api/stn.aspx?cmd=stns&key=MW9S-E7SL-26DU-VV8V&json=y";
		
		String responseString = BartAPI.invokeBartAPI(url);
		
		if(null != responseString)
		{
			AllStationsResponse respObj = new Gson().fromJson(responseString, AllStationsResponse.class);
			
			HashMap<String, String> stationMap = new HashMap<String, String>();
			
			AllStationsRoot root = respObj.getRoot();
			
			Stations stations = root.getStations();
			
			Station[] stationsArray = stations.getStationArray();
			
			//putting in HashMap so that both abbreviations and full station names can be used in dropdown
			for(Station temp : stationsArray)
			{
				stationMap.put(temp.getAbbr(), temp.getName());
			}
			session.setAttribute("stations", stationMap);
			session.setAttribute("selectedStation", "");
		}
		return "landing";
	}
}

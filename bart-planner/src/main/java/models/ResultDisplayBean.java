package models;

import java.util.ArrayList;
import java.util.Comparator;

public class ResultDisplayBean 
{
	private String routeNumber;
	private String trainHeadStation;
	private String color;
	private ArrayList<TrainTime> trainTimeList;
	public ResultDisplayBean()
	{
		trainTimeList = new ArrayList<TrainTime>();
	}
	public String getRouteNumber() {
		return routeNumber;
	}
	public void setRouteNumber(String routeNumber) {
		this.routeNumber = routeNumber;
	}
	public String getTrainHeadStation() {
		return trainHeadStation;
	}
	public void setTrainHeadStation(String trainHeadStation) {
		this.trainHeadStation = trainHeadStation;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public ArrayList<TrainTime> getTrainTimeList() {
//		if(null == trainTimeList)
//			return new ArrayList<TrainTime>();
//		Collections.sort(trainTimeList,new SortByDuration());
		return trainTimeList;
	}
	public void setTrainTimeList(ArrayList<TrainTime> trainTimeList) {
		this.trainTimeList = trainTimeList;
	}
	
	class SortByDuration implements Comparator<TrainTime>
	{
	    // Used for sorting in ascending order of
	    // roll number
	    public int compare(TrainTime a, TrainTime b)
	    {
	        return (int) a.getDuration() - (int) b.getDuration();
	    }
	}
	public void addTrainTime(TrainTime trainTime)
	{
		
		ArrayList<TrainTime> list = getTrainTimeList();
		list.add(trainTime);
	}
}

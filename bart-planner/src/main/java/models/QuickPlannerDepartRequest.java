package models;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

public class QuickPlannerDepartRequest 
{
	@SerializedName("trip") ArrayList<Trip> tripList;

	public ArrayList<Trip> getTripList() {
		return tripList;
	}

	public void setTripList(ArrayList<Trip> tripList) {
		this.tripList = tripList;
	}
	
}

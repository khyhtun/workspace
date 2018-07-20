package models;

import com.google.gson.annotations.SerializedName;

public class Stations 
{
	@SerializedName("station")
	private Station[] stationArray;

	public Station[] getStationArray() {
		return stationArray;
	}

	public void setStationArray(Station[] stationArray) {
		this.stationArray = stationArray;
	}
	
	
}

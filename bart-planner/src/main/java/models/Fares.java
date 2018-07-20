package models;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

public class Fares 
{
	@SerializedName("@level") private String level;
	@SerializedName("fare") private ArrayList<Fare> fareList;
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public ArrayList<Fare> getFareList() {
		return fareList;
	}
	public void setFareList(ArrayList<Fare> fareList) {
		this.fareList = fareList;
	}
}

package models;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

public class Trip 
{
	@SerializedName("@origin") private String origin;
	@SerializedName("@destination") private String destination;
	@SerializedName("@origTimeMin") private String origTimeMin;
	@SerializedName("@origTimeDate") private String origTimeDate;
	@SerializedName("@destTimeMin") private String destTimeMin;
	@SerializedName("@destTimeDate") private String destTimeDate;
	@SerializedName("@clipper") private String clipper;
	@SerializedName("@tripTime") private String tripTime;
	@SerializedName("@co2") private String co2;
	@SerializedName("fares") private Fares fares;
	@SerializedName("leg") private ArrayList<Leg> legList;
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getOrigTimeMin() {
		return origTimeMin;
	}
	public void setOrigTimeMin(String origTimeMin) {
		this.origTimeMin = origTimeMin;
	}
	public String getOrigTimeDate() {
		return origTimeDate;
	}
	public void setOrigTimeDate(String origTimeDate) {
		this.origTimeDate = origTimeDate;
	}
	public String getDestTimeMin() {
		return destTimeMin;
	}
	public void setDestTimeMin(String destTimeMin) {
		this.destTimeMin = destTimeMin;
	}
	public String getDestTimeDate() {
		return destTimeDate;
	}
	public void setDestTimeDate(String destTimeDate) {
		this.destTimeDate = destTimeDate;
	}
	public String getClipper() {
		return clipper;
	}
	public void setClipper(String clipper) {
		this.clipper = clipper;
	}
	public String getTripTime() {
		return tripTime;
	}
	public void setTripTime(String tripTime) {
		this.tripTime = tripTime;
	}
	public String getCo2() {
		return co2;
	}
	public void setCo2(String co2) {
		this.co2 = co2;
	}
	public Fares getFares() {
		return fares;
	}
	public void setFares(Fares fares) {
		this.fares = fares;
	}
	public ArrayList<Leg> getLegList() {
		return legList;
	}
	public void setLegList(ArrayList<Leg> legList) {
		this.legList = legList;
	}
}

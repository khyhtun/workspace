package models;

import com.google.gson.annotations.SerializedName;

public class Station 
{
	@SerializedName("name") private String name;
	@SerializedName("abbr") private String abbr;
	@SerializedName("gtfs_latitude") private String gtfsLatitude;
	@SerializedName("gtfs_longitude") private String gtfsLongitude;
	@SerializedName("address") private String address;
	@SerializedName("city") private String city;
	@SerializedName("county") private String county;
	@SerializedName("state") private String state;
	@SerializedName("zipcode") private String zipCode;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAbbr() {
		return abbr;
	}
	public void setAbbr(String abbr) {
		this.abbr = abbr;
	}
	public String getGtfsLatitude() {
		return gtfsLatitude;
	}
	public void setGtfsLatitude(String gtfsLatitude) {
		this.gtfsLatitude = gtfsLatitude;
	}
	public String getGtfsLongitude() {
		return gtfsLongitude;
	}
	public void setGtfsLongitude(String gtfsLongitude) {
		this.gtfsLongitude = gtfsLongitude;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}

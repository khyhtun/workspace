package models;

import com.google.gson.annotations.SerializedName;

public class AllStationsRoot 
{
	@SerializedName("uri")
	private UriInfo uri;
	@SerializedName("stations")
	private Stations stations;
	
	public UriInfo getUri() {
		return uri;
	}
	public void setUri(UriInfo uri) {
		this.uri = uri;
	}
	public Stations getStations() {
		return stations;
	}
	public void setStations(Stations stations) {
		this.stations = stations;
	}

	
}

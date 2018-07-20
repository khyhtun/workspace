package models;

import com.google.gson.annotations.SerializedName;

public class Message 
{
	@SerializedName("co2_emissions")
	private CO2Emissions co2Emissions;

	public CO2Emissions getCo2Emissions() {
		return co2Emissions;
	}

	public void setCo2Emissions(CO2Emissions co2Emissions) {
		this.co2Emissions = co2Emissions;
	}
	
	
}

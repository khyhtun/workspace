package models;

import com.google.gson.annotations.SerializedName;

public class CO2Emissions 
{
	@SerializedName("#cdata-section")
	private String cdDataSection;

	public String getCdDataSection() {
		return cdDataSection;
	}

	public void setCdDataSection(String cdDataSection) {
		this.cdDataSection = cdDataSection;
	}
}

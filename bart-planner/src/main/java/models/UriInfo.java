package models;

import com.google.gson.annotations.SerializedName;

public class UriInfo 
{
	@SerializedName("#cdata-section") private String cdataSection;

	public String getCdataSection() {
		return cdataSection;
	}

	public void setCdataSection(String cdataSection) {
		this.cdataSection = cdataSection;
	}
}

package models;

import com.google.gson.annotations.SerializedName;

public class XmlInfo 
{
	@SerializedName("@version") private String version;
	@SerializedName("@encoding") private String encoding;
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getEncoding() {
		return encoding;
	}
	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}
}

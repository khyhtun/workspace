package models;

import com.google.gson.annotations.SerializedName;

public class Fare 
{
	@SerializedName("@amount") private String amount;
	@SerializedName("@class") private String fareClass;
	@SerializedName("@name") private String name;
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getFareClass() {
		return fareClass;
	}
	public void setFareClass(String fareClass) {
		this.fareClass = fareClass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

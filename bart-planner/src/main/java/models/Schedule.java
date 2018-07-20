package models;

import com.google.gson.annotations.SerializedName;

public class Schedule 
{
	@SerializedName("date") private String date;
	@SerializedName("time") private String time;
	@SerializedName("before") private String before;
	@SerializedName("after") private String after;
	@SerializedName("request") private QuickPlannerDepartRequest quickPlannerDepartRequest;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getBefore() {
		return before;
	}
	public void setBefore(String before) {
		this.before = before;
	}
	public String getAfter() {
		return after;
	}
	public void setAfter(String after) {
		this.after = after;
	}
	public QuickPlannerDepartRequest getQuickPlannerDepartRequest() {
		return quickPlannerDepartRequest;
	}
	public void setQuickPlannerDepartRequest(QuickPlannerDepartRequest quickPlannerDepartRequest) {
		this.quickPlannerDepartRequest = quickPlannerDepartRequest;
	}
}

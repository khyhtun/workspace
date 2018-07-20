package models;

import com.google.gson.annotations.SerializedName;

public class QuickPlannerDepartRoot 
{
	@SerializedName("@id") private String id;
	@SerializedName("uri") private UriInfo uri;
	@SerializedName("origin") private String origin;
	@SerializedName("destination") private String destination;
	@SerializedName("sched_num") private String schedNum;
	@SerializedName("schedule") private Schedule schedule;
	@SerializedName("@message") private Message message;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public UriInfo getUri() {
		return uri;
	}
	public void setUri(UriInfo uri) {
		this.uri = uri;
	}
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
	public String getSchedNum() {
		return schedNum;
	}
	public void setSchedNum(String schedNum) {
		this.schedNum = schedNum;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
}

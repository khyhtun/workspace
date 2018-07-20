package models;

public class TrainTime 
{
	private long duration;
	private String eta;
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration) {
		this.duration = duration;
	}
	public String getEta() {
		return eta;
	}
	public void setEta(String eta) {
		this.eta = eta;
	}
	public String getOutputString() {
		return duration + " min " + eta;
	}
	
}

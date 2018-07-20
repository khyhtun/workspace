package models;

import com.google.gson.annotations.SerializedName;

public class Leg 
{
	@SerializedName("@order") private String order;
	@SerializedName("@transfercode") private String transferCode;
	@SerializedName("@origin") private String origin;
	@SerializedName("@destination") private String destination;
	@SerializedName("@origTimeMin") private String origTimeMin;
	@SerializedName("@origTimeDate") private String origTimeDate;
	@SerializedName("@destTimeMin") private String destTimeMin;
	@SerializedName("@destTimeDate") private String destTimeDate;
	@SerializedName("@line") private String line;
	@SerializedName("@bikeflag") private String bikeFlag;
	@SerializedName("@trainHeadStation") private String trainHeadStation;
	@SerializedName("@load") private String load;
	@SerializedName("@trainId") private String trainId;
	@SerializedName("@trainIdx") private String trainIdx;
	
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getTransferCode() {
		return transferCode;
	}
	public void setTransferCode(String transferCode) {
		this.transferCode = transferCode;
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
	public String getOrigTimeMin() {
		return origTimeMin;
	}
	public void setOrigTimeMin(String origTimeMin) {
		this.origTimeMin = origTimeMin;
	}
	public String getOrigTimeDate() {
		return origTimeDate;
	}
	public void setOrigTimeDate(String origTimeDate) {
		this.origTimeDate = origTimeDate;
	}
	public String getDestTimeMin() {
		return destTimeMin;
	}
	public void setDestTimeMin(String destTimeMin) {
		this.destTimeMin = destTimeMin;
	}
	public String getDestTimeDate() {
		return destTimeDate;
	}
	public void setDestTimeDate(String destTimeDate) {
		this.destTimeDate = destTimeDate;
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public String getBikeFlag() {
		return bikeFlag;
	}
	public void setBikeFlag(String bikeFlag) {
		this.bikeFlag = bikeFlag;
	}
	public String getTrainHeadStation() {
		return trainHeadStation;
	}
	public void setTrainHeadStation(String trainHeadStation) {
		this.trainHeadStation = trainHeadStation;
	}
	public String getLoad() {
		return load;
	}
	public void setLoad(String load) {
		this.load = load;
	}
	public String getTrainId() {
		return trainId;
	}
	public void setTrainId(String trainId) {
		this.trainId = trainId;
	}
	public String getTrainIdx() {
		return trainIdx;
	}
	public void setTrainIdx(String trainIdx) {
		this.trainIdx = trainIdx;
	}
	
}

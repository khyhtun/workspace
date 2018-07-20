package models;

import com.google.gson.annotations.SerializedName;

public class AllStationsResponse 
{
	@SerializedName("?xml")
	private XmlInfo xml;
	@SerializedName("root")
	private AllStationsRoot root;
	
	public XmlInfo getXml() {
		return xml;
	}
	public void setXml(XmlInfo xml) {
		this.xml = xml;
	}
	public AllStationsRoot getRoot() {
		return root;
	}
	public void setRoot(AllStationsRoot root) {
		this.root = root;
	}
	
	
}

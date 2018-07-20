package models;

import com.google.gson.annotations.SerializedName;

public class QuickPlannerDepart 
{
	@SerializedName("?xml") 
	private XmlInfo xml;
	
	@SerializedName("root")
	private QuickPlannerDepartRoot quickPlannerDepartRoot;

	public XmlInfo getXml() {
		return xml;
	}

	public void setXml(XmlInfo xml) {
		this.xml = xml;
	}

	public QuickPlannerDepartRoot getQuickPlannerDepartRoot() {
		return quickPlannerDepartRoot;
	}

	public void setQuickPlannerDepartRoot(QuickPlannerDepartRoot quickPlannerDepartRoot) {
		this.quickPlannerDepartRoot = quickPlannerDepartRoot;
	}
	
	
	
}

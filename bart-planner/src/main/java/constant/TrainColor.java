package constant;

import java.util.HashMap;

public class TrainColor 
{
	public HashMap<String, String> trainColor = new HashMap<String,String>();
	public TrainColor()
	{
		trainColor.put("ROUTE 1", "#ffff33");
		trainColor.put("ROUTE 2", "#ffff33");
		trainColor.put("ROUTE 3", "#ff9933");
		trainColor.put("ROUTE 4", "#ff9933");
		trainColor.put("ROUTE 5", "#339933");
		trainColor.put("ROUTE 6", "#339933");
		trainColor.put("ROUTE 7", "#ff0000");
		trainColor.put("ROUTE 8", "#ff0000");
		trainColor.put("ROUTE 19", "#d5cfa3");
		trainColor.put("ROUTE 20", "#d5cfa3");
		trainColor.put("ROUTE 11", "#0099cc");
		trainColor.put("ROUTE 12", "#0099cc");
	}
		public String getColor(String str)
		{
			return trainColor.get(str);
		}
}

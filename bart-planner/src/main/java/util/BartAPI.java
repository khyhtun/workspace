package util;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class BartAPI 
{
	public static String invokeBartAPI(String url)
	{
		Client client = Client.create();
		WebResource webResource = client.resource(url);
		
		ClientResponse clientResponse = webResource.accept("application/json").get(ClientResponse.class);
		
		//only return non-null if http code is okay
		if(clientResponse.getStatus() >= 200 && clientResponse.getStatus() < 300)
		{
			return clientResponse.getEntity(String.class);
		}
		
		return null;
	}
}

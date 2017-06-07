package main;

import org.jboss.resteasy.client.ClientRequest;

/**
 * It will simple create a GET request to an URL and print the results
 * @author William Antônio
 *
 */
public class Ex01SimplestRequest {

	public static void main(String[] args) throws Exception {
		ClientRequest cr = new ClientRequest("http://www.mastertheboss.com/");
		String result = cr.get(String.class).getEntity();
		System.out.println(result);
	}
}

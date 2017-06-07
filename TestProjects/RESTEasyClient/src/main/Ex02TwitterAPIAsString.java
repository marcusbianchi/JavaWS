package main;

import javax.ws.rs.core.UriBuilder;

import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientRequestFactory;

/**
 * It will consume some Twitter read-only methods and print the result as a
 * String
 * 
 * @author William Antônio
 * 
 */
public class Ex02TwitterAPIAsString {
	public static void main(String[] args) throws Exception {
		// A factory for the Twitter REST API
		ClientRequestFactory crf = new ClientRequestFactory(UriBuilder.fromUri(
				"http://api.twitter.com/1").build());

		// What is trending?
		ClientRequest trendsRequest = crf
				.createRelativeRequest("/trends/1.json");
		String trends = trendsRequest.get(String.class).getEntity();
		System.out.println(trends);

		// The information of some Twitter's accounts
		ClientRequest userInfoRequest = crf
				.createRelativeRequest("/users/show.json");

		// RESTEasy's twitter information
		userInfoRequest.queryParameter("screen_name", "resteasy");
		System.out.println(userInfoRequest.get(String.class).getEntity());
		// RESTEasy's twitter information
		userInfoRequest.queryParameter("screen_name", "openshift");
		System.out.println(userInfoRequest.get(String.class).getEntity());

	}
}

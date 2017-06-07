package main;

import javax.xml.bind.annotation.XmlRootElement;

import org.jboss.resteasy.client.ClientRequest;

/**
 * Shows how to parse the HTTP response body to an object
 * 
 * @author William Antônio
 * 
 */
public class Ex03TwitterUserWithParsing {
	public static void main(String[] args) throws Exception {
		// The information of some Twitter's accounts
		ClientRequest userInfoRequest = new ClientRequest(
				"http://api.twitter.com/1/users/show.xml");

		// RESTEasy's twitter information
		userInfoRequest.queryParameter("screen_name", "resteasy");
		TwitterUser resteasy = userInfoRequest.get(TwitterUser.class)
				.getEntity();
		System.out.println(resteasy);
		userInfoRequest.clear();

		// OpenShift's twitter information
		userInfoRequest.queryParameter("screen_name", "openshift");
		TwitterUser openshift = userInfoRequest.get(TwitterUser.class)
				.getEntity();
		System.out.println(openshift);
		userInfoRequest.clear();
		
		// William's twitter information
		userInfoRequest.queryParameter("screen_name", "william_antonio");
		TwitterUser william = userInfoRequest.get(TwitterUser.class)
				.getEntity();
		System.out.println(william);
	}

	@XmlRootElement(name = "user")
	public static class TwitterUser {
		private String id;
		private String name;
		private String description;
		private String location;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		@Override
		public String toString() {
			return "Name: " + this.getName() + "\nDescription: "
					+ this.getDescription();
		}

	}
}

package main;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.UriBuilder;
import javax.xml.bind.annotation.XmlRootElement;

import org.jboss.resteasy.client.ClientRequestFactory;

/**
 * Consumes the Twitter API using a JAX-RS interface proxy
 * 
 * @author William Antônio
 * 
 */
public class Ex06TwitterAPIProxy {

	public static void main(String[] args) throws Exception {
		// A factory for the Twitter REST API
		ClientRequestFactory crf = new ClientRequestFactory(UriBuilder.fromUri(
				"https://api.twitter.com/1").build());
		TwitterAPI twitterAPI = crf.createProxy(TwitterAPI.class);
		System.out.println(twitterAPI.userInformation("resteasy"));
		System.out.println(twitterAPI.status("112652479837110273"));
	}

	public static interface TwitterAPI {
		@GET
		@Path("users/show.xml")
		public TwitterUser userInformation(
				@QueryParam("screen_name") String screenName);

		@GET
		@Path("statuses/show.xml")
		public Status status(@QueryParam("id") String id);
	}

	@XmlRootElement
	public static class Status {
		private String id;
		private String text;
		private boolean favorited;
		private boolean retweeted;

		@Override
		public String toString() {

			return this.getId() + " - " + this.getText();
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public boolean isFavorited() {
			return favorited;
		}

		public void setFavorited(boolean favorited) {
			this.favorited = favorited;
		}

		public boolean isRetweeted() {
			return retweeted;
		}

		public void setRetweeted(boolean retweeted) {
			this.retweeted = retweeted;
		}

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

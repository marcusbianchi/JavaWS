package com.spi.rest.accesscontrolfilter.security;

import java.util.HashMap;

import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import com.google.gson.Gson;
import com.spi.rest.accesscontrol.database.dynamo.general.DynamoBuilding;
import com.spi.rest.accesscontrol.database.general.AbstractDatabaseBuilding;
import com.spi.rest.accesscontrol.database.general.AbtractDatabaseObject;
import com.spi.rest.accesscontrol.model.user.User;
import com.spi.rest.accesscontrolfilter.s3.S3Handler;

/**
 * @desc this class holds functions for getting the requested user from UserAPI
 *       examples include getUser()
 * @author Francisco Cardoso
 */
public class RestClientHandler {
	ResteasyClient client;
	WebTarget target1;
	S3Handler s3;
	ResteasyWebTarget target;
	UserProxy userProxy;
	Response response;
	Gson gson;
	User user;

	/**
	 * @desc get RestAPI client credentials from properties file
	 * @param String
	 *            login - requested by authentication header
	 * @return User - Object that contains the complete user information, like
	 *         pass and permissions
	 */

	public User getUser(String login) {

		try {
			//Get User from DB using AccessControl Package
			AbstractDatabaseBuilding db = new DynamoBuilding();
			AbtractDatabaseObject user = db.requestTheDatabase("user");
			HashMap<String, Object> userHash = new HashMap<String, Object>();
			userHash.put("userID", login);
			User dbUser = gson.fromJson(user.read(userHash), User.class);
			if (dbUser == null)
				throw new NotAuthorizedException("User not registered or Invalid API credentials");
			else
				return dbUser;
		} catch (Exception e) {
			throw new NotAuthorizedException(this.getClass() + ".getUser: " + e.getMessage()
					+ " - Troubleshooting: USERAPI is out of service; user json schema has changed. Error: "
					+ e.toString());
		}
	}
}

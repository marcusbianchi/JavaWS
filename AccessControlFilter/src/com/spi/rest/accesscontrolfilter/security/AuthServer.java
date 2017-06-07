package com.spi.rest.accesscontrolfilter.security;

import javax.ws.rs.NotAuthorizedException;

import com.spi.rest.accesscontrol.model.user.User;
import com.spi.rest.accesscontrolfilter.s3.S3Handler;



/**
 * @desc this class holds functions of authenticate and authorize an user
 *        include Authenticate() and Authorize()
 * @author Francisco Cardoso;Marcus Bianchi
 */
public class AuthServer implements IServerAuthInterface {
	S3Handler s3 = new S3Handler();
	PermissionHandler permission = new PermissionHandler();

	/**
	 * @desc compare credentials form HTTP auth header and credentials from
	 *       dynamoDB
	 * @param String
	 *            login, String password, User userFromDB
	 * @return boolean - true if user credentials from HTTP auth header match
	 *         credentials from dynamoDB
	 */
	public boolean Authenticate(String login, String password, User userFromDB) {
		try {
			String secret_access_key = userFromDB.getPass();
			if (password.equals(secret_access_key))
				return true;
			else
				return false;

		} catch (Exception e) {
			throw new NotAuthorizedException(this.getClass() + ".Authenticate: " + e.getMessage());
		}
	}

	/**
	 * @desc check permissions of user from dynamoDB
	 * @param String
	 *            login, String password, String uriResource, String httpMethod,
	 *            User userFromDB
	 * @return boolean - true if user has permission for that method in the uri
	 *         endpoint
	 */
	public boolean Authorize(String login, String uriHost, String uriResource, String httpMethod, User userFromDB) {
		try {
			boolean accessEnvironment, accessUrl, accessMethod;
			String uriEnvironment;

			uriEnvironment = s3.getFileValue(uriHost); // Get uriEnvironment
														// type
														// from S3
			

			accessEnvironment = permission.checkEnvironment(userFromDB.getEndPoints(), uriEnvironment);
			accessUrl = permission.checkUrl(userFromDB.getEndPoints(), uriResource);
			accessMethod = permission.checkMetods(userFromDB.getEndPoints(), uriResource, uriEnvironment, httpMethod);

			
			System.out.println("accessEnvironment = " + String.valueOf(accessEnvironment));
			System.out.println("accessUrl = " + String.valueOf(accessUrl));
			System.out.println("accessMethod = " + String.valueOf(accessMethod));

			if ((accessEnvironment == true) && (accessUrl == true) && (accessMethod == true))
				return true;
			else
				return false;
		} catch (Exception e) {
			throw new NotAuthorizedException(this.getClass() + ".Authorize: " + e.getMessage());
		}
	}
}

package com.spi.rest.accesscontrolfilter.property;

import java.io.IOException;

/**
 * @desc this class holds functions for getting the needed credentials to communicate with another RestAPI
 *  examples include getCredentials()
 * @author Francisco Cardoso
 */

public class ApiSecurityProperties {
	PropertyGetValues apiCredentialValues = new PropertyGetValues();
	String login;
	String password;	
	
	/**
	 * @desc get RestAPI credentials from properties file
	 * @param String none
	 * @return String - RestAPI credentials "login:password"
	 */	
	public String getCredentials() {
		return getLogin() + ":" + getPassword();
	}

	private String getLogin() {
		try {
			login = apiCredentialValues.getPropertyValue("userAPIlogin");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return login;
	}
	
	private String getPassword() {
		try {
			password = apiCredentialValues.getPropertyValue("userAPIpassword");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return password;
	}
}

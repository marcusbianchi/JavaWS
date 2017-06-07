package com.spi.rest.accesscontrolfilter.security;

import com.spi.rest.accesscontrol.model.user.User;

/** 
 * @desc this interface holds the necessary methods for credential handling
 * @author Francisco Cardoso
*/
public interface IServerAuthInterface {
	public boolean Authenticate(String login,String password, User userFromDB);
	public boolean Authorize(String login, String uriHost, String uriResource, String httpMethod, User userFromDB);
}

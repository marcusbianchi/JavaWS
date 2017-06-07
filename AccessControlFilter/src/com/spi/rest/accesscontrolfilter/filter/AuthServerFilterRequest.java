package com.spi.rest.accesscontrolfilter.filter;

import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

import org.apache.commons.codec.binary.Base64;

import com.spi.rest.accesscontrol.model.user.User;
import com.spi.rest.accesscontrolfilter.security.AuthServer;
import com.spi.rest.accesscontrolfilter.security.RestClientHandler;


/**
 * @desc this class represents a filter which holds functions with the purpose
 *       of requesting authentication and authorization examples include
 *       filter()
 * @author Francisco Cardoso
 */

@Provider
public class AuthServerFilterRequest implements ContainerRequestFilter {
	private AuthServer authenticationMatcher = new AuthServer();
	private RestClientHandler client = new RestClientHandler();
	private User userFromDB = new User();
	private String login;
	private String password;
	private String uriHost;
	private String uriResource;
	private String httpMethod;
	
	/**
	 * @desc throws exception if user can not be authenticated or is trying to
	 *       access a resource without permission
	 * @param ContainerRequestContext
	 *            requestContext - HTTP request
	 * @return none
	 */
	public void filter(ContainerRequestContext requestContext) {		 
		// Receive authHeader value
		getAuthHeaderCredentials(requestContext.getHeaderString("Authorization"));		

		//Receive host, endpoint and method that client is trying to access
		getHeaderUriPath(requestContext);
		
		// Get user from database
		userFromDB = client.getUser(login);
			    
		// Use login and password for authentication
		boolean IsUserAuthenticated = authenticationMatcher.Authenticate(login, password, userFromDB);

		// Throws error 401 if password is invalid or user does not exist
		if (IsUserAuthenticated == false) {
			throw new NotAuthorizedException("Invalid login/password");	
		}		

		//At this point, user is already logged in 		
		// Use uriHost, uriResource and httpMethod for authorization
		boolean IsUserAuthorized = authenticationMatcher.Authorize(login,uriHost,uriResource,httpMethod,userFromDB);
		 
		// Throws error 401 if user does not permission
		if (IsUserAuthorized == false) {
			throw new NotAuthorizedException("Access denied - You dont have permission - Host:" + uriHost);	
		}	
	}
	
	private void getAuthHeaderCredentials(String authHeader) {
		try {
			// Get only credentials values from authHeader
			authHeader = authHeader.substring(authHeader.lastIndexOf(" ") + 1);

			// Decode authHeader base64
			byte[] bytesAuthHeader = Base64.decodeBase64(authHeader);
			String decodedAuthHeader = new String(bytesAuthHeader);

			// Split header between login and password
			login = decodedAuthHeader.substring(0, decodedAuthHeader.lastIndexOf(":"));
			password = decodedAuthHeader.substring(decodedAuthHeader.lastIndexOf(":") + 1);
		} catch (Exception e) {
			throw new NotAuthorizedException("Authentication header has invalid format or it's null");
		}
	}
	
	private void getHeaderUriPath(ContainerRequestContext requestContext) {
		try {
			uriHost = requestContext.getUriInfo().getAbsolutePath().getHost();			 																					           //PROBLEM: Cannot use full URL as properties key
			uriResource = requestContext.getUriInfo().getPath();		
			httpMethod = requestContext.getMethod();

			//PathParameters must be ignored when checking permissions
			if(!requestContext.getUriInfo().getPathParameters().isEmpty())
			{				
				String pathParam = uriResource.substring(uriResource.lastIndexOf("/"), uriResource.length());
				uriResource = uriResource.replace(pathParam, "");
				System.out.println(uriResource);
			}
			
		} catch (Exception e) {
			throw new NotAuthorizedException("Invalid URI Path");
		}
	}
}

package com.spi.rest.accesscontrolfilter.security;

import java.util.Iterator;
import java.util.List;

import com.spi.rest.accesscontrol.model.user.EndPoint;
import com.spi.rest.accesscontrol.model.user.Permission;


/**
 * @desc this class holds functions of comparing user request with his permissions
 *  examples include checkEnvironment(), checkUrl(), checkMethods()
 * @author Francisco Cardoso
 */

public class PermissionHandler {
	
	/**
	 * @desc compare environment client is requesting with his permission
	 * @param List endPoints - all endpoints client has access, String uriEnvironment - environment client is trying to access
	 * @return boolean - true if user has access to the requested environment 
	 */		
	public boolean checkEnvironment(List<EndPoint> endPoints, String uriEnvironment) {		
		//System.out.println("Trying to access envirnoment type = " + uriEnvironment);
		
		Iterator<EndPoint> endpointInterator = endPoints.iterator();
		while (endpointInterator.hasNext()) {
			EndPoint endpoint = endpointInterator.next();
			//System.out.println("Has access to environment = " + endpoint.getEnvironment());
			if (uriEnvironment.equals(endpoint.getEnvironment()))
				return true;
		}
		return false;
	}

	/**
	 * @desc compare URL ending client is requesting with his permission
	 * @param List endPoints - all endpoints client has access, String uriEnvironment - environment client is trying to access, String uriResource - URI ending client is trying to access
	 * @return boolean - true if user has access to the requested URI 
	 */		
	public boolean checkUrl(List<EndPoint> endPoints, String uriResource) {
		//System.out.println("Trying to access URL = " + uriResource);
		
		Iterator<EndPoint> endpointInterator = endPoints.iterator();
		while (endpointInterator.hasNext()) {
			EndPoint endpoint = endpointInterator.next();
			//System.out.println("Has access to environment = " + endpoint.getUrl());
			if (uriResource.equals(endpoint.getUrl()))
				return true;
		}
		return false;
	}
	
	/**
	 * @desc compare rest methods client is requesting with his permission
	 * @param List endPoints - all endpoints client has access, String uriResource - URI ending client is trying to access, String httpMethod - Method client is requesting
	 * @return boolean - true if user has access to the requested method 
	 */		
	public boolean checkMetods(List<EndPoint> endPoints, String uriResource, String uriEnvironment, String httpMethod) {
		//System.out.println("Trying to access method = " + httpMethod);
		
		Iterator<EndPoint> endpointInterator = endPoints.iterator();
		while (endpointInterator.hasNext()) {
			EndPoint endpoint = endpointInterator.next();
			List<Permission> permissions = endpoint.getPermissions();

			
			
			if ((uriResource.equals(endpoint.getUrl()))&&uriEnvironment.equals(endpoint.getEnvironment())){ //Gets the correct URL for permission of methods checking 
				Iterator<Permission> permissionInterator = permissions.iterator();
				while (permissionInterator.hasNext()) {
					Permission permission = permissionInterator.next();
					//System.out.println("Has access to method = " + permission.getPermission());
					if (httpMethod.equals(permission.getPermission()))
						return true;
				}
			}
		}
		return false;
	}
}

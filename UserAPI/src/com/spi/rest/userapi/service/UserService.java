package com.spi.rest.userapi.service;

import java.util.HashMap;

import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.spi.rest.accesscontrol.database.dynamo.general.DynamoBuilding;
import com.spi.rest.accesscontrol.database.general.AbstractDatabaseBuilding;
import com.spi.rest.accesscontrol.database.general.AbtractDatabaseObject;
import com.spi.rest.accesscontrol.model.user.User;





/** 
 * @desc this class holds functions to CRUD user JSON
 * examples include GetSpecificData(), CreateData(), UpdateData(), DeleteData()
 * @author Francisco Cardoso
*/

public class UserService implements UserProxy {
	Gson gson = new Gson();

	/**
	 * @desc get specific user JSON from database
	 * @param String userID    
	 * @return Response - JSON Object
	 */
	public Response GetSpecificData(String userID) {
		try{				
			AbstractDatabaseBuilding db = new DynamoBuilding();
			AbtractDatabaseObject user = db.requestTheDatabase("user");
			HashMap<String,Object> userHash = new HashMap<String,Object>();
			userHash.put("userID",userID);
			String result = user.read(userHash);
			return Response.status(200).header("Content-Length", result.length()).entity(result).build();
		}
		catch (Exception e){
			String result = "GetSpecificData Error - " + e.getMessage() ;
			return Response.status(500).entity(result).build();
		}
	}

	/**
	 * @desc saves user JSON in database 
	 * @param JSON object
	 *	 {
	 *	  "companyID": value,
	 *	  "userID": value,
	 *	  "status": value,
	 *	  "pass": value,
	 *	  "endPoints": [
	 *	    {
	 *	      "url": value,
	 *	      "environment": value,
	 *	      "permissions": [
	 *	        {
	 *	          "permission": value
	 *	        },
	 *	        {
	 *	          "permission": value
	 *	        }
	 *	      ]
	 *	    },
	 *	    {
	 *	      "url": value,
	 *	      "environment": value,
	 *	      "permissions": [
	 *	        {
	 *	          "permission": value
	 *	        },
	 *	        {
	 *	          "permission": value
	 *	        }
	 *	      ]
	 *	    }
	 *	  ]
	 *	}
	 * @return Response - success or failure
	 */
	public Response CreateData(User userData) {
		try{			
			AbstractDatabaseBuilding db = new DynamoBuilding();
			AbtractDatabaseObject user = db.requestTheDatabase("user");	
			HashMap<String,Object> userHash = new HashMap<String,Object>();
			userHash.put("userData",gson.toJson(userData));
			String result = user.create(userHash);  
			return Response.status(200).header("Content-Length", result.length()).entity(result).build();
		}catch(Exception e){
			String result = "CreateData Error - " + e.getMessage() ;
			return Response.status(500).entity(result).build();
		}
	}

	/**
	 * @desc updates a user record in database 
	 * @param String companyID, String userID, JSON object
	 *	 {
	 *	  "companyID": value,
	 *	  "userID": value,
	 *	  "status": value,
	 *	  "pass": value,
	 *	  "endPoints": [
	 *	    {
	 *	      "url": value,
	 *	      "environment": value,
	 *	      "permissions": [
	 *	        {
	 *	          "permission": value
	 *	        },
	 *	        {
	 *	          "permission": value
	 *	        }
	 *	      ]
	 *	    },
	 *	    {
	 *	      "url": value,
	 *	      "environment": value,
	 *	      "permissions": [
	 *	        {
	 *	          "permission": value
	 *	        },
	 *	        {
	 *	          "permission": value
	 *	        }
	 *	      ]
	 *	    }
	 *	  ]
	 *	}
	 * @return Response - success or failure
	 */	
	public Response UpdateData(String companyID, String userID, User userData) {
		try{			
			AbstractDatabaseBuilding db = new DynamoBuilding();
			AbtractDatabaseObject user = db.requestTheDatabase("user");				
			HashMap<String,Object> updateHash = new HashMap<String,Object>();
			updateHash.put("userID",userID);
			updateHash.put("companyID",companyID);
			updateHash.put("userDscValue", gson.toJson(userData));
			String result = user.update(updateHash);
			return Response.status(200).header("Content-Length", result.length()).entity(result).build();
		}catch(Exception e){
			String result = "UpdateData Error - " + e.getMessage() ;
			return Response.status(500).entity(result).build();
		}
	}


	/**
	 * @desc delete specific user record
	 * @param String companyID, String userID
	 * @return Response - success or failure
	 */
	public Response DeleteData(String companyID, String userID) {
		try{
			AbstractDatabaseBuilding db = new DynamoBuilding();
			AbtractDatabaseObject user = db.requestTheDatabase("user");				
			
			//Get the requested user info		
			HashMap<String,Object> userHash = new HashMap<String,Object>();
			userHash.put("userID",userID);
			String userDscValue = user.read(userHash);
			User userObject = gson.fromJson(userDscValue, User.class);
			
			//Update user status to "inactive"
			userObject.setStatus("inactive");	
			HashMap<String,Object> updateHash = new HashMap<String,Object>();
			updateHash.put("userID",userID);
			updateHash.put("companyID",companyID);
			updateHash.put("userDscValue",gson.toJson(userObject));
			user.update(updateHash);
			
			String result = "This item has been successfully deleted";
			return Response.status(200).header("Content-Length", result.length()).entity(result).build();
		}catch(Exception e){
			String result = "DeleteData Error - " + e.getMessage() ;
			return Response.status(500).entity(result).build();
		}
	}

}

package com.spi.rest.accesscontrol.database.dynamo.user;

import com.spi.rest.accesscontrol.database.dynamo.general.IHashIDField;

/** 
 * @desc this class is used for HashID of User object in DynamoDB
 * @author Francisco Cardoso
*/
public class UserIDField implements IHashIDField{
	
	/**
	 * @desc get the name of UserIDField. This is the matching IHashIDField for User object
	 * @param none
	 * @return String - UserIDField name
	*/
	public String toString(){
		return "UserID";
	}
}

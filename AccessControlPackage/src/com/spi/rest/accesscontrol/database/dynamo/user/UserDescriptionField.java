package com.spi.rest.accesscontrol.database.dynamo.user;

import com.spi.rest.accesscontrol.database.dynamo.general.IDescriptionField;

/** 
 * @desc this class is used for Description (full JSON) of User object in DynamoDB
 * @author Francisco Cardoso
*/
public class UserDescriptionField implements IDescriptionField{
	
	/**
	 * @desc get the name of UserDescriptionField. This is the matching IDescriptionField for User object
	 * @param none
	 * @return String - UserDescriptionField name
	*/
	public String toString(){
		return "UserDsc";
	}
}

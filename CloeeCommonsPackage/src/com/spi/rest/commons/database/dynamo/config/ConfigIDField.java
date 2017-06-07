package com.spi.rest.commons.database.dynamo.config;

import com.spi.rest.commons.database.dynamo.general.IHashIDField;

/** 
 * @desc this class is used for HashID of User object in DynamoDB
 * @author Francisco Cardoso
*/
public class ConfigIDField implements IHashIDField{
	
	/**
	 * @desc get the name of UserIDField. This is the matching IHashIDField for User object
	 * @param none
	 * @return String - UserIDField name
	*/
	public String toString(){
		return "configID";
	}
}

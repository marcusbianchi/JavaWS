package com.spi.rest.accesscontrol.database.dynamo.user;

import com.spi.rest.accesscontrol.database.dynamo.general.ISortIDField;

/** 
 * @desc this class is used for SortID of User object in DynamoDB
 * @author Francisco Cardoso
*/
public class CompanyIDField implements ISortIDField{
	
	/**
	 * @desc get the name of CompanyIDField. This is the matching ISortIDField for User object
	 * @param none
	 * @return String - CompanyIDField name
	*/
	public String toString(){
		return "CompanyID";
	}
}

package com.spi.rest.accesscontrol.database.dynamo.user;

import com.spi.rest.accesscontrol.database.dynamo.general.IDescriptionField;
import com.spi.rest.accesscontrol.database.dynamo.general.IDynamoFactory;
import com.spi.rest.accesscontrol.database.dynamo.general.IHashIDField;
import com.spi.rest.accesscontrol.database.dynamo.general.ISortIDField;

/** 
 * @desc this class holds functions to create the necessary attributes for the dynamoObject
 * examples include addHashIDField(), addSortIDField(), addDescriptionField()
 * @author Francisco Cardoso
*/
public class DynamoUserFactory implements IDynamoFactory{	
	
	/**
	 * @desc get the name of the HashID field in dynamoDb for user object
	 * @param none
	 * @return IHashIDField - Name of the HashID field
	 */
	public IHashIDField addHashIDField() {
		return new UserIDField();
	}	

	/**
	 * @desc get the name of the SortID field in dynamoDb for user object
	 * @param none
	 * @return ISortIDField - Name of the SortID field
	 */
	public ISortIDField addSortIDField() {
		return new CompanyIDField();
	}

	/**
	 * @desc get the name of the user description field in dynamoDb for user object
	 * @param none
	 * @return IDescriptionField - Name of the description field
	 */
	public IDescriptionField addDescriptionField() {
		return new UserDescriptionField();
	}
}

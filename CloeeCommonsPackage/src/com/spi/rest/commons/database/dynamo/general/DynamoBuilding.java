package com.spi.rest.commons.database.dynamo.general;


import com.spi.rest.commons.database.dynamo.config.DynamoConfig;
import com.spi.rest.commons.database.dynamo.config.DynamoConfigFactory;
import com.spi.rest.commons.database.general.AbstractDatabaseBuilding;
import com.spi.rest.commons.database.general.AbtractDatabaseObject;

/** 
 * @desc this class holds functions that act as an ordering mechanism for creating dynamoObjects that have a IHashIDField, OrderIDField and IDescriptionField
 * examples include makeDbObject()
 * @author Francisco Cardoso
*/
public class DynamoBuilding extends AbstractDatabaseBuilding{
	AbstractDynamoObject dynamoObj = null;	
		
	/**
	 * @desc define a dynamo database with the correct json object. The values of IHashIDField, OrderIDField and IDescriptionField will depend on the String entered
	 * @param String typeOfObject
	 * @return Database object - Dynamo database with the correct object
	 */
	protected AbtractDatabaseObject makeDbObject(String typeOfObject) {
		if (typeOfObject.equals("config")){
			IDynamoFactory atributesFactory = new DynamoConfigFactory();
			dynamoObj = new DynamoConfig(atributesFactory);
			dynamoObj.setName("config");			
		} 
		 return dynamoObj;
	}
}

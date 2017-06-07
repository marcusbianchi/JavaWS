package com.spi.rest.accesscontrol.database.dynamo.general;

import com.spi.rest.accesscontrol.database.dynamo.user.DynamoUser;
import com.spi.rest.accesscontrol.database.dynamo.user.DynamoUserFactory;
import com.spi.rest.accesscontrol.database.general.AbstractDatabaseBuilding;
import com.spi.rest.accesscontrol.database.general.AbtractDatabaseObject;


/**
 * @desc this class holds functions that act as an ordering mechanism for
 *       creating dynamoObjects that have a IHashIDField, OrderIDField and
 *       IDescriptionField examples include makeDbObject()
 * @author Francisco Cardoso
 */
public class DynamoBuilding extends AbstractDatabaseBuilding {
	AbstractDynamoObject dynamoObj = null;

	/**
	 * @desc define a dynamo database with the correct json object. The values
	 *       of IHashIDField, OrderIDField and IDescriptionField will depend on
	 *       the String entered
	 * @param String
	 *            typeOfObject
	 * @return Database object - Dynamo database with the correct object
	 */
	protected AbtractDatabaseObject makeDbObject(String typeOfObject) {
		if (typeOfObject.equals("user")) {
			IDynamoFactory atributesFactory = new DynamoUserFactory();
			dynamoObj = new DynamoUser(atributesFactory);
			dynamoObj.setName("config");
		}
		return dynamoObj;
	}
}

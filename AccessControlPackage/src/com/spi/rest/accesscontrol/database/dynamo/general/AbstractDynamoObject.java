package com.spi.rest.accesscontrol.database.dynamo.general;

import com.spi.rest.accesscontrol.database.general.AbtractDatabaseObject;

/** 
 * @desc this abstract class holds specifics of dynamoObject
 * @author Francisco Cardoso
*/
public abstract class AbstractDynamoObject extends AbtractDatabaseObject {
	protected IHashIDField hashIDfield;
	protected ISortIDField sortIDfield;
	protected IDescriptionField descriptionField;
	protected String hashIDvalue;
	protected String sortIDvalue;
	protected String descriptionValue;		

}

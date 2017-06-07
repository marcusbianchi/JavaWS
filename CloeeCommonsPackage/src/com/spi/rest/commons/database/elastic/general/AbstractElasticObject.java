package com.spi.rest.commons.database.elastic.general;

import com.spi.rest.commons.database.general.AbtractDatabaseObject;

/** 
 * @desc this abstract class holds specifics of elasticObject
 * @author Francisco Cardoso
*/
public abstract class AbstractElasticObject extends AbtractDatabaseObject {
	protected IIndexField indexField;
	protected ITypeField typeField;
	protected String indexValue;
	protected String typeValue;

}

package com.spi.rest.accesscontrol.database.dynamo.general;

/** 
 * @desc this interface holds functions to create the necessary attributes for the dynamoObject
 * examples include addHashIDField(), addSortIDField(), addDescriptionField()
 * @author Francisco Cardoso
*/
public interface IDynamoFactory {
	public IHashIDField addHashIDField();
	public ISortIDField addSortIDField();
	public IDescriptionField addDescriptionField();
}

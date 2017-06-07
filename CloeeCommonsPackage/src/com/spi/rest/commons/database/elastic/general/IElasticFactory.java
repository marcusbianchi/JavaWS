package com.spi.rest.commons.database.elastic.general;


/** 
 * @desc this interface holds functions to create the necessary attributes for the elasticObject
 * examples include addIndexField(), addTypeField()
 * @author Francisco Cardoso
*/
public interface IElasticFactory {
	public IIndexField addIndexField();
	public ITypeField addTypeField();
}

package com.spi.rest.commons.database.elastic.general;

import com.spi.rest.commons.database.elastic.event.ElasticEvent;
import com.spi.rest.commons.database.elastic.event.ElasticEventFactory;
import com.spi.rest.commons.database.elastic.machine.ElasticMachine;
import com.spi.rest.commons.database.elastic.machine.ElasticMachineFactory;
import com.spi.rest.commons.database.general.AbstractDatabaseBuilding;
import com.spi.rest.commons.database.general.AbtractDatabaseObject;

/** 
 * @desc this class holds functions that act as an ordering mechanism for creating elasticObjects that have a IIndexField and ITypeField
 * examples include makeDbObject()
 * @author Francisco Cardoso
*/
public class ElasticBuilding extends AbstractDatabaseBuilding{
	AbstractElasticObject elasticObj = null;	
		
	/**
	 * @desc define an elasticsearch database with the correct json object. The values of IIndexField and ITypeField will depend on the String entered
	 * @param String typeOfObject
	 * @return Database object - Dynamo database with the correct object
	 */
	protected AbtractDatabaseObject makeDbObject(String typeOfObject) {
		if (typeOfObject.equals("machine")){
			IElasticFactory atributesFactory = new ElasticMachineFactory();
			elasticObj = new ElasticMachine(atributesFactory);
			elasticObj.setName("machine");			
		}	
		if (typeOfObject.equals("event")){
			IElasticFactory atributesFactory = new ElasticEventFactory();
			elasticObj = new ElasticEvent(atributesFactory);
			elasticObj.setName("event");			
		}	
		 return elasticObj;
	}
}

package com.spi.rest.commons.database.elastic.machine;

import com.spi.rest.commons.database.elastic.general.IElasticFactory;
import com.spi.rest.commons.database.elastic.general.IIndexField;
import com.spi.rest.commons.database.elastic.general.ITypeField;


/** 
 * @desc this class holds functions to create the necessary attributes for the elasticObject
 * examples include addIndexField(), addTypeField()
 * @author Francisco Cardoso
*/
public class ElasticMachineFactory implements IElasticFactory{	
	
	/**
	 * @desc get the name of the IIndexField in elasticsearch for machine object
	 * @param none
	 * @return IIndexField - Name of the IIndexField field
	 */
	public IIndexField addIndexField() {
		return new MachineIndexField();
	}	

	/**
	 * @desc get the name of the ITypeField  in elasticsearch for machine object
	 * @param none
	 * @return ITypeField - Name of the ITypeField field
	 */
	public ITypeField addTypeField() {
		return new MachineTypeField();
	}	
}

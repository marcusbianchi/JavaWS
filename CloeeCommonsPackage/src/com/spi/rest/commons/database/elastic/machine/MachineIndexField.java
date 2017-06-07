package com.spi.rest.commons.database.elastic.machine;

import com.spi.rest.commons.database.elastic.general.IIndexField;

/** 
 * @desc this class is used for IIndexField of Machine object in elasticsearch
 * @author Francisco Cardoso
*/
public class MachineIndexField implements IIndexField{
	
	/**
	 * @desc get the name of MachineIndexField. This is the matching IIndexField for Machine object
	 * @param none
	 * @return String - MachineIndexField name
	*/
	public String toString(){
		return "cloee";
	}
}

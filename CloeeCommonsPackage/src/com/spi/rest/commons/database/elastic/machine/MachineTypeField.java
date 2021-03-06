package com.spi.rest.commons.database.elastic.machine;

import com.spi.rest.commons.database.elastic.general.ITypeField;

/** 
 * @desc this class is used for ITypeField of Machine object in elasticsearch
 * @author Francisco Cardoso
*/
public class MachineTypeField implements ITypeField{
	
	/**
	 * @desc get the name of MachineTypeField. This is the matching ITypeField for Machine object
	 * @param none
	 * @return String - MachineTypeField name
	*/
	public String toString(){
		return "machine";
	}
}

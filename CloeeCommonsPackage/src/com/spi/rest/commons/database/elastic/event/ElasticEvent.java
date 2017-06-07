package com.spi.rest.commons.database.elastic.event;

import java.util.Map;

import com.google.gson.Gson;
import com.spi.rest.commons.database.elastic.general.IElasticFactory;
import com.spi.rest.commons.database.elastic.general.AbstractElasticObject;
import com.spi.rest.commons.database.elastic.general.ElasticOperations;

/** 
 * @desc this class holds functions to start a new elasticObject and CRUD operations
 * examples include startDbObject(), read(), upsert()
 * @author Francisco Cardoso
*/
public class ElasticEvent extends AbstractElasticObject {
	IElasticFactory elasticFactory;
	ElasticOperations ElasticOperations = new ElasticOperations();
	Gson gson = new Gson();

	/**
	 * @desc this constructor defines a elasticFactory
	 * @param none
	 * @return none
	 */
	public ElasticEvent(IElasticFactory elasticFactory) {
		this.elasticFactory = elasticFactory;
	}

	/**
	 * @desc start field values of ids and description using elasticFactory 
	 * @param none
	 * @return none
	 */
	protected void startDbObject() {
		indexField = elasticFactory.addIndexField();
		typeField = elasticFactory.addTypeField();
	}
	
	/**
	 * @desc update machine record on elasticsearch
	 * @param String documentID, String descriptionValue
	 * @return String - Response entity
	 * @throws Exception 
	 */
	private String upsert(String documentID, String descriptionValue) throws Exception {
		return ElasticOperations.elasticUpsert(indexField.toString(), typeField.toString(), documentID, descriptionValue);
	}

	/**
	 * @desc update machine record on elasticsearch
	 * @parameters List of Parametes <String,Objet> must contain "documentID" and "descriptionValue" as keys
	 * @return String - Response entity
	 * @throws Exception 
	 */
	public String create(Map<String, Object> parameters) throws Exception {
		String documentID = (String) parameters.get("documentID");
		String descriptionValue = (String) parameters.get("descriptionValue");
		return upsert(documentID,descriptionValue);
	}

	/**
	 * @desc update machine record on elasticsearch
	 * @parameters List of Parametes <String,Objet> must contain "documentID" as key
	 * @return String - Response entity
	 * @throws Exception 
	 */
	public String read(Map<String, Object> parameters) throws Exception {
		String documentID = (String) parameters.get("documentID");
		return ElasticOperations.getSpecific(indexField.toString(), typeField.toString(), documentID);

	}

	/**
	 * @desc update machine record on elasticsearch
	 * @parameters List of Parametes <String,Objet> must contain "documentID" and "descriptionValue" as keys
	 * @return String - Response entity
	 * @throws Exception 
	 */
	public String update(Map<String, Object> parameters) throws Exception {
		String documentID = (String) parameters.get("documentID");
		String descriptionValue = (String) parameters.get("descriptionValue");
		return upsert(documentID,descriptionValue);
	}

	/**
	 * @desc NOT IMPLEMENTED YE	
	 */
	public String delete(Map<String, Object> parameters) throws Exception {		
		return null;
	}	
}

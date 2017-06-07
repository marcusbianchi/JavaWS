package com.spi.rest.commons.database.dynamo.config;

import java.util.Map;

import com.google.gson.Gson;
import com.spi.rest.commons.database.dynamo.general.IDynamoFactory;
import com.spi.rest.commons.model.config.Config;
import com.spi.rest.commons.database.dynamo.general.AbstractDynamoObject;
import com.spi.rest.commons.database.dynamo.general.DynamoOperations;

/** 
 * @desc this class holds functions to start a new AbstractDynamoObject and CRUD operations
 * examples include getName(), setName(), startDbObject(), create(), read(), update(), delete()
 * @author Francisco Cardoso
*/
public class DynamoConfig extends AbstractDynamoObject {
	IDynamoFactory dynamoFactory;
	DynamoOperations dynamoOperations = new DynamoOperations();
	Gson gson = new Gson();

	/**
	 * @desc this constructor defines a dynamoFactory
	 * @param none
	 * @return none
	 */
	public DynamoConfig(IDynamoFactory dynamoFactory) {
		this.dynamoFactory = dynamoFactory;
	}

	/**
	 * @desc start field values of ids and description using dynamoFactory 
	 * @param none
	 * @return none
	 */
	protected void startDbObject() {
		hashIDfield = dynamoFactory.addHashIDField();
		sortIDfield = dynamoFactory.addSortIDField();
		descriptionField = dynamoFactory.addDescriptionField();
	}

	
	/**
	 * @desc create new config record on dynamo
	 * @param String configString
	 * @return String - Response entity
	 */
	public String create(Map<String, Object> parameters) throws Exception {
		if(parameters.containsKey("config")){
			Config config = gson.fromJson((String) parameters.get("config"), Config.class);
			hashIDvalue = config.getMeta().getCollectorId();
			sortIDvalue = config.getMeta().getDateUpdated();
			descriptionValue = (String) parameters.get("config");

			return dynamoOperations.create("usersource", hashIDfield.toString(), hashIDvalue, sortIDfield.toString(),
					sortIDvalue, descriptionField.toString(), descriptionValue);
			}
			else{
				throw new IllegalArgumentException();
			}
	}

	public String read(Map<String, Object> parameters) throws Exception {
		String configID = (String) parameters.get("configID");
		return dynamoOperations.read("configdata", hashIDfield.toString(), configID, descriptionField.toString());
	}

	/**
	 * @desc update config record on dynamo
	 * @param String hashIDvalue, String sortIDvalue, String descriptionValue, String configString
	 * @return String - Response entity
	 */
	public String update(Map<String, Object> parameters) throws Exception {
		if(parameters.containsKey("config")){
			Config config = gson.fromJson("config", Config.class);
			String exhashIDvalue = config.getMeta().getCollectorId();
			String exsortIDvalue = config.getMeta().getDateUpdated();
			String exdescriptionValue = (String) parameters.get("config");
		return dynamoOperations.update("configdata", hashIDfield.toString(), exhashIDvalue, sortIDfield.toString(), exsortIDvalue, descriptionField.toString(), exdescriptionValue);
		}
		else{
			throw new IllegalArgumentException();
		}
	}

	/**
	 * @desc delete config record on dynamo
	 * @param String hashIDvalue, String sortIDvalue
	 * @return String - Response entity
	 */
	public String delete(Map<String, Object> parameters) throws Exception {
		return null;
	}
}

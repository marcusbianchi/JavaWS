package com.spi.rest.accesscontrol.database.dynamo.user;

import java.util.Map;

import com.google.gson.Gson;
import com.spi.rest.accesscontrol.database.dynamo.general.AbstractDynamoObject;
import com.spi.rest.accesscontrol.database.dynamo.general.DynamoOperations;
import com.spi.rest.accesscontrol.database.dynamo.general.IDynamoFactory;
import com.spi.rest.accesscontrol.model.user.User;

/**
 * @desc this class holds functions to start a new AbstractDynamoObject and CRUD
 *       operations examples include getName(), setName(), startDbObject(),
 *       create(), read(), update(), delete()
 * @author Francisco Cardoso
 */
public class DynamoUser extends AbstractDynamoObject {
	IDynamoFactory dynamoFactory;
	DynamoOperations dynamoOperations = new DynamoOperations();
	Gson gson = new Gson();

	/**
	 * @desc this constructor defines a dynamoFactory
	 * @param none
	 * @return none
	 */
	public DynamoUser(IDynamoFactory dynamoFactory) {
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
	 * @desc update machine record on elasticsearch
	 * @parameters List of Parametes <String,Objet> must contain "userData" as keys
	 * @return String - Response entity
	 * @throws Exception 
	 */
	public String create(Map<String, Object> parameters) throws Exception {
		if (parameters.containsKey("userData")) {
			User user = gson.fromJson((String) parameters.get("userData"), User.class);
			hashIDvalue = user.getUserID();
			sortIDvalue = user.getCompanyID();
			descriptionValue = (String) parameters.get("userData");

			return dynamoOperations.create("usersource", hashIDfield.toString(), hashIDvalue, sortIDfield.toString(),
					sortIDvalue, descriptionField.toString(), descriptionValue);
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	/**
	 * @desc update machine record on elasticsearch
	 * @parameters List of Parametes <String,Objet> must contain "userID" as keys
	 * @return String - Response entity
	 * @throws Exception 
	 */
	public String read(Map<String, Object> parameters) throws Exception {
		String UserID = (String) parameters.get("userID");
		return dynamoOperations.read("usersource", hashIDfield.toString(), UserID, descriptionField.toString());
	}

	/**
	 * @desc update machine record on elasticsearch
	 * @parameters List of Parametes <String,Objet> must contain "userID","companyID" and "userDscValue" as keys
	 * @return String - Response entity
	 * @throws Exception 
	 */
	public String update(Map<String, Object> parameters) throws Exception {
		
		String exhashIDvalue = (String) parameters.get("userID");
		String exsortIDvalue = (String) parameters.get("companyID");
		String exdescriptionValue = (String) parameters.get("userDscValue");
		return dynamoOperations.update("usersource", hashIDfield.toString(), exhashIDvalue, sortIDfield.toString(),
				exsortIDvalue, descriptionField.toString(), exdescriptionValue);
	}

	/**
	 * @desc NOT IMPLEMENTED YET
	 */
	public String delete(Map<String, Object> parameters) throws Exception {
		return null;
	}
}

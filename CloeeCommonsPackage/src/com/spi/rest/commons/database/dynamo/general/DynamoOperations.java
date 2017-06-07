package com.spi.rest.commons.database.dynamo.general;

import java.io.IOException;
import java.util.Iterator;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.ItemCollection;
import com.amazonaws.services.dynamodbv2.document.QueryOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.spec.QuerySpec;
import com.amazonaws.services.dynamodbv2.document.spec.UpdateItemSpec;
import com.amazonaws.services.dynamodbv2.document.utils.NameMap;
import com.amazonaws.services.dynamodbv2.document.utils.ValueMap;
import com.amazonaws.services.dynamodbv2.model.ReturnValue;
import com.spi.rest.commons.property.PropertyGetValues;

/**
 * @desc this class holds CRUD functions for DynamoDB * examples include
 *       create(),read(),update(),delete()
 * @author Francisco Cardoso
 */
public class DynamoOperations {
	AWSCredentials credentials;
	AmazonDynamoDBClient dynamoClient;

	/**
	 * @desc class constructor method sets the needed credentials for AWS
	 *       resources
	 * @param none
	 * @return none
	 */
	public DynamoOperations() {
		credentials = new DefaultAWSCredentialsProviderChain().getCredentials();
		dynamoClient = new AmazonDynamoDBClient(credentials);
		dynamoClient.setRegion(Region.getRegion(Regions.US_WEST_2));
	}

	/**
	 * @desc read JSON from DynamoDB
	 * @param String tableEndPoint, String idField, String idValue, String dscField
	 * @return String - JSON Object
	 */
	public String read(String tableEndPoint,String idField, String idValue, String dscField) {
		Table table = getTable(tableEndPoint);
		String userString = "{ }";

		QuerySpec spec = new QuerySpec().withProjectionExpression(dscField)
				.withKeyConditionExpression(idField + " = :v_id").withValueMap(new ValueMap().withString(":v_id", idValue));
		ItemCollection<QueryOutcome> items = table.query(spec);

		Iterator<Item> iterator = items.iterator();
		while (iterator.hasNext()) {
			userString = iterator.next().get(dscField).toString();
		}

		return userString;
	}

	/**
	 * @desc insert JSON in DynamoDB
	 * @param String tableEndPoint, String hashIDfield, String hashIDvalue, String sortIDfield, String sortIDvalue, String dscField, String dscValue
	 * @return String - Response entity
	 */

	public String create(String tableEndPoint, String hashIDfield, String hashIDvalue, String sortIDfield, String sortIDvalue, String dscField, String dscValue) {
		Table table = getTable(tableEndPoint);
		Item item = new Item();

		item.withPrimaryKey(hashIDfield, hashIDvalue).withKeyComponent(sortIDfield, sortIDvalue)
				.withString(dscField, dscValue); 
		table.putItem(item);

		return "New itens have been successfully created";
	}

	/**
	 * @desc update JSON in DynamoDB
	 * @param String tableEndPoint, String hashIDfield, String hashIDvalue, String sortIDfield, String sortIDvalue, String dscField, String dscValue
	 * @return String - Response entity
	 */
	public String update(String tableEndPoint, String hashIDfield, String hashIDvalue, String sortIDfield, String sortIDvalue, String dscField, String dscValue)  {
		Table table = getTable(tableEndPoint);
	
         UpdateItemSpec updateItemSpec = new UpdateItemSpec()
         .withPrimaryKey(hashIDfield, hashIDvalue, sortIDfield, sortIDvalue)
         .withUpdateExpression("set #na = :val1")
         .withNameMap(new NameMap()
             .with("#na", dscField))
         .withValueMap(new ValueMap()
             .withString(":val1", dscValue))
         .withReturnValues(ReturnValue.ALL_NEW);

         table.updateItem(updateItemSpec);

		return "This item has been successfully updated";
	}

	public void delete(String tableEndPoint, String hashIDfield, String hashIDvalue, String sortIDfield, String sortIDvalue, String dscField, String dscValue) {		
	}

	private Table getTable(String tableEndPoint) {
		PropertyGetValues endpoint = new PropertyGetValues();
		String tableName = "";
		
		try {
			tableName = endpoint.getPropertyValue(tableEndPoint);
		} catch (IOException e) {
			e.printStackTrace();
		}

		DynamoDB dynamoDB = new DynamoDB(dynamoClient);
		Table table = dynamoDB.getTable(tableName);
		return table;
	}
}

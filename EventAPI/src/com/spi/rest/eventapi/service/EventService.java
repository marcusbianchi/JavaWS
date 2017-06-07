package com.spi.rest.eventapi.service;

import java.util.HashMap;

import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.spi.rest.commons.database.elastic.general.ElasticBuilding;
import com.spi.rest.commons.database.general.AbstractDatabaseBuilding;
import com.spi.rest.commons.database.general.AbtractDatabaseObject;
import com.spi.rest.commons.model.event.Event;

/**
 * @desc this class holds functions to CRUD EventAPI JSON.
 * examples include GetSpecificData(), UpdateData(), DeleteData()
 * @author Francisco Cardoso
 */

public class EventService implements EventProxy {
	Gson gson = new Gson();

	/**
	 * @desc get specific eventAPI JSON from database
	 * @param String
	 *            eventID
	 * @return Response - JSON Object
	 */
	public Response GetSpecificData(String eventID) {
		try {
			AbstractDatabaseBuilding db = new ElasticBuilding();
			AbtractDatabaseObject event =  db.requestTheDatabase("event");
			HashMap<String, Object> eventHash = new HashMap<String, Object>();
			eventHash.put("documentID", eventID);
			String result = event.read(eventHash);
			return Response.status(200).header("Content-Length", result.length()).entity(result).build();			
		
		} catch (Exception e) {
			String result = "GetSpecificData Error - " + e.getMessage();
			return Response.status(500).entity(result).build();
		}
	}

	/**
	 * @desc saves event JSON in database 
	 * @param JSON object
	 *	 {
	 *	  {
   	 * 		"eventID": value,
   	 *      "eventName": value,
     *      "companyID":" value,
     *      "status": value,
     *      "description": value,
     *      "model": value,
   	 *      "brand": value,   
	 *	    "triggers":[
	 *	      {
	 *	         "eventType": ,
	 *	         "conditions":[
	 *	            {
	 *	               "tag": value,
	 *	               "operator": value,
	 *	               "value": value,
	 *	               "multiplier": value
	 * 	            }
	 *	         ]
	 *	      }
	 *	   ],
	 *	   "eventAdditionalProperties":[
	 *	      {
	 *	         "propertyName": value,
	 *	         "propertyValue": value
	 *	      }
	 *	   ]
	 *	}
	 * @return Response - success or failure
	 */
	public Response UpdateData(String eventID, Event eventData) {
		try {
			AbstractDatabaseBuilding db = new ElasticBuilding();
			AbtractDatabaseObject event =  db.requestTheDatabase("event");	
			HashMap<String, Object> eventHash = new HashMap<String, Object>();
			eventHash.put("documentID", eventID);
			eventHash.put("descriptionValue", gson.toJson(eventData));
			String result = event.update(eventHash);
			//String result = "{}";
			return Response.status(200).header("Content-Length", result.length()).entity(result).build();
		} catch (Exception e) {
			String result = "UpdateData Error - " + e.getMessage();
			return Response.status(500).entity(result).build();
		}
	}

	/**
	 * @desc change status from active to inactive of a specific event record
	 * @param String eventID
	 * @return Response - success or failure
	 */
	/*public Response DeleteData(String eventID) {
		try {
			AbstractDatabaseBuilding db = new ElasticBuilding();
			AbstractElasticObject event = (AbstractElasticObject) db.requestTheDatabase("event");	
			
			//Get the requested event info			
			String EventDscValue = event.read(eventID);
			Event eventObject = gson.fromJson(EventDscValue, Event.class);
			
			//Update event status to "inactive"
			eventObject.setStatus("inactive");			
			EventDscValue = gson.toJson(eventObject);			
			event.upsert(eventID, EventDscValue);			
			String result = "This item has been successfully deleted";
			
			return Response.status(200).header("Content-Length", result.length()).entity(result).build();
		} catch (Exception e) {
			String result = "DeleteData Error - " + e.getMessage();
			return Response.status(500).entity(result).build();
		}
	}*/
}

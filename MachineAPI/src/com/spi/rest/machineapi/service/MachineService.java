package com.spi.rest.machineapi.service;

import java.util.HashMap;

import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.spi.rest.commons.database.elastic.general.AbstractElasticObject;
import com.spi.rest.commons.database.elastic.general.ElasticBuilding;
import com.spi.rest.commons.database.general.AbstractDatabaseBuilding;
import com.spi.rest.commons.database.general.AbtractDatabaseObject;
import com.spi.rest.commons.model.machine.Machine;

/**
 * @desc this class holds functions to CRUD MachineAPI JSON.
 * examples include GetSpecificData(), UpdateData(), DeleteData()
 * @author Francisco Cardoso
 */

public class MachineService implements MachineProxy {
	Gson gson = new Gson();

	/**
	 * @desc get specific machineAPI JSON from database
	 * @param String
	 *            machineID
	 * @return Response - JSON Object
	 */
	public Response GetSpecificData(String machineID) {
		try {
			AbstractDatabaseBuilding db = new ElasticBuilding();
			AbtractDatabaseObject machine = db.requestTheDatabase("machine");
			HashMap<String, Object> machineHash = new HashMap<String, Object>();
			machineHash.put("documentID", machineID);
			String result = machine.read(machineHash);
			return Response.status(200).header("Content-Length", result.length()).entity(result).build();
		} catch (Exception e) {
			String result = "GetSpecificData Error - " + e.getMessage();
			return Response.status(500).entity(result).build();
		}
	}

	/**
	 * @desc saves machine JSON in database 
	 * @param JSON object
	 *	 {
	 *	  {
   	 * 		"machineID": value,
   	 *      "machineName": value,
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
	 *	   "machineAdditionalProperties":[
	 *	      {
	 *	         "propertyName": value,
	 *	         "propertyValue": value
	 *	      }
	 *	   ]
	 *	}
	 * @return Response - success or failure
	 */
	public Response UpdateData(String machineID, Machine machineData) {
		try {
			AbstractDatabaseBuilding db = new ElasticBuilding();
			AbstractElasticObject machine = (AbstractElasticObject) db.requestTheDatabase("machine");
			HashMap<String, Object> machineHash = new HashMap<String, Object>();
			machineHash.put("documentID", machineID);
			machineHash.put("descriptionValue", gson.toJson(machineData));
			String result = machine.update(machineHash);
			//String result = "{}";
			return Response.status(200).header("Content-Length", result.length()).entity(result).build();
		} catch (Exception e) {
			String result = "UpdateData Error - " + e.getMessage();
			return Response.status(500).entity(result).build();
		}
	}

	/**
	 * @desc change status from active to inactive of a specific machine record
	 * @param String machineID
	 * @return Response - success or failure
	 */
	public Response DeleteData(String machineID) {
		try {
			AbstractDatabaseBuilding db = new ElasticBuilding();
			AbtractDatabaseObject machine =  db.requestTheDatabase("machine");	
			
			//Get the requested machine info		
			HashMap<String, Object> machineHash = new HashMap<String, Object>();
			machineHash.put("documentID", machineID);
			String MachineDscValue = machine.read(machineHash);
			Machine machineObject = gson.fromJson(MachineDscValue, Machine.class);
			
			//Update machine status to "inactive"
			machineObject.setStatus("inactive");			
			MachineDscValue = gson.toJson(machineObject);
			HashMap<String, Object> machineHashUpdate = new HashMap<String, Object>();
			machineHash.put("documentID", machineID);
			machineHash.put("descriptionValue", gson.toJson(MachineDscValue));
			machine.update(machineHashUpdate);		
			String result = "This item has been successfully deleted";
			
			return Response.status(200).header("Content-Length", result.length()).entity(result).build();
		} catch (Exception e) {
			String result = "DeleteData Error - " + e.getMessage();
			return Response.status(500).entity(result).build();
		}
	}
}

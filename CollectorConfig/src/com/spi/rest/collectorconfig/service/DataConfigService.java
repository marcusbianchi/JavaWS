package com.spi.rest.collectorconfig.service;

import java.util.HashMap;

import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.spi.rest.commons.database.dynamo.general.DynamoBuilding;
import com.spi.rest.commons.database.general.AbstractDatabaseBuilding;
import com.spi.rest.commons.database.general.AbtractDatabaseObject;
import com.spi.rest.commons.model.config.Config;


/**
 * @desc this class holds functions to CRUD collectorConfig JSON examples
 *       include GetSpecificData(), CreateData(), UpdateData(), DeleteData()
 * @author Francisco Cardoso
 */

public class DataConfigService implements DataConfigProxy {
	Gson gson = new Gson();

	/**
	 * @desc get specific configJSON from database
	 * @param String
	 *            configID
	 * @return Response - JSON Object
	 */
	public Response GetSpecificData(String configID) {
		try {
			AbstractDatabaseBuilding db = new DynamoBuilding();
			AbtractDatabaseObject config = db.requestTheDatabase("config");
			HashMap<String, Object> configHash = new HashMap<String, Object>();
			configHash.put("configID", configID);
			String result = config.read(configHash);
			return Response.status(200).header("Content-Length", result.length()).entity(result).build();
		} catch (Exception e) {
			String result = "GetSpecificData Error - " + e.getMessage();
			return Response.status(500).entity(result).build();
		}
	}

	/**
	 * @desc saves configJSON in database
	 * @param JSON
	 *            object { "timeStamp": value, "configID": value, "status":
	 *            value, "pass": value, "endPoints": [ { "url": value,
	 *            "environment": value, "permissions": [ { "permission": value
	 *            }, { "permission": value } ] }, { "url": value, "environment":
	 *            value, "permissions": [ { "permission": value }, {
	 *            "permission": value } ] } ] }
	 * @return Response - success or failure
	 */
	public Response CreateData(Config ConfigData) {
		try {
			AbstractDatabaseBuilding db = new DynamoBuilding();
			AbtractDatabaseObject config = db.requestTheDatabase("config");
			HashMap<String,Object> configHash = new HashMap<String,Object>();
			configHash.put("config",gson.toJson(ConfigData));
			String result = config.create(configHash);
			return Response.status(200).header("Content-Length", result.length()).entity(result).build();
		} catch (Exception e) {
			String result = "CreateData Error - " + e.getMessage();
			return Response.status(500).entity(result).build();
		}
	}


	public Response UpdateData(String timeStamp, String configID, Config ConfigData) {
		return null;
	}


	public Response DeleteData(String timeStamp, String configID) {
		return null;
	}

}

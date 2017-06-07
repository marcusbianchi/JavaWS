package com.spi.rest.datacapturing.service;

import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.spi.rest.datacapturing.model.GlobalData;


public class DataCapturingService implements RecieveDataProxy {	
	private SendToSNS snsSend; 
	
	public Response testeGet() {
		return Response.status(200).entity("Conexão SSL está ok!!!").build();
	}

	public Response RecieveData(GlobalData globalRecievedData) {
		try {
			Gson gson =  new Gson();
			String outputString = gson.toJson(globalRecievedData);        
			snsSend = new SendToSNS();    		   
			return Response.status(200).header("Content-Length", outputString.length()).entity(snsSend.PublishData(outputString).toString()).build();
		} catch (Exception e) {
			return Response.status(500).entity(e.toString()).build();
		}
	}	
}

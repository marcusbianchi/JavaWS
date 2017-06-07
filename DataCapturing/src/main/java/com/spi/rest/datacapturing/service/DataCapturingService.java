package com.spi.rest.datacapturing.service;

import javax.ws.rs.core.Response;
import com.spi.rest.commons.model.GlobalData;
import com.spi.rest.commons.s3.S3Handler;


/** 
 * @desc this class represents the point of contact between DataDistributor and Cloud APIs
 * @desc holds functions to receive collected data from a JSON and send them to AWS SNS * 
 * examples include receiveData()
 * @author Francisco Cardoso
*/
public class DataCapturingService implements DataCapturingProxy {	
	//private SendToSNS snsSend;
	private S3Handler S3Send;
	
	/**
	 * @desc DO NOT USE IN PRODUCTION - is used only for communication testing
	 * @param none
	 * @return Response - success or failure
	 */
	public Response testeGet() {
		try {
			String retorno = "{\"Teste\":\"Conexao SSL funcionando!!!\"}";
			return Response.status(200).header("Content-Length", retorno.length()).entity(retorno).build();
		} catch (Exception e) {
			return Response.status(500).entity(e.toString()).build();
		}
	}	

	/**
	 * @desc receives JSON from DataDistributor and send to SNS 
	 * @param JSON object
	 * {
	 * "accountID": value,
	 * "dataSourceID": value,
	 * "registeredEquipment": [
	 *   {
	 *     "equipmentID": value,
	 *     "measuredDataList": [
	 *       {
	 *         "tag": value,
	 *         "value": value,
	 *         "timeStampTicks": value
	 *       }        
	 *     ]
	 *   }
	 * ]  
	 *}
	 * @return Response - success or failure
	 */
	public Response RecieveData(GlobalData globalRecievedData) {		
		try {
			
			S3Send = new S3Handler();
			S3Send.createFile(globalRecievedData);
			return Response.status(200).header("Content-Length","Arquivo criado com sucesso!".length())
					.entity("Arquivo criado com sucesso!").build();
			/*return Response.status(200).header("Content-Length", outputString.length())
					.entity(snsSend.PublishData(outputString).toString()).build();*/
		} catch (Exception e) {
			return Response.status(500).entity(e.toString()).build();
		}
	}
}

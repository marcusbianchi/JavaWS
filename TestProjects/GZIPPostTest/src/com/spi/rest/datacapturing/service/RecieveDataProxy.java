package com.spi.rest.datacapturing.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.GZIP;

import com.spi.rest.datacapturing.model.GlobalData;

@Path("/datacapturingservice")
public interface RecieveDataProxy {
	@GET
	//@Produces(MediaType.APPLICATION_JSON)
	Response testeGet();
	
	@POST
	@Path("/capture")	
	@Consumes(MediaType.APPLICATION_JSON)
	Response RecieveData(@GZIP GlobalData globalRecievedData);

}
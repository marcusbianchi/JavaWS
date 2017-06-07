package com.spi.rest.datacapturing.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.GZIP;

import com.spi.rest.commons.model.GlobalData;

/** 
 * @desc this interface is a proxy which holds JAX-RS annotations 
 * examples include @Path, @Produces, @Consumes, @GET, @POST, @GZIP
 * @author Francisco Cardoso
*/

@Path("/datacapturingservice")
public interface DataCapturingProxy {
	@GET
	@GZIP
	@Produces(MediaType.APPLICATION_JSON)
	Response testeGet();
	
	@POST	
	@Consumes(MediaType.APPLICATION_JSON)
	Response RecieveData(@GZIP GlobalData globalRecievedData);

}
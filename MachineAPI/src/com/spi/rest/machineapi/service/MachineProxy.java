package com.spi.rest.machineapi.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.GZIP;

import com.spi.rest.commons.model.machine.Machine;


/** 
 * @desc this interface is a proxy which holds JAX-RS annotations 
 * examples include @Path, @Produces, @Consumes, @GET, @POST, @GZIP
 * @author Francisco Cardoso
*/

@Path("/machine")
public interface MachineProxy {
	@GET
	@Path("{machineID}")
	@Produces(MediaType.APPLICATION_JSON)
	@GZIP
	Response GetSpecificData(@PathParam("machineID") String machineID);	

	@PUT
	@Path("{machineID}")
	@Consumes(MediaType.APPLICATION_JSON)
	Response UpdateData(@PathParam("machineID") String machineID, Machine machineData);	
	
	@DELETE
	@Path("{machineID}")
	Response DeleteData(@PathParam("machineID") String machineID);	
}
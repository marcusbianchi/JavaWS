package com.spi.rest.eventapi.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.GZIP;

import com.spi.rest.commons.model.event.Event;





/** 
 * @desc this interface is a proxy which holds JAX-RS annotations 
 * examples include @Path, @Produces, @Consumes, @GET, @POST, @GZIP
 * @author Francisco Cardoso
*/

@Path("/event")
public interface EventProxy {
	@GET
	@Path("{eventID}")
	@Produces(MediaType.APPLICATION_JSON)
	@GZIP
	Response GetSpecificData(@PathParam("eventID") String eventID);	

	@PUT
	@Path("{eventID}")
	@Consumes(MediaType.APPLICATION_JSON)
	Response UpdateData(@PathParam("eventID") String eventID, Event eventData);	
	
	/*@DELETE
	@Path("{eventID}")
	Response DeleteData(@PathParam("eventID") String eventID);	*/
}
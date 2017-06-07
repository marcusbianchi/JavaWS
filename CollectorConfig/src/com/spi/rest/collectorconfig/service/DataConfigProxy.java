package com.spi.rest.collectorconfig.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.GZIP;

import com.spi.rest.commons.model.config.Config;

/** 
 * @desc this interface is a proxy which holds JAX-RS annotations 
 * examples include @Path, @Produces, @Consumes, @GET, @POST, @GZIP
 * @author Francisco Cardoso
*/

@Path("/configservice")
public interface DataConfigProxy {
	@GET
	@Path("{configID}")
	@Produces(MediaType.APPLICATION_JSON)
	@GZIP
	Response GetSpecificData(@PathParam("configID") String configID);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	Response CreateData(@GZIP Config ConfigData);
	
	@PUT
	@Path("{timeStamp}-{configID}")
	@Consumes(MediaType.APPLICATION_JSON)
	Response UpdateData(@PathParam("timeStamp") String companyID,@PathParam("configID") String configID, @GZIP Config configData);	
	
	@DELETE
	@Path("{companyID}-{configID}")
	Response DeleteData(@PathParam("timeStamp") String companyID, @PathParam("configID") String configID);	

}
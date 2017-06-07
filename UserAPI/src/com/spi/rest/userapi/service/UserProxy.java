package com.spi.rest.userapi.service;

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

import com.spi.rest.accesscontrol.model.user.User;




/** 
 * @desc this interface is a proxy which holds JAX-RS annotations 
 * examples include @Path, @Produces, @Consumes, @GET, @POST, @GZIP
 * @author Francisco Cardoso
*/

@Path("/user")
public interface UserProxy {
	@GET
	@Path("{userID}")
	@Produces(MediaType.APPLICATION_JSON)
	@GZIP
	Response GetSpecificData(@PathParam("userID") String userID);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	Response CreateData(@GZIP User userData);
	
	@PUT
	@Path("{companyID}-{userID}")
	@Consumes(MediaType.APPLICATION_JSON)
	Response UpdateData(@PathParam("companyID") String companyID,@PathParam("userID") String userID, @GZIP User userData);	
	
	@DELETE
	@Path("{companyID}-{userID}")
	Response DeleteData(@PathParam("companyID") String companyID, @PathParam("userID") String userID);	

}
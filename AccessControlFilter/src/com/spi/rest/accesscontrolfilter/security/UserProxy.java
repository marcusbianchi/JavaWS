package com.spi.rest.accesscontrolfilter.security;

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


@Path("/user")
public interface UserProxy {
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@GZIP
	Response GetSpecificData(@PathParam("id") String UserID);

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	Response CreateData(@GZIP User userData);
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	Response UpdateData(@PathParam("id") int UserID, @GZIP User userData);	
	
	@DELETE
	@Path("{id}")
	Response DeleteData(@PathParam("id") int UserID);	

}
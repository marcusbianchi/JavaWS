package com.spi.servlet.test;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.GZIP;


public interface RecievingDataInterface {
	
	@GET
	@GZIP 
	public Response getCustomer();
	
	@GET
	@GZIP 
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public RecievingData getCustomer(@PathParam("id") int id);
	
	@POST	
	@GZIP
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createCustomer(@GZIP RecievingData customer);
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public void updateCustomer(@PathParam("id") int id, @GZIP RecievingData cust);
}

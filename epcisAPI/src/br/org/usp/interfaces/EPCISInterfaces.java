package br.org.usp.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.jboss.resteasy.annotations.GZIP;

import br.org.usp.models.EPCISDocumentType;

@Path("/epcis/")
public interface EPCISInterfaces {
		
	@POST	
	@Consumes(MediaType.TEXT_XML)
	Response RecieveData(@GZIP EPCISDocumentType EPCISDocumentEvent);

}

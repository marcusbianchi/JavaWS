package br.org.usp.services;

import javax.ws.rs.core.Response;

import br.org.usp.interfaces.EPCISInterfaces;
import br.org.usp.models.EPCISDocumentType;

public class EPCISService implements EPCISInterfaces{

	public Response RecieveData(EPCISDocumentType EPCISDocumentEvent) {
		try {
			String retorno = "{\"Teste\":\"XML OK Conexao OK!!!\"} Hash: " + EPCISDocumentEvent.hashCode();
			return Response.status(200).header("Content-Length", retorno.length()).entity(retorno).build();
		} catch (Exception e) {
			return Response.status(500).entity(e.toString()).build();
		}
	}

}

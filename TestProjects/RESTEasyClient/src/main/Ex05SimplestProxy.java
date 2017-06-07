package main;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.UriBuilder;

import org.jboss.resteasy.client.ClientRequestFactory;

/**
 * A very simple demonstration of proxy usage
 * 
 * @author William Antônio
 * 
 */
public class Ex05SimplestProxy {

	public static void main(String[] args) throws Exception {

		// A factory for the Twitter REST API
		ClientRequestFactory crf = new ClientRequestFactory(UriBuilder.fromUri(
				"http://www.mastertheboss.com").build());
		MasterJBoss mb = crf.createProxy(MasterJBoss.class);
		System.out.println(mb.resteasyTutorial());
	}
	
	@Path("/web-interfaces")
	public static interface MasterJBoss{
		@GET
		@Path("273-resteasy-tutorial-.html")
		public String resteasyTutorial();		
	}
}

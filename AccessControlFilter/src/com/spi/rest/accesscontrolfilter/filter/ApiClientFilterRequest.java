package com.spi.rest.accesscontrolfilter.filter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;

import org.apache.commons.codec.binary.Base64;

import com.spi.rest.accesscontrolfilter.property.ApiSecurityProperties;

/**
 * @desc this class represents a filter which holds functions with the purpose
 *       of adding a credential header for the request examples include filter()
 * @author Francisco Cardoso
 */
public class ApiClientFilterRequest implements ClientRequestFilter {
	ApiSecurityProperties credentialReader = new ApiSecurityProperties();

	/**
	 * @desc is used for adding authorization header based on user credentials (base64)
	 * @param ClientRequestContent - The HTTP request
	 * @return none
	 */

	public void filter(ClientRequestContext requestContext) throws IOException {		
		String credentials = credentialReader.getCredentials();
		String base64credentials = Base64.encodeBase64String(credentials.getBytes(StandardCharsets.UTF_8));
		requestContext.getHeaders().add("Authorization", "Basic " + base64credentials);
	}
}

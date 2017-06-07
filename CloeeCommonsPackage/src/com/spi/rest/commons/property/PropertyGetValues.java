package com.spi.rest.commons.property;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

/**
 * @desc this class holds functions for getting endpoint values from properties
 *       sources examples include getEndpointValue()
 * @author Francisco Cardoso
 */
public class PropertyGetValues {
	String result = "";
	InputStream inputStream;

	/**
	 * @desc get value of an endpoint from config.properties file
	 * @param String
	 *            endpoint - endpoint property key name
	 * @return String - endpoint property mapped value
	 */
	public String getPropertyValue(String endpoint) throws IOException {
		try {
			Properties prop = new Properties();
			String propFileName = "config.properties";

			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
			return prop.getProperty(endpoint); // get the property value
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
		return result;
	}

	/**
	 * @desc gets property value from a different source than config.properties
	 *       file
	 * @param String
	 *            endpoint - endpoint property key name, String strObjectData -
	 *            Content with properties keys and values
	 * @return String - endpoint property mapped value
	 */
	public String getPropertyValue(String endpoint, String strObjectData) throws IOException {
		InputStream objectData = null;
		try {
			Properties prop = new Properties();
			objectData = new ByteArrayInputStream(strObjectData.getBytes(StandardCharsets.UTF_8));
			if (objectData != null) {
				prop.load(objectData);
			}
			return prop.getProperty(endpoint); // get the property value
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			objectData.close();
		}
		return result;
	}
}

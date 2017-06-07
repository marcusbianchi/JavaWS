package com.spi.rest.accesscontrolfilter.s3;

import java.io.InputStream;

import org.apache.commons.io.IOUtils;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.spi.rest.accesscontrolfilter.property.PropertyGetValues;


/**
 * @desc this class holds functions to send data to AWS S3 
 * * examples include
 *       createFile()
 * @author Francisco Cardoso
 */
public class S3Handler {
	AWSCredentials credentials;
	AmazonS3 s3client;

	/**
	 * @desc class constructor method sets the needed credentials for AWS
	 *       resources
	 * @param none
	 * @return none
	 */
	public S3Handler() {
		credentials = new DefaultAWSCredentialsProviderChain().getCredentials();
		s3client = new AmazonS3Client(credentials);
	}

	/**
	 * @desc TEMPORARIO, PRECISA SUBSTITUIR TODAS AS CHAMADAS DESSE METODO PARA O METODO BAIXO
	 * @param 
	 * @return
	 * */
	public String getFileValue(String uriPath) {
		PropertyGetValues property = new PropertyGetValues();
		PropertyGetValues endpoint;
		String bucketName;
		String keyName;
		String value = "";

		try {
			endpoint = new PropertyGetValues();
			bucketName = endpoint.getPropertyValue("cloeeadmin");
			keyName = "environments.txt";
			S3Object object = s3client.getObject(new GetObjectRequest(bucketName, keyName));
			
			InputStream objectData = object.getObjectContent();
			String strObjectData = IOUtils.toString(objectData, "UTF-8");
			value = property.getPropertyValue(uriPath, strObjectData);

			objectData.close();

		} catch (Exception e) {

		}
		return value;
	}
	
	
	/**
	 * @desc 
	 * @param 
	 * @return
	 * */
	public String getFileValue(String bucketName, String fileName, String propertyName) {
		PropertyGetValues property = new PropertyGetValues();
	
		String value = "";

		try {
			S3Object object = s3client.getObject(new GetObjectRequest(bucketName, fileName));
			
			InputStream objectData = object.getObjectContent();
			String strObjectData = IOUtils.toString(objectData, "UTF-8");
			value = property.getPropertyValue(propertyName, strObjectData);

			objectData.close();

		} catch (Exception e) {

		}
		return value;
	}

	
}

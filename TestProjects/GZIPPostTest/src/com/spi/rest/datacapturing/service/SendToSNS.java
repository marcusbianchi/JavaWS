package com.spi.rest.datacapturing.service;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;

public class SendToSNS {
	AWSCredentials credentials;
	AmazonSNSClient snsClient;

	public SendToSNS() {
		credentials = new DefaultAWSCredentialsProviderChain().getCredentials();
		snsClient = new AmazonSNSClient(credentials);
		/*snsClient = new AmazonSNSClient();*/
		snsClient.setRegion(Region.getRegion(Regions.US_WEST_2));
	}

	public PublishResult PublishData(String dataToSend) {
		PublishRequest publishRequest = new PublishRequest("arn:aws:sns:us-west-2:729525659113:FromCaptureToDB",
				dataToSend);
		PublishResult publishResult = snsClient.publish(publishRequest);
		return publishResult;
	}

}

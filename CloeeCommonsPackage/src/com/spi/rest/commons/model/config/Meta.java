package com.spi.rest.commons.model.config;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="meta")
public class Meta {
	
	private String dateUpdated;
	private String userUpdated;
	private String accountId;
	private String collectorId;
	
	@XmlElement(name="dateUpdated")
	public String getDateUpdated() {
		return dateUpdated;
	}
	public void setDateUpdated(String dateUpdated) {
		this.dateUpdated = dateUpdated;
	}
	
	@XmlElement(name="userUpdated")
	public String getUserUpdated() {
		return userUpdated;
	}
	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}
	@XmlElement(name="accountId")
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	@XmlElement(name="collectorId")
	public String getCollectorId() {
		return collectorId;
	}
	public void setCollectorId(String collectorId) {
		this.collectorId = collectorId;
	}
	
}

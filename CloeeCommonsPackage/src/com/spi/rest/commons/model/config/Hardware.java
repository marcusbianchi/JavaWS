package com.spi.rest.commons.model.config;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="hardware")
public class Hardware {
	
	private String dbHost;
	private String dbName;
	private String dbUser;
	private String dbPass;
	
	private String urlCloudDataReceiver;
	private String urlCloudTimeSync;
	private String urlCloudConfig;
	
	private int timeWaitUntilTrySendAgain;
	private int timeWaitUntilNextCollect;
	private int timeWaitUntilNextRefreshConfigs;
	
	private int maxQuantityTrySend;
	private int minQuantitySignalsSend;
	private boolean showDebugLogs;
	
	@XmlElement(name="dbHost")
	public String getDbHost() {
		return dbHost;
	}
	public void setDbHost(String dbHost) {
		this.dbHost = dbHost;
	}
	@XmlElement(name="dbName")
	public String getDbName() {
		return dbName;
	}
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	@XmlElement(name="dbUser")
	public String getDbUser() {
		return dbUser;
	}
	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}
	@XmlElement(name="dbPass")
	public String getDbPass() {
		return dbPass;
	}
	public void setDbPass(String dbPass) {
		this.dbPass = dbPass;
	}
	@XmlElement(name="urlCloudDataReceiver")
	public String getUrlCloudDataReceiver() {
		return urlCloudDataReceiver;
	}
	public void setUrlCloudDataReceiver(String urlCloudDataReceiver) {
		this.urlCloudDataReceiver = urlCloudDataReceiver;
	}
	@XmlElement(name="urlCloudTimeSync")
	public String getUrlCloudTimeSync() {
		return urlCloudTimeSync;
	}
	public void setUrlCloudTimeSync(String urlCloudTimeSync) {
		this.urlCloudTimeSync = urlCloudTimeSync;
	}
	@XmlElement(name="urlCloudConfig")
	public String getUrlCloudConfig() {
		return urlCloudConfig;
	}
	public void setUrlCloudConfig(String urlCloudConfig) {
		this.urlCloudConfig = urlCloudConfig;
	}
	@XmlElement(name="timeWaitUntilTrySendAgain")
	public int getTimeWaitUntilTrySendAgain() {
		return timeWaitUntilTrySendAgain;
	}
	public void setTimeWaitUntilTrySendAgain(int timeWaitUntilTrySendAgain) {
		this.timeWaitUntilTrySendAgain = timeWaitUntilTrySendAgain;
	}
	@XmlElement(name="timeWaitUntilNextCollect")
	public int getTimeWaitUntilNextCollect() {
		return timeWaitUntilNextCollect;
	}
	public void setTimeWaitUntilNextCollect(int timeWaitUntilNextCollect) {
		this.timeWaitUntilNextCollect = timeWaitUntilNextCollect;
	}
	@XmlElement(name="timeWaitUntilNextRefreshConfigs")
	public int getTimeWaitUntilNextRefreshConfigs() {
		return timeWaitUntilNextRefreshConfigs;
	}
	public void setTimeWaitUntilNextRefreshConfigs(
			int timeWaitUntilNextRefreshConfigs) {
		this.timeWaitUntilNextRefreshConfigs = timeWaitUntilNextRefreshConfigs;
	}
	@XmlElement(name="maxQuantityTrySend")
	public int getMaxQuantityTrySend() {
		return maxQuantityTrySend;
	}
	public void setMaxQuantityTrySend(int maxQuantityTrySend) {
		this.maxQuantityTrySend = maxQuantityTrySend;
	}
	@XmlElement(name="minQuantitySignalsSend")
	public int getMinQuantitySignalsSend() {
		return minQuantitySignalsSend;
	}
	public void setMinQuantitySignalsSend(int minQuantitySignalsSend) {
		this.minQuantitySignalsSend = minQuantitySignalsSend;
	}
	@XmlElement(name="showDebugLogs")
	public boolean isShowDebugLogs() {
		return showDebugLogs;
	}
	public void setShowDebugLogs(boolean showDebugLogs) {
		this.showDebugLogs = showDebugLogs;
	}
}

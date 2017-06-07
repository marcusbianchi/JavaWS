package com.spi.rest.commons.model.config;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="signal")
@XmlType(propOrder={"number","signalType","valueType", "timeRefresh", "active", "address"})
@XmlSeeAlso({Address.class})
public class Signal {
	
	private long number;
	private String signalType;
	private String valueType;
	private int timeRefresh;
	private boolean active;
	private Address address;
	
	public Signal() {
	}
	
	public Signal(long number, String signalType, String valueType, int timeRefresh, boolean active, Address address){
		this.number = number;
		this.signalType = signalType;
		this.valueType = valueType;
		this.timeRefresh = timeRefresh;
		this.active = active;
		this.address = address;
	}
	
	
	@XmlAttribute(name="number")
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	
	@XmlAttribute(name="signalType")
	public String getSignalType() {
		return signalType;
	}
	public void setSignalType(String signalType) {
		this.signalType = signalType;
	}
	
	@XmlAttribute(name="valueType")
	public String getValueType() {
		return valueType;
	}
	
	public void setValueType(String valueType) {
		this.valueType = valueType;
	}
	
	@XmlAttribute(name="timeRefresh")
	public int getTimeRefresh() {
		return timeRefresh;
	}
	public void setTimeRefresh(int timeRefresh) {
		this.timeRefresh = timeRefresh;
	}
	
	@XmlAttribute(name="active")
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	@XmlElement(name="address")
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}

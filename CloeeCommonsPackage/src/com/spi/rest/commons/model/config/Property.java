package com.spi.rest.commons.model.config;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name="prop")
@XmlType(propOrder={"number","name"})
public class Property {
	private long number;
	private String name;
	private String value;
	
	public Property() {	
	}
	
	public Property(long number, String name, String value){
		this.number = number;
		this.name = name;
		this.value = value;
	}
	
	@XmlAttribute(name="number")
	public long getNumber() {
		return number;
	}
	
	public void setNumber(long number) {
		this.number = number;
	}
	
	@XmlElement(name="name")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlValue
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
}

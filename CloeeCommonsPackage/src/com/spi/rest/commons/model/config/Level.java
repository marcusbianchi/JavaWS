package com.spi.rest.commons.model.config;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name="level")
public class Level {
	
	private int number;
	private String value;
	
	public Level() {
	}
	
	public Level(int number, String value){
		this.number = number;
		this.setValue(value);
	}
	
	@XmlAttribute(name="number")
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	@XmlValue
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}

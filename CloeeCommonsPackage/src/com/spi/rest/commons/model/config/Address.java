package com.spi.rest.commons.model.config;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name = "address")
@XmlSeeAlso({ Level.class })
public class Address {

	private List<Level> levels;
	private List<Property> properties;

	public Address() {
	}

	public Address(List<Level> levels, List<Property> properties) {
		this.levels = levels;
		this.properties = properties;
	}

	@XmlElement(name = "prop")
	@XmlElementWrapper(name = "props")
	public List<Property> getProperties() {
		return properties;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}

	public Address(List<Level> levels) {
		this.levels = levels;
	}

	@XmlElement(name = "level")
	@XmlElementWrapper(name = "levels")
	public List<Level> getLevels() {
		return levels;
	}

	public void setLevels(List<Level> levels) {
		this.levels = levels;
	}

}

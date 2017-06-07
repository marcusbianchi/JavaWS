package com.spi.rest.commons.model.config;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="config")
@XmlType(propOrder={"meta","signals"})
@XmlSeeAlso({Meta.class, Signal.class})
public class Config {
	
	private Meta meta;
	private Hardware hardware;
	private List<Signal> signals;
	
	public Config() {
	}
	
	public Config(Meta meta, List<Signal> signals){
		this.meta = meta;
		this.signals = signals;
	}
	
	@XmlElement(name="meta")
	public Meta getMeta() {
		return meta;
	}
	public void setMeta(Meta meta) {
		this.meta = meta;
	}
	
	@XmlElement(name="hardware")
	public Hardware getHardware() {
		return hardware;
	}
	public void setHardware(Hardware hardware) {
		this.hardware = hardware;
	}
	
	@XmlElement(name="signal")
	@XmlElementWrapper( name="signals" )
	public List<Signal> getSignals() {
		return signals;
	}
	public void setSignals(List<Signal> signals) {
		this.signals = signals;
	}
}

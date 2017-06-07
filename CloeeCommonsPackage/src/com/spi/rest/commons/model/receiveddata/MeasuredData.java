package com.spi.rest.commons.model.receiveddata;

public class MeasuredData {
	private String tag;
	private String value;
	private long timeStampTicks;
	
	public MeasuredData() {	
	}
	
	public MeasuredData(String tag, String value, long timeStampTicks) {
		super();
		this.tag = tag;
		this.value = value;
		this.timeStampTicks = timeStampTicks;
	}
	
	public long getTimeStampTicks() {
		return timeStampTicks;
	}
	public void setTimeStampTicks(long timeStampTicks) {
		this.timeStampTicks = timeStampTicks;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
}

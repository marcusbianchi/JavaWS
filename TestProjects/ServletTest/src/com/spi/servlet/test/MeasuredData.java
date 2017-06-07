package com.spi.servlet.test;


public class MeasuredData {
	
	private String tag;
	private double value;
	private long timeStampTicks;
	
	public MeasuredData() {	
	}
	
	public MeasuredData(String tag, double value, long timeStampTicks) {
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
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
}

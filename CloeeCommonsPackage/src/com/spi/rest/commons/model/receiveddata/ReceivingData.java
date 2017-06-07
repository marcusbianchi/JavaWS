package com.spi.rest.commons.model.receiveddata;

import java.util.ArrayList;

public class ReceivingData {	

	private ArrayList<MeasuredData> measuredDataList = new ArrayList<MeasuredData>();
	private int equipmentID;
	
	public ReceivingData() {	
	}
	
	public ReceivingData(int equipmentID,ArrayList<MeasuredData> measuredDataList) {
		super();
		this.equipmentID = equipmentID;
		this.measuredDataList = measuredDataList;
	}
	
	public int getEquipmentID() {
		return equipmentID;
	}	
	public void setEquipmentID(int equipmentID) {
		this.equipmentID = equipmentID;
	}
	
	public ArrayList<MeasuredData> getMeasuredDataList() {
		return measuredDataList;
	}
	public void setMeasuredDataList(ArrayList<MeasuredData> measuredDataList) {
		this.measuredDataList = measuredDataList;
	}
	
}

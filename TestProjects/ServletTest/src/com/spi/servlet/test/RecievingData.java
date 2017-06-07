package com.spi.servlet.test;


import java.util.ArrayList;

public class RecievingData {
	
	private int accountID;
	private int equipmentID;
	private ArrayList<MeasuredData> measuredDataList = new ArrayList<MeasuredData>();
	
	public ArrayList<MeasuredData> getMeasuredDataList() {
		return measuredDataList;
	}
	public void setMeasuredDataList(ArrayList<MeasuredData> measuredDataList) {
		this.measuredDataList = measuredDataList;
	}
	public int getEquipmentID() {
		return equipmentID;
	}
	public void setEquipmentID(int equipmentID) {
		this.equipmentID = equipmentID;
	}
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
}

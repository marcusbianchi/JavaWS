

import java.util.ArrayList;

public class GlobalData {
	
	private int accountID;
	private int dataSourceID;
	private ArrayList<ReceivingData> registeredEquipment = new ArrayList<ReceivingData>();
	
	
	public GlobalData() {	
	}
	
	public GlobalData(int dataSourceID,int accountID,ArrayList<ReceivingData> registeredEquipment) {	
		super();
		this.dataSourceID = dataSourceID;
		this.accountID = accountID;
		this.registeredEquipment = registeredEquipment;
	}
	
	public int getdataSourceID() {
		return dataSourceID;
	}	
	public void setdataSourceID(int dataSourceID) {
		this.dataSourceID = dataSourceID;
	}
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public ArrayList<ReceivingData> getRegisteredEquipment() {
		return registeredEquipment;
	}
	public void setRegisteredEquipment(ArrayList<ReceivingData> registeredEquipment) {
		this.registeredEquipment = registeredEquipment;
	}
	
	
}

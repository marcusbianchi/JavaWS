package com.spi.rest.accesscontrol.database.general;

/** 
 * @desc this abstract class holds functions that act as an ordering mechanism for creating a certain type of database
 * examples include makeDbObject()
 * @author Francisco Cardoso
*/
public abstract class AbstractDatabaseBuilding {
	protected abstract AbtractDatabaseObject makeDbObject(String typeOfObject);

	/**
	 * @desc define a database with the correct json object
	 * @param String typeOfObject
	 * @return Database object - desired database with the correct object
	 */
	public AbtractDatabaseObject requestTheDatabase(String typeOfObject) {
		AbtractDatabaseObject db = makeDbObject(typeOfObject);
		db.startDbObject();

		return db;
	}

}

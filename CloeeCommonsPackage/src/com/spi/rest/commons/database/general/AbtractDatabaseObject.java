package com.spi.rest.commons.database.general;

import java.util.Map;

/**
 * @desc this abstract class holds functions to start a new databaseObject and
 *       CRUD operations examples include getName(), setName(), startDbObject(),
 *       create(), read(), update(), delete()
 * @author Francisco Cardoso
 */
public abstract class AbtractDatabaseObject {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	protected abstract void startDbObject();

	abstract public String create(Map<String, Object> parameters) throws Exception;

	abstract public String read(Map<String, Object> parameters) throws Exception;

	abstract public String update(Map<String, Object> parameters) throws Exception;

	abstract public String delete(Map<String, Object> parameters) throws Exception;

}

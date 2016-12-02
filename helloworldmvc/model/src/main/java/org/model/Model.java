package org.model;

import org.contract.IModel;

public class Model implements IModel {
	
	private DAOHelloWorld dao = DAOHelloWorld.getInstance();
	
	public String getHelloWorld() {
		return this.dao.getQuerySelectFirstHelloWorld();
	}
}

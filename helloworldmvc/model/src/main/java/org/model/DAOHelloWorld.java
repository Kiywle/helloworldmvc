package org.model;

import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class DAOHelloWorld {
	private static DAOHelloWorld INSTANCE = new DAOHelloWorld();
	@SuppressWarnings("unused")
	private static String LOGIN;
	@SuppressWarnings("unused")
	private static String PASSWORD;
	@SuppressWarnings("unused")
	private static String URL;
	@SuppressWarnings("unused")
	private String connection;
	@SuppressWarnings("unused")
	private Statement statement;
	
	private DAOHelloWorld() {
		
	}
	
	public static DAOHelloWorld getInstance() {
		return DAOHelloWorld.INSTANCE;
	}
	
	public String getQuerySelectFirstHelloWorld() {
		return "Hello World";
	}
	
	protected void close() {
		
	}
	
	protected ResultSet executeQuery(String query) {
		return null;
	}
	
	protected boolean open() {
		return true;
	}	
}

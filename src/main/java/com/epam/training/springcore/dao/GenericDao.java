package com.epam.training.springcore.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.epam.training.springcore.database.DatabaseConnection;

public abstract class GenericDao {
	
	@Autowired
	protected DatabaseConnection databaseConnection;

	public DatabaseConnection getDatabaseConnection() {
		return databaseConnection;
	}
	
	
	public void setDatabaseConnection(DatabaseConnection databaseConnection) {
		this.databaseConnection = databaseConnection;
	}
	
}

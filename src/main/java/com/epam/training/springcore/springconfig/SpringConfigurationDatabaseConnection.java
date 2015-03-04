package com.epam.training.springcore.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.epam.training.springcore.database.DatabaseConnection;

@Configuration
public class SpringConfigurationDatabaseConnection {

	@Bean
	public DatabaseConnection databaseConnection(){
		return new DatabaseConnection();
	}
}

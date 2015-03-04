package com.epam.training.springcore.dao;

import java.util.Map;

public class CharacterAttributeDao extends GenericDao {

	public CharacterAttributeDao() {

	}

	public Map<String,Integer> getAllCharacterAttributes() {
		return databaseConnection.getAllCharacterAttributes();
	}
}

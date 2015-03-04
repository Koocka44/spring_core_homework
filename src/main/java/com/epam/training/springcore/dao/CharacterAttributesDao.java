package com.epam.training.springcore.dao;

import java.util.List;

import com.epam.training.springcore.model.CharacterAttributes;

public class CharacterAttributesDao extends GenericDao {

	public CharacterAttributesDao() {

	}

	public List<CharacterAttributes> getAllCharacterAttributes() {
		return databaseConnection.getAllCharacterAttributes();
	}
}

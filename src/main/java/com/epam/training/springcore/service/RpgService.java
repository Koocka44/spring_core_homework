package com.epam.training.springcore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.epam.training.springcore.dao.CharacterAttributesDao;
import com.epam.training.springcore.dao.WeaponDao;
import com.epam.training.springcore.model.Character;
import com.epam.training.springcore.model.CharacterAttributes;
import com.epam.training.springcore.model.Weapon;

public class RpgService {
	
	@Autowired
	private WeaponDao weaponDao;
	
	@Autowired
	private CharacterAttributesDao characterAttributesDao;
	
	public RpgService(){
		
	}

	public WeaponDao getWeaponDao() {
		return weaponDao;
	}

	public void setWeaponDao(WeaponDao weaponDao) {
		this.weaponDao = weaponDao;
	}

	public CharacterAttributesDao getCharacterAttributeDao() {
		return characterAttributesDao;
	}

	public void setCharacterAttributeDao(CharacterAttributesDao characterAttributeDao) {
		this.characterAttributesDao = characterAttributeDao;
	}
	
	public List<Character> buildCharacters(){
		List<Character> characterList = new ArrayList<Character>();
		for(CharacterAttributes attributes : characterAttributesDao.getAllCharacterAttributes()){
			String name = attributes.getName();
			Integer hp = attributes.getHp();
			Weapon weapon = weaponDao.getWeaponForName(name);
			characterList.add(new Character(name,hp,weapon));
		}
		return characterList;
	}
}

package com.epam.training.springcore.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;

import com.epam.training.springcore.dao.CharacterAttributeDao;
import com.epam.training.springcore.dao.WeaponDao;
import com.epam.training.springcore.model.Weapon;
import com.epam.training.springcore.model.Character;

public class RpgService {
	
	@Autowired
	private WeaponDao weaponDao;
	
	@Autowired
	private CharacterAttributeDao characterAttributeDao;
	
	public RpgService(){
		
	}

	public WeaponDao getWeaponDao() {
		return weaponDao;
	}

	public void setWeaponDao(WeaponDao weaponDao) {
		this.weaponDao = weaponDao;
	}

	public CharacterAttributeDao getCharacterAttributeDao() {
		return characterAttributeDao;
	}

	public void setCharacterAttributeDao(CharacterAttributeDao characterAttributeDao) {
		this.characterAttributeDao = characterAttributeDao;
	}
	
	public List<Character> buildCharacters(){
		List<Character> characterList = new ArrayList<Character>();
		for(Entry<String,Integer> entry : characterAttributeDao.getAllCharacterAttributes().entrySet()){
			String name = (String) entry.getKey();
			Integer hp = (Integer) entry.getValue();
			Weapon weapon = weaponDao.getWeaponForName(name);
			characterList.add(new Character(name,hp,weapon));
		}
		return characterList;
	}
}

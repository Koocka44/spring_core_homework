package com.epam.training.springcore.database;

import java.util.ArrayList;
import java.util.List;

import com.epam.training.springcore.model.CharacterAttributes;
import com.epam.training.springcore.model.Weapon;

public class DatabaseConnection {
	
	private static final Weapon ASHBRINGER = new Weapon("Ashbringer", 72);
	private static final Weapon THUNDERFURY = new Weapon("Thunderfury", 86);
	private static final Weapon STICK = new Weapon("Stick", 1);
	
	private static final CharacterAttributes MOGRAINE = new CharacterAttributes("Highlord Mograine",80);
	private static final CharacterAttributes THUNDERAAN = new CharacterAttributes("Thunderaan",93);
	private static final CharacterAttributes BELA = new CharacterAttributes("Béla",93);
	
	public DatabaseConnection(){
		System.out.println("Database connected");
	}
	
	public List<Weapon> getAllWeapons(){
		List<Weapon> weaponList = new ArrayList<Weapon>();
		weaponList.add(ASHBRINGER);
		weaponList.add(THUNDERFURY);
		weaponList.add(STICK);
		return weaponList;
	}
	
	public Weapon getWeaponForName(String name){
		Weapon weapon = null;
		switch(name){
			case "Highlord Mograine":
				weapon = ASHBRINGER;
				break;
			case "Thunderaan":
				weapon = THUNDERFURY;
				break;
			default:
				weapon = STICK;
				break;
		}
		return weapon;
	}

	public List<CharacterAttributes> getAllCharacterAttributes() {
		List<CharacterAttributes> attributes = new ArrayList<CharacterAttributes>();
		attributes.add(MOGRAINE);
		attributes.add(THUNDERAAN);
		attributes.add(BELA);
		return attributes;
	}
	
}

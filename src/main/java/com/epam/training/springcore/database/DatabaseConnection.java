package com.epam.training.springcore.database;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.epam.training.springcore.model.Weapon;

public class DatabaseConnection {
	
	private static final Weapon ASHBRINGER = new Weapon("Ashbringer", 72);
	private static final Weapon THUNDERFURY = new Weapon("Thunderfury", 86);
	private static final Weapon STICK = new Weapon("Stick", 1);
	
	private static final Entry<String, Integer> MOGRAINE = new SimpleEntry<String, Integer>("Highlord Mograine",80);
	private static final Entry<String, Integer> THUNDERAAN = new SimpleEntry<String, Integer>("Thunderaan",93);
	private static final Entry<String, Integer> BELA = new SimpleEntry<String, Integer>("Béla",93);
	
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

	public Map<String,Integer> getAllCharacterAttributes() {
		Map<String,Integer> attributes = new HashMap<String,Integer>();
		attributes.put(MOGRAINE.getKey(), MOGRAINE.getValue());
		attributes.put(THUNDERAAN.getKey(), THUNDERAAN.getValue());
		attributes.put(BELA.getKey(), BELA.getValue());
		return attributes;
	}
	
}

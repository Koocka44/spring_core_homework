package com.epam.training.springcore.dao;

import java.util.List;

import com.epam.training.springcore.model.Weapon;

public class WeaponDao extends GenericDao{

	public WeaponDao() {
		super();
	}
	
	public List<Weapon> getAllWeapons(){
		return databaseConnection.getAllWeapons();
	}
	
	public Weapon getWeaponForName(String name){
		return databaseConnection.getWeaponForName(name);
	}
	
}

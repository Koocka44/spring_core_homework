package com.epam.training.springcore.model;

public class Character {
	private String name;
	private int hp;
	private Weapon weapon;
	
	public Character(final String name, final int hp, final Weapon weapon) {
		this.name = name;
		this.hp = hp;
		this.weapon = weapon;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHp() {
		return hp;
	}
	
	public Weapon getWeapon() {
		return weapon;
	}
	
	@Override
	public String toString() {
		return "Character['" + name + "'," + hp + "," + weapon + "]";
	}
}

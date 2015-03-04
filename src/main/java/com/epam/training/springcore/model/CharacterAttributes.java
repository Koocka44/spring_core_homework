package com.epam.training.springcore.model;

public class CharacterAttributes {

	private final String name;
	private final int hp;

	public CharacterAttributes(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

}

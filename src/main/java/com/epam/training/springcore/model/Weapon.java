package com.epam.training.springcore.model;

public class Weapon {
	private String name;
	private int hit;

	public Weapon(final String name, final int hit) {
		this.name = name;
		this.hit = hit;
	}

	public String getName() {
		return name;
	}
	
	public int getHit() {
		return hit;
	}
	
	@Override
	public String toString() {
		return "Weapon['" + name + "'," + hit + "]";
	}
}

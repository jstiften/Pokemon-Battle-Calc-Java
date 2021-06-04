package pokemon;

import type.Type;

public class Pokemon {

	private String name;
	private Type type1;
	private Type type2;
	private int hp;
	private int attack;
	private int defense;
	private int spAttack;
	private int spDefense;
	private int speed;
	
	public Pokemon(String name, Type type1, Type type2, int hp, int attack, int defense, int spAttack, int spDefense, int speed) {
		this.name = name;
		this.type1 = type1;
		this.type2 = type2;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.spAttack = spAttack;
		this.spDefense = spDefense;
		this.speed = speed;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(final String name) {
		this.name = name;
	}
	
	public Type getType1() {
		return this.type1;
	}
	
	public void setType1(final Type type1) {
		this.type1 = type1;
	}
	
	public Type getType2() {
		return this.type2;
	}
	
	public void setType2(final Type type2) {
		this.type2 = type2;
	}
	
	public int getHP() {
		return this.hp;
	}
	
	public void setHP(final int hp) {
		this.hp = hp;
	}
	
	public int getAttack() {
		return this.attack;
	}
	
	public void setAttack(final int attack) {
		this.attack = attack;
	}
	
	public int getDefense() {
		return this.defense;
	}
	
	public void setDefense(final int defense) {
		this.defense = defense;
	}
	
	public int getSpAttack() {
		return this.spAttack;
	}
	
	public void setSpAttack(final int spAttack) {
		this.spAttack = spAttack;
	}
	
	public int getSpDefense() {
		return this.spDefense;
	}
	
	public void setSpDefense(final int spDefense) {
		this.spDefense = spDefense;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(final int speed) {
		this.speed = speed;
	}
}

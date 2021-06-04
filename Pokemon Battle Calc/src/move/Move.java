package move;

import type.Type;

public class Move {

	private String name;
	private Type type;
	private int power;
	private int accuracy;
	
	public Move(String name, Type type, int power, int accuracy) {
		this.name = name;
		this.type = type;
		this.power = power;
		this.accuracy = accuracy;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(final String name) {
		this.name = name;
	}
	
	public Type getType() {
		return this.type;
	}
	
	public void setType(final Type type) {
		this.type = type;
	}
	
	public int getPower() {
		return this.power;
	}
	
	public void setPower(final int power) {
		this.power = power;
	}
	
	public int getAccuracy() {
		return this.accuracy;
	}
	
	public void setAccuracy(final int accuracy) {
		this.accuracy = accuracy;
	}
	
}

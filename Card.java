package com.promeniotech;

public class Card {

	int value;
	String name;
	
	
	Card(int value, String name) {
		this.value = value;
		this.name = name;
		
	}
	
	
	
	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.println(this.name);
	}
	
}

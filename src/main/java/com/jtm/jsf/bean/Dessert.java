package com.jtm.jsf.bean;

public class Dessert {
	private String dessertName;
	private int dessertId;

	public Dessert(String dessertName, int dessertId) {
		this.dessertName = dessertName;
		this.dessertId = dessertId;
	}
	public String getDessertName() {
		return dessertName;
	}

	public void setDessertName(String dessertName) {
		this.dessertName = dessertName;
	}
	
	public int getDessertId() {
		return dessertId;
	}

	public void setDessertId(int dessertId) {
		this.dessertId = dessertId;
	}
		
}

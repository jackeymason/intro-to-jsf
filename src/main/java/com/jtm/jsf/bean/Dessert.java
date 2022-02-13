package com.jtm.jsf.bean;

public class Dessert {
	private String dessertName;
	private int dessertId;

	public Dessert(String dessertName) {
		this.dessertName = dessertName;
	}
	public Dessert(String dessert, int dessertId) {
		// TODO Auto-generated constructor stub
	}
	public String getdessertName() {
		return dessertName;
	}

	public void setdessertName(String dessertName) {
		this.dessertName = dessertName;
	}
	
	public int getdessertId() {
		return dessertId;
	}

	public void setdessertId(int dessertId) {
		this.dessertId = dessertId;
	}
	public long getDessertId() {
		// TODO Auto-generated method stub
		return dessertId;
	}
	
	
}

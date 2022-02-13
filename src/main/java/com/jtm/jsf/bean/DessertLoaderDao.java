package com.jtm.jsf.bean;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@ApplicationScoped //loaded once and one instance only for all user while application is alive
@Named("dessertDao")
public class DessertLoaderDao {
	
	private List<Dessert> desserts;
	
	@PostConstruct
	public void loadDesserts() {
		Dessert iceCream = new Dessert("Ice Cream", 10001);
		Dessert fudgeSundae = new Dessert("Fudge Sundae", 10002);
		Dessert kheer = new Dessert("Kheer", 10003);
		Dessert applePie = new Dessert("Apple Pie", 10004);
		Dessert candiedApple = new Dessert("Candied Apple", 10005);
	
		desserts = new LinkedList();
		desserts.add(kheer);
		desserts.add(iceCream);
		desserts.add(fudgeSundae);
		desserts.add(applePie);
		desserts.add(kheer);
	}
	
	public List<Dessert> getDesserts(){
		return desserts;
	}
	
	public void setDesserts(List<Dessert> desserts) {
		this.desserts = desserts;
	}
	
	public Dessert findDessertById(long dessertId) {
		for(Dessert dessert : desserts) {
			if(dessert.getDessertId() == dessertId) {
				return dessert;
			}
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
}

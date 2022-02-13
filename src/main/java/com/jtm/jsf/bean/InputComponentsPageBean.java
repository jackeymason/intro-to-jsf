package com.jtm.jsf.bean;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named("componentListing")
public class InputComponentsPageBean {
	
	private String password1;
	private long selectOneRadioSelection;
	private long selectOneMenuSelection;
	private long selectListBoxSelection;
	private long selectOneMenu;
	private Dessert radioButtonDessert;
	private Dessert listBoxDessert;
	private List<Dessert> selectManyDesserts;
	private List<Long> selectManyCheckboxSelections = new LinkedList<>();
	private String inputTextAreaText;
	private BigDecimal moneyInput;
	private Dessert selectedDessert;
	public String getPassword1() {
		return password1;
	}
	public long getSelectOneRadioSelection() {
		return selectOneRadioSelection;
	}
	public long getSelectOneMenuSelection() {
		return selectOneMenuSelection;
	}
	public long getSelectListBoxSelection() {
		return selectListBoxSelection;
	}
	public long getSelectOneMenu() {
		return selectOneMenu;
	}
	public Dessert getRadioButtonDessert() {
		return radioButtonDessert;
	}
	public Dessert getListBoxDessert() {
		return listBoxDessert;
	}
	public List<Dessert> getSelectManyDesserts() {
		return selectManyDesserts;
	}
	public List<Long> getSelectManyCheckboxSelections() {
		return selectManyCheckboxSelections;
	}
	public String getInputTextAreaText() {
		return inputTextAreaText;
	}
	public BigDecimal getMoneyInput() {
		return moneyInput;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	public void setSelectOneRadioSelection(long selectOneRadioSelection) {
		this.selectOneRadioSelection = selectOneRadioSelection;
	}
	public void setSelectOneMenuSelection(long selectOneMenuSelection) {
		this.selectOneMenuSelection = selectOneMenuSelection;
	}
	public void setSelectListBoxSelection(long selectListBoxSelection) {
		this.selectListBoxSelection = selectListBoxSelection;
	}
	public void setSelectOneMenu(long selectOneMenu) {
		this.selectOneMenu = selectOneMenu;
	}
	public void setRadioButtonDessert(Dessert radioButtonDessert) {
		this.radioButtonDessert = radioButtonDessert;
	}
	public void setListBoxDessert(Dessert listBoxDessert) {
		this.listBoxDessert = listBoxDessert;
	}
	public void setSelectManyDesserts(List<Dessert> selectManyDesserts) {
		this.selectManyDesserts = selectManyDesserts;
	}
	public void setSelectManyCheckboxSelections(List<Long> selectManyCheckboxSelections) {
		this.selectManyCheckboxSelections = selectManyCheckboxSelections;
	}
	public void setInputTextAreaText(String inputTextAreaText) {
		this.inputTextAreaText = inputTextAreaText;
	}
	public void setMoneyInput(BigDecimal moneyInput) {
		this.moneyInput = moneyInput;
	}
	public void setSelectedDessert(Dessert selectedDessert) {
		this.selectedDessert = selectedDessert;
	}
	public Dessert getSelectedDessert() {
		return selectedDessert;
	}
	

	
	
	

}

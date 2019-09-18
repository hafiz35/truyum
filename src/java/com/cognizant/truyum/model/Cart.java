package com.cognizant.truyum.model;

import java.util.ArrayList;

public class Cart {
	
	public Cart(){
		
	}
	public Cart(ArrayList<MenuItem> al, double total) {
		this.al = al;
		this.total = total;
	}
	private ArrayList<MenuItem> al=new ArrayList<MenuItem>();
	private double total;
	
	public ArrayList<MenuItem> getAl() {
		return al;
	}
	public void setAl(ArrayList<MenuItem> al) {
		this.al = al;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public void setMenuItemList(ArrayList<MenuItem> menuItemArrayList) {
		this.al = menuItemArrayList;
		
	}
	public ArrayList<MenuItem> getMenuItemList() {
		return al;
	}
	@Override
	public String toString() {
		return "Cart [al=" + al + ", total=" + total + "]";
	}
	
}

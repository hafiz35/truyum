package com.cognizant.truyum.model;

import java.util.Date;

public class MenuItem {
	
	private long id;
	private String name,category;
	private float price;
	private boolean active,freedelivery;
	private Date dateoflaunch;
	
	public MenuItem() {
		this.id = 0;
		this.name = null;
		this.category = null;
		this.price = 0.0f;
		this.active = false;
		this.freedelivery = false;
		this.dateoflaunch = null;
	}

	public MenuItem(long id,String name,float price,boolean active,Date dateoflaunch,String category,boolean freedelivery)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.active=active;
		this.dateoflaunch=dateoflaunch;
		this.category=category;
		this.freedelivery=freedelivery;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public boolean isFreedelivery() {
		return freedelivery;
	}
	public void setFreedelivery(boolean freedelivery) {
		this.freedelivery = freedelivery;
	}
	public Date getDateoflaunch() {
		return dateoflaunch;
	}
	public void setDateoflaunch(Date dateoflaunch) {
		this.dateoflaunch = dateoflaunch;
	}
	@Override
	public String toString() {
		return "MenuItem [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", active="
				+ active + ", freedelivery=" + freedelivery + ", dateoflaunch=" + dateoflaunch + "]";
	}
	
}

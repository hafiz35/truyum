package com.cognizant.truyum.dao;

import java.util.ArrayList;

import com.cognizant.truyum.model.MenuItem;


public class CartDaoCollectionImpl {

    private static ArrayList<MenuItem> menuItemArrayList;
    
    public ArrayList<MenuItem> getMenuItemArrayList() {
		return menuItemArrayList;
	}
	public void setMenuItemArrayList(ArrayList<MenuItem> menuItemArrayList) {
		this.menuItemArrayList = menuItemArrayList;
	}
	
        
    
    public CartDaoCollectionImpl() {
            if(menuItemArrayList == null){
                menuItemArrayList=new ArrayList<>();
            }
            }
    public CartDaoCollectionImpl addMenu(CartDaoCollectionImpl obj,MenuItem m){
        obj.menuItemArrayList.add(m);
        return obj;
    }
}

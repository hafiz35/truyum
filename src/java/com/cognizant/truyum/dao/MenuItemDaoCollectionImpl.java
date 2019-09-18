package com.cognizant.truyum.dao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

@SuppressWarnings("unused")

public class MenuItemDaoCollectionImpl{
	
	public static ArrayList<MenuItem> menuItemList=new ArrayList<MenuItem>();
	
	
	public MenuItemDaoCollectionImpl(){
		if(menuItemList.isEmpty()){
			try {
				menuItemList.add(new MenuItem(1,"Sandwich",99.0f,true,DateUtil.convertToDate("15/03/2017"),"Main Course",true));
				menuItemList.add(new MenuItem(2,"Burger",129.0f,true,DateUtil.convertToDate("23/12/2017"),"Main Course",false));
				menuItemList.add(new MenuItem(3,"Pizza",149.0f,true,DateUtil.convertToDate("21/08/2018"),"Main Course",false));
				menuItemList.add(new MenuItem(4,"French Fries",57.0f,false,DateUtil.convertToDate("02/07/2017"),"Starters",true));
				menuItemList.add(new MenuItem(5,"Choclate Brownie",32.0f,true,DateUtil.convertToDate("02/11/2022"),"Dessert",true));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
	}
	public ArrayList<MenuItem> getMenuItemListAdmin(){
		return menuItemList;
	}
	public ArrayList<MenuItem> getMenuItemListCustomer(){
		ArrayList<MenuItem> menuitemdao=new ArrayList<MenuItem>();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		Iterator<MenuItem> it=menuItemList.iterator();
		while(it.hasNext()){
			MenuItem obj=it.next();
			Date d=obj.getDateoflaunch();
			if(d.compareTo(date)==0 || d.before(date)){
				menuitemdao.add(obj);
			}
		}
		return menuitemdao;
	}
	public void modifyMenuItem(MenuItem menuitem){
		int index=0;
		Iterator<MenuItem> it=menuItemList.iterator();
		while(it.hasNext()){
			MenuItem m=it.next();
			if(m.getId()==menuitem.getId())
			{   System.out.println("$$"+m.getId());
                            menuItemList.set(index,menuitem);
				break;
			}
			index++;
		}
	}
	public MenuItem getMenuItem(long menuitemid){
		Iterator<MenuItem> it=menuItemList.iterator();
		while(it.hasNext()){
			MenuItem menuItem=it.next();
			if(menuitemid==menuItem.getId())
			{   return menuItem;
			}
		}
                return null;
	}
}

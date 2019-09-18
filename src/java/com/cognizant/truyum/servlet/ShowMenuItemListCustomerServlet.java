package com.cognizant.truyum.servlet;

import com.cognizant.truyum.dao.*;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cognizant.truyum.dao.MenuItemDaoCollectionImpl;

@WebServlet("/ShowMenuItemListCustomerServlet")
public class ShowMenuItemListCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ShowMenuItemListCustomerServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs=request.getSession();
		MenuItemDaoCollectionImpl obj=new MenuItemDaoCollectionImpl();
		hs.setAttribute("menuitemimpl",obj);
                hs.setAttribute("list", obj.menuItemList);
		CartDaoCollectionImpl obj1=new CartDaoCollectionImpl();
		hs.setAttribute("cartimpl",obj1);
                hs.setAttribute("cartlist", obj1.getMenuItemArrayList());
		response.sendRedirect("addMenuItemCustomer.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

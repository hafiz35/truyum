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
import com.cognizant.truyum.model.MenuItem;
@WebServlet("/AddToCartServlet")
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddToCartServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs=request.getSession();
		MenuItemDaoCollectionImpl obj=(MenuItemDaoCollectionImpl)hs.getAttribute("menuitemimpl");
		int index=Integer.parseInt(request.getParameter("id"));
		MenuItem m=obj.getMenuItem(index);
		CartDaoCollectionImpl obj1= new CartDaoCollectionImpl();
		obj1=obj1.addMenu(obj1,m);
		response.sendRedirect("showCartItemList.jsp?added=true");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            
		doGet(request, response);
	
        }

}

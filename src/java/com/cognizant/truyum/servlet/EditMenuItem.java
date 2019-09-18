package com.cognizant.truyum.servlet;

import com.cognizant.truyum.util.DateUtil;
import com.cognizant.truyum.model.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cognizant.truyum.dao.*;

@WebServlet("/EditMenuItem")
public class EditMenuItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public EditMenuItem() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs=request.getSession();
		MenuItemDaoCollectionImpl obj=(MenuItemDaoCollectionImpl)hs.getAttribute("menuitemimpl");
		Long index=Long.parseLong(request.getParameter("id"));
                System.out.println(index);
                MenuItem obj1=obj.getMenuItem(index);
                hs.setAttribute("menuitem",obj1);
		response.sendRedirect("editMenuItem.jsp");
		
	}

}

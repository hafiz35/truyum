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

@WebServlet("/EditMenuItemServlet")
public class EditMenuItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public EditMenuItemServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs=request.getSession();
		MenuItemDaoCollectionImpl obj=(MenuItemDaoCollectionImpl)hs.getAttribute("menuitemimpl");
		int index=Integer.parseInt(request.getParameter("id"));

		String name=(String)request.getParameter("name");
		String price1=(String)request.getParameter("price");
		String active1=(String)request.getParameter("active");
		active1=active1.equals("true")?"true":"false";
		String dateoflaunch1=(String)request.getParameter("dateoflaunch");
		String category=(String)request.getParameter("category");
		String freedelivery1=(String)request.getParameter("freedelivery");
		freedelivery1=freedelivery1==(null)?"false":"true";
		boolean active=Boolean.parseBoolean(active1);
		
		boolean freedelivery=Boolean.parseBoolean(freedelivery1);
		float price=0.0f;
		try{
		price=Float.parseFloat(price1);
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
		Date dateoflaunch=null;
		try {
		dateoflaunch=DateUtil.convertToDate(dateoflaunch1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		long id=new Long(index);
		MenuItem miobj=new MenuItem(id,name,price,active,dateoflaunch,category,freedelivery);
		obj.modifyMenuItem(miobj);
                response.sendRedirect("editstatus.jsp");
		doGet(request, response);
	}

}

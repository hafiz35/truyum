package com.cognizant.truyum.servlet;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cognizant.truyum.dao.CartDaoCollectionImpl;
import com.cognizant.truyum.model.MenuItem;

@WebServlet("/RemoveCartServlet")
public class RemoveCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RemoveCartServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs=request.getSession();
		int id=Integer.parseInt(request.getParameter("id"));
		CartDaoCollectionImpl cartimpl=(CartDaoCollectionImpl)hs.getAttribute("cartimpl");
	      int index=0,index1=0;
	      Iterator<MenuItem> it=cartimpl.getMenuItemArrayList().iterator();
			while(it.hasNext()){
				MenuItem m=it.next();
				if(m.getId()==id){
					index1=index;
				}
				index++;
			}
			cartimpl.getMenuItemArrayList().remove(index1);
                        if(cartimpl.getMenuItemArrayList().isEmpty())
                            response.sendRedirect("showCartItemList.jsp?removed=false");
                        else
                            response.sendRedirect("showCartItemList.jsp?removed=true");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

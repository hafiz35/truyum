package com.cognizant.truyum.servlet;
import com.cognizant.truyum.dao.MenuItemDaoCollectionImpl;
import com.cognizant.truyum.model.MenuItem;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ShowMenuItemListAdminServlet")
public class ShowMenuItemListAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ShowMenuItemListAdminServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs=request.getSession();
		MenuItemDaoCollectionImpl obj=new MenuItemDaoCollectionImpl();
                MenuItem obj1=new MenuItem();
                hs.setAttribute("menuitemimpl", obj);
		hs.setAttribute("list",obj.menuItemList);
                hs.setAttribute("menuitem", obj1);
		response.sendRedirect("showMenuItemList.jsp");
	}

}

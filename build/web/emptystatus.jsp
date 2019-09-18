<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="com.cognizant.truyum.dao.*"%>
<%@ page import="com.cognizant.truyum.model.*"%>
<!DOCTYPE html.5>
<html>
<head>
<title>Truyum</title>
<link rel="stylesheet" href="truyum.css">
</head>
<body>
	<div id="header" style="height: 80px;">
		truYum 
                <img src="food.jpg" height=50 width=50>
                <a href="showCartItemList.jsp">Cart</a>
                <a href="addMenuItemCustomer.jsp">Menu</a>
	</div>
	<div class="main-container" align="center">
                <h2>Cart</h2>
                <h4>No items in cart. Use 'Add to Cart' option in <a href="addMenuItemCustomer.jsp">Menu Item List</a></h4>
        </div>
	<footer> Copyright &copy; 2019 </footer>
</body>
</html>

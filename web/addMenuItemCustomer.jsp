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
                <a href="index.html">Menu</a>
	</div>
	<div class="main-container">
		<h2>Products</h2>
		<table class="movies-table" id="movies">
			<tr>
				<th>Name</th>
				<th>Price</th>
				<th>Active</th>
				<th>Date of Launch</th>
				<th>Category</th>
				<th>Free Delivery</th>
				<th>Action</th>
			</tr>
			<c:forEach var="list1" items="${list}">
				<tr>
					<td><c:out value="${list1.name}" /></td>
					<td><c:out value="${list1.price}" /></td>
					<td><c:out value="${list1.active==true?'Yes':'No'}" /></td>
					<td><fmt:formatDate dateStyle="short" type="date"
							value="${list1.dateoflaunch}" /></td>
					<td><c:out value="${list1.category}" /></td>
					<td><c:out value="${list1.freedelivery==true?'Yes':'No'}" /></td>
					<td><a href="AddToCartServlet?id=${list1.id}">Add To Cart</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<footer> Copyright &copy; 2019 </footer>
</body>
</html>

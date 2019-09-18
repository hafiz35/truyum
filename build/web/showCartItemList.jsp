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
	<div class="main-container">
                <h2>Products</h2>
                <c:if test="${param.added=='true'}"><h4>Item added to Cart Successfully</h4></c:if>
                <c:if test="${param.removed=='false'}"><c:redirect url="emptystatus.jsp"></c:redirect></c:if>
                <c:if test="${param.removed=='true'}"><h4>Item removed from Cart Successfully</h4></c:if>
		<table class="movies-table" id="movies">
			<tr>
				<th>Name</th>
                                <th>Free Delivery</th>
				<th>Price</th>
				
			</tr>
			<c:forEach var="list1" items="${cartlist}">
				<tr>
					<td><c:out value="${list1.name}" /></td>
                                        <td><c:out value="${list1.freedelivery==true?'Yes':'No'}" /></td>
					<td><c:out value="${list1.price}" /></td>
					<td><a href="RemoveCartServlet?id=${list1.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
        </div><BR><BR>
	<a href="addMenuItemCustomer.jsp">Add More Items</a>
	<footer> Copyright &copy; 2019 </footer>
</body>
</html>

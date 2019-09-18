<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.cognizant.truyum.dao.*"%>
<%@ page import="com.cognizant.truyum.model.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html.5>
<html>
<head>

<title>Truyum</title>
<link rel="stylesheet" href="truyum.css">
</head>

<body>
	<div id="header" style="height: 80px">
		truYum 
                <img src="food.jpg" height=50 width=50>
                <a href="showMenuItemList.jsp">Menu</a>
	</div>
	<div>
            <BR> <BR>
            <h2>Edit Menu Item</h2>
		<form method="POST" action="EditMenuItemServlet?id=${menuitem.getId()}">
			<table>
				<tr>
					<th>Name :</th>

				</tr>
				<tr>
					<td><input type="text" name="name" value="${menuitem.getName()}" size="100"></td>
				</tr>
			</table>
			<BR>

			<table>

				<tr>
					<th align="left">Price (Rs.)</th>
					<th align="left">Active </th>
					<th align="left">Date of Launch</th>
					<th align="left">Category </th>

				</tr>
				<tr>
					<td><input type="text" name="price" value="${menuitem.price}"
						size="10"></td>
					<td><input type="radio" name="active" value="true"
                                                   <c:if test="${menuitem.active==true}">checked</c:if> >Yes
                                            <input type="radio"
						name="active" value="false" <c:if test="${menuitem.active==false}">checked</c:if>>No</td>
					<td><input type="text" name="dateoflaunch"
						value=<fmt:formatDate dateStyle="short" type="date" value="${menuitem.dateoflaunch}" /></td>
					<td><select name="category">
							<option value="Starters" ${menuitem.category=='Starters'?selected:''}>Starters</option>
							<option value="Maincourse" ${menuitem.category=='Maincourse'?selected:''}>Main Course</option>
							<option value="Dessert" ${menuitem.category=='Dessert'?selected:''}>Dessert</option>
							<option value="Drinks" ${menuitem.category=='Drinks'?selected:''}>Drinks</option>
					</select></td>
				</tr>

			</table>
			<BR>
			<table>
				<tr>
					<th align="left">Free delivery </th>
				</tr>
				<tr>
					<td><input type="checkbox" name="freedelivery" value="true"
						<c:if test="${menuitem.freedelivery==true}">checked</c:if> ></td>
				</tr>
			</table>
			<BR>
			<table>
				<tr>
					<td><input type="submit" value="Save"></td>
				</tr>
			</table>
		</form>

	</div>
	<footer> Copyright &copy; 2019 </footer>
</body>
</html>

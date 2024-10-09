<%@page import="com.jspiders.springmvc.dto.CarDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="nav_Bar.jsp" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Page</title>
<style type="text/css">

#head{
 
 margin-top:150px;
 margin-left:1%;
 

}
#button{

 margin-top:10px;

}


#message {
	font-size: 25px;
}

a {
	text-decoration: none;
}
</style>
</head>
<body>
	<%
	CarDTO car = (CarDTO) request.getAttribute("car");
	%>
	<div id="box" align="center">
		<h3 id="head">Update Car Details</h3>
		<form action="update_car" method="post">
			<table border="1px solid">
				<tr>
					<td class="label">Id</td>
					<td><input class="input" type="text" name="id"
						value="<%=car.getId()%>" readonly="readonly"></td>
				</tr>
				<tr>
					<td class="label">Name</td>
					<td><input class="input" type="text" name="name"
						value="<%=car.getName()%>" required="required"></td>
				</tr>
				<tr>
					<td class="label">Brand</td>
					<td><input class="input" type="text" name="brand"
						value="<%=car.getBrand()%>" required="required"></td>
				</tr>
				<tr>
					<td class="label">Price</td>
					<td><input class="input" type="text" name="price"
						value="<%=car.getPrice()%>" required="required"></td>
				</tr>
			</table>
			<input id="button" type="submit" value="UPDATE">
		</form>
	</div>
	<%
	String message = (String) request.getAttribute("message");
	if (message != null) {
	%>
	<div align="center">
		<h3 id="message"><%=message%></h3>
	</div>
	<%
	}
	%>
</body>
</html>
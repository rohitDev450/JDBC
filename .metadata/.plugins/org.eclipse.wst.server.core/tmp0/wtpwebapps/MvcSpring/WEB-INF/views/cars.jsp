<%@page import="java.util.List"%>
<%@page import="com.jspiders.springmvc.dto.CarDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="nav_Bar.jsp" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ALl Cars</title>
<style type="text/css">
#message {
	font-size: 40px;
}

h1{
 
 margin-top:300px;
 margin-left:36%;

}
#container{
  
  	margin-left: 40%;
	margin-top: 130px;
 

}
</style>
</head>
<body>

	<%
	String message = (String) request.getAttribute("message");
	if (message != null) {
	%>
	<div align="center">
		<h3 id="message"><%=message%></h3>
	</div>
	<%
	}
	@SuppressWarnings("unchecked")
	List<CarDTO> cars = (List<CarDTO>) request.getAttribute("cars");
	if (cars != null) {
	%>
	<div id="container">
		<table border="1px solid">
			<tr>
				<td>Id</td>
				<td>Name</td>
				<td>Brand</td>
				<td>Price</td>
			</tr>
			<%
			for (CarDTO car : cars) {
			%>
			<tr>
				<td><%=car.getId()%></td>
				<td><%=car.getName()%></td>
				<td><%=car.getBrand()%></td>
				<td><%=car.getPrice()%></td>
			</tr>
			<%
			}
			%>
		</table>
	</div>
	<%
	}
	%>
</body>
</html>
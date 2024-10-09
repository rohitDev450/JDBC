<%@page import="com.jspiders.springmvc.dto.CarDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="nav_Bar.jsp" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Cars Page</title>
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
	rel="stylesheet">

<style type="text/css">

#message {
	font-size: 40px;
	margin-left:3%;
}

#container{
 
 margin-top:250px;
 margin-left:36%;

}
#container{
  
  	margin-left: 40%;
	margin-top: 100px;
 

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
				<td class="head">Id</td>
				<td class="head">Name</td>
				<td class="head">Brand</td>
				<td class="head">Price</td>
				<td class="head" colspan="2">Action</td>
			</tr>
			<%
			for (CarDTO car : cars) {
			%>
			<tr>
				<td class="data"><%=car.getId()%></td>
				<td class="data"><%=car.getName()%></td>
				<td class="data"><%=car.getBrand()%></td>
				<td class="data"><%=car.getPrice()%></td>
				<td class="data">
					<form action="delete_car" method="post">
						<input type="text" name="id" value="<%=car.getId()%>"
							hidden="true">
						<button class="action" type="submit">
							<i class="fas fa-trash-alt"></i>
						</button>
					</form>
				</td>
				<td class="data">
					<form action="edit_car" method="post">
						<input type="text" name="id" value="<%=car.getId()%>"
							hidden="true">
						<button class="action" type="submit">
							<i class="fas fa-edit"></i>
						</button>
					</form>
				</td>
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
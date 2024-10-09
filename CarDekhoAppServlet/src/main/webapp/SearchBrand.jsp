<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="com.jspider.CarDekhoAppServlet.object.Car"%>
<%@page import="com.jspider.CarDekhoAppServlet.jdbc.CarJDBC"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
<style>
body {
	margin: 0;
	font-family: Arial, sans-serif;
	background-color: #BDC3C7;
	color: #1A5276;
}

.navbar {
	background-color: #1A5276;
	overflow: hidden;
	display: flex;
	justify-content: space-between;
	align-items: center;
	padding: 20px 20px;
	box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
}

.navbar-brand {
	color: #fff;
	font-size: 24px;
	font-weight: bold;
	text-decoration: none;
	display: flex;
	align-items: center;
}

.navbar-brand i {
	font-size: 28px;
	margin-right: 10px;
}

.navbar-nav {
	list-style: none;
	margin: 0;
	padding: 0;
	display: flex;
}

.navbar-nav li {
	margin-left: 20px;
}

.navbar-nav a {
	color: #BDC3C7;
	text-decoration: none;
	font-size: 18px;
	transition: color 0.3s;
	position: relative;
}

.navbar-nav a:hover {
	color: green;
}

.navbar-nav a::before {
	content: "";
	position: absolute;
	bottom: -2px;
	left: 0;
	width: 100%;
	height: 2px;
	background-color: #ffc107;
	transform: scaleX(0);
	transition: transform 0.3s ease;
}

.navbar-nav a:hover::before {
	transform: scaleX(1);
}
 input[type="text"]{
 
   background-color: #BDC3C7; 
   outline: none;
   border: none;
 
 }
 input[type="submit"]{
 
   background-color: #BDC3C7; 
   outline: none;
   border: 1px solid;
   margin-left: 5px;
 
 }
 .conta{
    margin-left:43%;
    margin-top:60px;
 }
 
 h1{
   margin-left:42%;
    margin-top:50px;
 }

</style>
</head>
<body>
	<div class="navbar">
		<a href="http://localhost:8080/CarDekhoAppServlet/Home.jsp" class="navbar-brand"> <i class="fas fa-car"></i> Car
			Dekho
		</a>
		<ul class="navbar-nav">
			<li><a
				href="http://localhost:8080/CarDekhoAppServlet/AddCar.jsp">ADD
					Car</a></li>
			<li><a
				href="http://localhost:8080/CarDekhoAppServlet/ViewAllCar.jsp">ViewAll
					Car</a></li>
			<li><a
				href="http://localhost:8080/CarDekhoAppServlet/SearchCar.jsp">Search
					Car</a></li>
			<li><a
				href="http://localhost:8080/CarDekhoAppServlet/UpdateCar.jsp">Update
					Car</a></li>
			<li><a
				href="http://localhost:8080/CarDekhoAppServlet/DeleteCar.jsp">Remove
					Car</a></li>
		</ul>
	</div>

	<h1>Search BY Brand</h1>
	<div align="center">
		<form action="SearchBrand" method="post">
			<table border="1px solid">
				<tr>
					<td>Brand :</td>
					<td><input type="text" name="brand"></td>
				</tr>
			</table>
			<br> <input type="submit" value="Search">
		</form>
	</div>
	<br>
	<br>
	<%
	List<Car> cars = (List<Car>) request.getAttribute("cars");
	if (cars != null && cars.size() > 0) {
	%>
	<div align="center">
		<table border="1px solid">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Brand</th>
				<th>Price</th>
			</tr>
			<%
			for (Car car : cars) {
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
	} else {
	%>
	<br>

	<%!String message;%>
	<%
	message = (String) request.getAttribute("message");
	%>
	<div align="center">
		<%
		if (message != null) {
		%>
		<h4><%=message%></h4>
		<%
		}
		%>
	</div>
	<%
	}
	%>
</body>
</html>
<%@page import="java.util.List"%>
<%@page import="com.jspider.CarDekhoAppServlet.object.Car"%>
<%@page import="com.jspider.CarDekhoAppServlet.jdbc.CarJDBC"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
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

h1 {
	margin-top: 300px;
	margin-left: 36%;
}
/*list style*/

#sample{

   margin-top:50px;
}
#sample ul {
  list-style-type: none; 
  padding: 0;
  margin: 0;
}

#sample li {
  padding: 15px;
  background-color: #f2f2f2;
  border-radius: 8px;
  margin-bottom: 10px;
  font-family: Arial, sans-serif;
  position: relative;
  transition: transform 0.3s ease;
  box-shadow: 0px 2px 4px rgba(0, 0, 0, 0.1);
  text-decoration: none; 
}

#sample ul a{
    text-decoration:none;
}


#sample li:hover {
  transform: translateY(-3px);
  background-color: #e0e0e0;
  box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.2);
}

#sample li span{
  font-weight: bold;
  color: #333;
  text-decoration: none;
}

#sample li::before {
  content: "\2022"; 
  color: #5c5c5c;
  font-size: 1.2em;
  margin-right: 10px;
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
	
	<div id="sample">
	<ul>
	   <a href="http://localhost:8080/CarDekhoAppServlet/SearchID.jsp"><li><span>Search By ID</span></li></a>	
		<a href="http://localhost:8080/CarDekhoAppServlet/SearchName.jsp"><li><span>Search BY Name </span></li></a>
		<a href="http://localhost:8080/CarDekhoAppServlet/SearchBrand.jsp"><li><span>Search BY Brand </span></li></a>
		<a href="http://localhost:8080/CarDekhoAppServlet/SearchPrice.jsp"><li><span>Search BY Price </span></li></a>
	</ul>
	</div>

</body>
</html>
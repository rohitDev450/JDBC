<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
</head>
<style type="text/css">
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

#head{
 
 margin-top:150px;
 margin-left:2%;
 

}

h1{
  margin-left:41%;

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
 
 }
</style>
<body>
	<div class="navbar">
		<a href="check_user"
			class="navbar-brand"> <i class="fas fa-car"></i> Car Dekho
		</a>
		<ul class="navbar-nav">
			<li><a
				href="http://localhost:8080/MvcSpring/add_page">ADD
					Car</a></li>
			<li><a
				href="http://localhost:8080/MvcSpring/cars">All
					Cars</a></li>
			<li><a
				href="my_cars">MY Cars
					</a></li>
			<li><a
				href="sign_out">Sing Out
					</a></li>
			<li><a
				href="delete_user">Delete Account
					</a></li>
		</ul>
	</div>

</body>
</html>
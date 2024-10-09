<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up Page</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
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


#head{
 
 margin-top:150px;
 margin-left:2%;
 

}

a {
	text-decoration: none;
}
</style>
</head>
<body>


 <div class="navbar">
		<a href="http://localhost:8080/CarDekhoAppServlet/Home.jsp"
			class="navbar-brand"> <i class="fas fa-car"></i> Car Dekho
		</a>
		<ul class="navbar-nav">
			<li><a
				href="sign_in">Sing In</a></li>
		</ul>
	</div>



	<div id="box" align="center">
		<h3 id="head">Sign Up</h3>
		<form action="add_user" method="post">
			<table border="1px solid ">
				<tr>
					<td class="label">Email</td>
					<td><input class="input" type="text" name="email"
						required="required" autofocus="autofocus"></td>
				</tr>
				<tr>
					<td class="label">Password</td>
					<td><input class="input" type="text" name="password"
						required="required"></td>
				</tr>
			</table>
			<input id="button" type="submit" value="Sign Up">
		</form>
	</div>
</body>
</html>
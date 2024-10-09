<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div align="center">

		<form action="palidrome.jsp">
			<table>
				<tr>
					<td>num1</td>
					<td><input type="text" name="num1"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Verify"></td>
				</tr>
			</table>
		</form>
	</div>

     <%! int num1, rev,copy;%>
     <% 
     String input1 = request.getParameter("num1");
     if (input1 != null) {

 		num1 = Integer.parseInt(input1);
 		
 	}
     num1 = copy;
     if(num1 >0){ 
          
    	 int digit = num1%10;
    	 rev = digit;
    	 num1 /=10;
        }
     
        if(copy == rev){
        	
        System.out.println("Number is palidrome ");
        }else{
        	System.out.println("Number is not palidrome ");	
        }
     %>
</body>
</html>
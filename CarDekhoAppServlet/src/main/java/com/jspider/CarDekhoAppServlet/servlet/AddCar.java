package com.jspider.CarDekhoAppServlet.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspider.CarDekhoAppServlet.jdbc.CarJDBC;

@WebServlet("/AddCar")
public class AddCar extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

         int id = Integer.parseInt(req.getParameter("id"));
         String name = req.getParameter("name");
         String brand = req.getParameter("brand");
         Double price = Double.parseDouble(req.getParameter("price"));
         int res = CarJDBC.addCar(id,name,brand,price);
         if(res == 1) {
        	 req.setAttribute("message", "Car Added");
         }else {
        	 req.setAttribute("message", "Car not added");
         }
         
         RequestDispatcher dispatcher = req.getRequestDispatcher("AddCar.jsp");
         dispatcher.forward(req, resp);
         
		
	}

}

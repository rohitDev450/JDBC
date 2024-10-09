package com.jspider.CarDekhoAppServlet.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspider.CarDekhoAppServlet.jdbc.CarJDBC;
import com.jspider.CarDekhoAppServlet.object.Car;

@WebServlet("/ViewAllCar")
public class ViewAllCar extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           
		List<Car> cars = CarJDBC.ViewAllCar();
	     req.setAttribute("cars", cars);
	     
	     RequestDispatcher dispatcher = req.getRequestDispatcher("ViewAllCar.jsp");
	     dispatcher.forward(req, resp);

	}

}

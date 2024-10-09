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

@WebServlet("/SearchPrice")
public class SearchPrice extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double price = Double.parseDouble(req.getParameter("price"));
		List<Car> cars = CarJDBC.searchPrice(price);
		
		if(cars.size()>0) {
			req.setAttribute("cars", cars);
		}else {
			req.setAttribute("message", "Car not available");
		}
		RequestDispatcher dispatcher = req.getRequestDispatcher("SearchPrice.jsp");
		dispatcher.forward(req, resp);
	
	}

}

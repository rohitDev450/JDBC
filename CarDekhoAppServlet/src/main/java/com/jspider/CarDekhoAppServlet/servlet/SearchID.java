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

@WebServlet("/SearchID")
public class SearchID extends HttpServlet{

	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		List<Car> cars = CarJDBC.serchId(id);
		
		if(cars.size()>0) {
			req.setAttribute("cars", cars);
		}else {
			req.setAttribute("message", "Car not available");
		}
		RequestDispatcher dispatcher = req.getRequestDispatcher("SearchID.jsp");
		dispatcher.forward(req, resp);
		
	}

}

package com.jspider.CarDekhoAppServlet.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspider.CarDekhoAppServlet.jdbc.CarJDBC;

@WebServlet("/UpdateCar")
public class UpdateCar extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		int res = CarJDBC.updateCar(id,name);
		if(res  == 1) {
			req.setAttribute("message", "Car Name Update Sucessfully");
		}else {
			req.setAttribute("message", "Car Name Failed to Update!!!");
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("UpdateCar.jsp");
		dispatcher.forward(req, resp);
	}

}

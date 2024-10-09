package com.jspider.CarDekhoAppServlet.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspider.CarDekhoAppServlet.jdbc.CarJDBC;

@WebServlet("/DeleteCar")
public class DeleteCar extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		int res = CarJDBC.deleteCar(id);
        if(res == 1) {
        	req.setAttribute("message", "Car Deleted");
        }else {
        	req.setAttribute("message", "Car not Found");
        }
        
        RequestDispatcher dispatcher = req.getRequestDispatcher("DeleteCar.jsp");
        dispatcher.forward(req, resp);
        
	}

}

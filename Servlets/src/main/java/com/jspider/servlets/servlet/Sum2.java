package com.jspider.servlets.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Sum2")
public class Sum2 extends HttpServlet{


	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num1"));
		int sum= num1 + num2;
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("</h1>sum of two numbers is "+sum+"</h1>");
	}

}

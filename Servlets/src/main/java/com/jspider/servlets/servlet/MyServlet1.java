package com.jspider.servlets.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet1  extends GenericServlet {

	
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		
		  arg1.setContentType("text/html");
		  PrintWriter writer =  arg1.getWriter();
		  writer.println("<h1>Hello Rohit Welcome TO Servlet</h1>");
		
	}

}

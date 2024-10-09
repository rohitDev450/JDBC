package com.jspider.servlets.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/MyServlet9")
public class MyServlet9 implements Servlet{
	
	static {
		
		System.out.println("Class Loding");
	}
	
	{
		System.out.println("Instatiation");
	}


	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		
		System.out.println("init() invoked");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("sevice() invoked");
		
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy() invoked");
		
	}

}

package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw= null;
		
		pw =res.getWriter();
		 res.setContentType("text/html");
		   
		 pw.println("<h1 style='color:blue'>Welcome to Naresh IT </h1>");
		   
	     pw.close();
	}
	
	

}

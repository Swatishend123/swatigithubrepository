package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MarryApp extends HttpServlet {
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw= null;
		String name=null , gender=null;
		int age=0;
		
		pw=res.getWriter();
		res.setContentType("text/html");
		name=req.getParameter("panme");
		gender = req.getParameter("gender");
		age=Integer.parseInt(req.getParameter("page"));
		
		if(gender.equalsIgnoreCase("M"))
		{
			if(age>=21)
			{
				pw.print("ms/mrs"+name+ "you are eligible for marriage");
			}
			else {
				pw.print("ms/mrs"+name+ "you are not eligible for marriage");
			}
		}
		else
			if(gender.equalsIgnoreCase("F"))
			{
				if(age>=18)
				{
					pw.print(name+ " you are eligible for marriage");
				}
				else {
					pw.print(name+ "  you are not eligible for marriage");
				}
			}
		
		pw.println("<br> <a href='input.html'> </a>");
	   pw.close();	
		
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("MarriageServlet.doGet(-,-)");
		   PrintWriter pw=null;
		   //get PrintWriter 
		   pw=res.getWriter();
		   res.setContentType("text/html");
		   
		 	pw.println("<br> <a href='input.html'> </a>");
		   //close stream
		   pw.close();
	}	

}

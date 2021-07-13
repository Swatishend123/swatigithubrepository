package com.nt.controller;

import java.io.IOException;

import com.nt.bo.NewTicketBO;
import com.nt.dao.NewTicketDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/bookticket")
public class NewController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String FromPlace = req.getParameter("FromPlace");
		String ToPlace = req.getParameter("ToPlace");
		String Date = req.getParameter("Date");
	     String peoplestr = req.getParameter("people");
	     int people = Integer.parseInt(peoplestr);
		
		NewTicketBO bo= new NewTicketBO(FromPlace, ToPlace, Date, people);
		NewTicketDAO dao = new NewTicketDAO();
		String str = dao.saveTicketDetails(bo);
		
		System.out.println("1....");
		System.out.println(str);
		req.getRequestDispatcher("result.html").forward(req, resp);
		
	}
	
	

}

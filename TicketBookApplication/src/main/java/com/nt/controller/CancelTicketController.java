package com.nt.controller;

import java.io.IOException;

import com.nt.dao.NewTicketDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/canurl")
public class CancelTicketController extends HttpServlet {
	
	
	private static final long serialVersionUID = 8583206120471765250L;

	public void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
		System.out.println("1...........");
    	String pnr = request.getParameter("pnr");
    	
    	NewTicketDAO dao = new NewTicketDAO();
        	 dao.cancelTicket(pnr);
        	 request.getRequestDispatcher("deleteSuccessfully.html").forward(request, response);
        }

}

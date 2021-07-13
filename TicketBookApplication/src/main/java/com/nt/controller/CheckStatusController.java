package com.nt.controller;

import java.io.IOException;

import com.nt.bo.TicketDetailBO;
import com.nt.dao.NewTicketDAO;
import com.nt.dao.TicketBookingDAO;
import com.nt.service.LoginValidation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/pnrurl")
public class CheckStatusController extends HttpServlet {
	
	

	 
	    /**
		 * 
		 */
		private static final long serialVersionUID = 8583206120471765250L;

		public void doPost(HttpServletRequest request,
	            HttpServletResponse response) throws ServletException, IOException {
			System.out.println("1...........");
	    	String pnr = request.getParameter("pnr");
	    	
	    	NewTicketDAO dao = new NewTicketDAO();
	        	 dao.displayTicketDetails(pnr);
	        }
	        
	       
	    	
	    }
		



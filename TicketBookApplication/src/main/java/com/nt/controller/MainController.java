
package com.nt.controller;

import java.io.IOException;


import com.nt.bo.TicketDetailBO;
import com.nt.dao.TicketBookingDAO;
import com.nt.service.LoginCreadentail;
import com.nt.service.LoginValidation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/registerurl")

public class MainController extends HttpServlet {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 8583206120471765250L;

	public void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
		System.out.println("1...........");
    	String username = request.getParameter("name123");
    	String emailID = request.getParameter("email");
    	
    	String gender = request.getParameter("gender");
    	String DateOfBirth = request.getParameter("DateOfBirth");
    	
    	String mobile = request.getParameter("mobile");
    	String address = request.getParameter("address");
    	String passwoed = request.getParameter("pwd");
    	
    	TicketDetailBO bo= new TicketDetailBO(username, emailID, gender, DateOfBirth, mobile, address, passwoed);
    	
LoginValidation valid = new LoginValidation();
        boolean status= valid.checkdetails(bo);
        if(!status)
        {
        	throw new MyException("Not vaid");
        }
        else
        {
        	 TicketBookingDAO dao= new TicketBookingDAO();
        	 dao.saveUserDetail(bo);
        	 request.getRequestDispatcher("result.html").forward(request, response);
        	 

        }
        request.getRequestDispatcher("index.html").forward(request, response);
        
       
    	
    }
	


}
package com.nt.controller;

import java.io.IOException;

import com.nt.bo.NewTicketBO;
import com.nt.bo.TicketDetailBO;
import com.nt.dao.NewTicketDAO;
import com.nt.service.LoginCreadentail;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/loginurl")
public class LoginController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("......");
		String emailID = request.getParameter("email");
		String passwoed = request.getParameter("pwt");

		TicketDetailBO bo= new TicketDetailBO( emailID,passwoed);
		LoginCreadentail creadentail = new LoginCreadentail();
		boolean status = creadentail.checkCreadentail(bo);
		if(status) {
			request.getRequestDispatcher("welcome.html").forward(request, resp);
		}
		else
			throw new MyException("Not vaid");

	}



}



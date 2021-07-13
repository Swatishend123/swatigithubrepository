package com.nt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.nt.bo.TicketDetailBO;

public class TicketBookingDAO implements TicketBookingDAOIface {

	
	
	@Override
	public void saveUserDetail(TicketDetailBO bo) {
		
		String username = bo.getName();
    	String emailID =bo.getEmail();
    	
    	String gender = bo.getGender();
    	String DateOfBirth = bo.getDateOfBirth();
    	
    	String mobile =bo.getMobile();
    	String address = bo.getAddrress();
    	String passwoed = bo.getPwt();
    	System.out.println(username);
    	System.out.println(emailID);
    	System.out.println(gender);
    	System.out.println(DateOfBirth);
    	System.out.println(mobile);
    	System.out.println(address);
    	System.out.println(passwoed);
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swati123", "root", "$wati431");
			PreparedStatement stmt = con.prepareStatement("insert into swati123.bookticket values(?,?,?,?,?,?,?)");
			//st.executeUpdate("insert into swati123.bookticket values("+username+","+emailID+","+gender+","+DateOfBirth+","+mobile+","+address+","+passwoed+")");
			
			
			
			stmt.setString(1, username);
			stmt.setString(2, emailID);

			stmt.setString(3, gender);
			stmt.setString(4, DateOfBirth);
			stmt.setString(5, mobile);
			stmt.setString(6, address);
			stmt.setString(7, passwoed);
			stmt.executeUpdate();
			System.out.println("executeUpdate");
			stmt.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}


}


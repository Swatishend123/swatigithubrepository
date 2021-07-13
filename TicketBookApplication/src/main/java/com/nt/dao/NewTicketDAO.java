package com.nt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.nt.bo.NewTicketBO;

public class NewTicketDAO implements NewTicketDAOIface{

	@Override
	public String saveTicketDetails(NewTicketBO bo) {
	
		String FromPlace = bo.getFromPlace();
		String ToPlace = bo.getToPlace();
		String Date = bo.getDate();
		int people = bo.getPeople();
		
		System.out.println(FromPlace);
		System.out.println(ToPlace);
		System.out.println(Date);
		System.out.println(people);
		int count =0;
		String str = null;
		String pnr = null;
		
try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swati123", "root", "$wati431");
			
			 String query = ("SELECT PNR FROM ticketdetails ORDER BY PNR DESC LIMIT 1;");
			 Statement st = con.createStatement();
		     ResultSet rs = st.executeQuery(query);
	         if (rs.next()) {
	             pnr = rs.getString(1);
	         }
			
			
			
			PreparedStatement stmt = con.prepareStatement("insert into ticketdetails values(?,?,?,?,?)");
			//st.executeUpdate("insert into swati123.bookticket values("+username+","+emailID+","+gender+","+DateOfBirth+","+mobile+","+address+","+passwoed+")");
			count = count++;
			 str = pnr+count;
			
			stmt.setString(1, str);
			stmt.setString(2, FromPlace);
			stmt.setString(3, ToPlace);

			stmt.setString(4, Date);
			stmt.setInt(5, people);
			
			stmt.executeUpdate();
			System.out.println("executeUpdate");
			stmt.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
return str;
		
	}

	@Override
	public String displayTicketDetails(String str) {
		
try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swati123", "root", "$wati431");
			PreparedStatement stmt = con.prepareStatement("select PNR, FromPlace, ToPlace, Date, NoOfPeople from ticketdetails where PNR=?");
			//st.executeUpdate("insert into swati123.bookticket values("+username+","+emailID+","+gender+","+DateOfBirth+","+mobile+","+address+","+passwoed+")");
			
			
			stmt.setString(1, str);
			ResultSet rs=stmt.executeQuery();
			System.out.println("executeQuery");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+", "+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getInt(5));
			}
			stmt.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return str;
	}

	@Override
	public String cancelTicket(String str) {
try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swati123", "root", "$wati431");
			System.out.println("proper database");
			PreparedStatement stmt = con.prepareStatement("delete from ticketdetails where PNR=?");
			
			
			stmt.setString(1, str);
			stmt.executeUpdate();
			System.out.println();
			System.out.println("deleted "+ str +"Successfully");
			stmt.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		
		return str;
	}

	
	}

		
	
	
	



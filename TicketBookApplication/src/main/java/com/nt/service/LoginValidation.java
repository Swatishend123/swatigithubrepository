package com.nt.service;

import java.util.ArrayList;

import com.nt.bo.TicketDetailBO;

public class LoginValidation {


	public boolean checkdetails(TicketDetailBO bo) {
		
		boolean flag =true;
		String username = bo.getName();
    	String emailID =bo.getEmail();
    	
    	String gender = bo.getGender();
    	String DateOfBirth = bo.getDateOfBirth();
    	
    	String mobile =bo.getMobile();
    	String address = bo.getAddrress();
    	String passwoed = bo.getPwt();
    	
    	
    	if(username=="")
    	{ 
    		System.out.println("Username cannot be empty");
    	   flag=false;
    	}
    	
    	else
    		if(username.length()<5 || username.length()>25)
    		{
    			System.out.println("Username length must be in betwwen 5 to 25");
    			flag=false;
	    }
    	
    	
    	if(emailID=="")
    	{
    		System.out.println("email cannot be empty");
    		flag=false;
    	}
    	else
          if(!emailID.contains("@")) {	
        	  System.out.println("mailId should in proper format");
        	  flag=false;
       }
	   if(mobile=="")
	   {
		   System.out.println("Mobile Number should not be empty");
		   flag=false;
	   }
	   else if(mobile.length()<=9 || mobile.length()>=11)
	   {
		   System.out.println("Mobile no should not more than 10 digit");
		   flag=false;
	   }
	   
	   if(passwoed=="")
   	{
   		System.out.println("password cannot be empty");
   		flag=false;
   	}
   	else
   	   if(passwoed.length()<6 || passwoed.length()>9)
   	   {
   		   System.out.println("Password length must be in betwwen 6 to 9");
   		   flag=false;
   	   }
   	   else if(!(passwoed.contains("@") || passwoed.contains("#") || passwoed.contains("$") || passwoed.contains("&") || passwoed.contains("~") || passwoed.contains("?")));
	       System.out.println("need some special character");
		 return flag;
		   
    	
	}

	
	
	

}

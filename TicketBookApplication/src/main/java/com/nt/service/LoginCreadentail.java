package com.nt.service;

import com.nt.bo.TicketDetailBO;

public class LoginCreadentail {

	
	
	
	public boolean checkCreadentail(TicketDetailBO bo) {

		boolean flag =true;
    	String emailID =bo.getEmail();
    	
    	String passwoed = bo.getPwt();
    	
    	
    	
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

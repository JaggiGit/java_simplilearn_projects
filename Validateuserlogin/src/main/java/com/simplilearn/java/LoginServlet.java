package com.simplilearn.java;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           String username=request.getParameter("uname");
           String password=request.getParameter("pword");
           
           ServletConfig config= getServletConfig();
           String uname = config.getInitParameter("Username1");
           String pword = config.getInitParameter("Password1");
           
           if(username.equals("uname") && password.equals("pword") )
           { 
        	   System.out.println("User is valid ");  
           }
           else 
        	   System.out.println("User is Invalid "); 
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}

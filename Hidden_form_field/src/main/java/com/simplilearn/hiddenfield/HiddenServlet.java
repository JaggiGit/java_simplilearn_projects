package com.simplilearn.hiddenfield;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class HiddenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String uname1= request.getParameter("uname") ;
		PrintWriter writer = response.getWriter()	;
		writer.println(" <form  action = 'http://localhost:2122/Hidden_form_field/HiddenServlet2'  method ='post' > " ) ;
		writer.println("<input type ='hidden' name='username' value='"+uname1+"'/> ");
		writer.println(" <input type = 'submit' value= 'Click'");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

package com.hellos_ervelet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;  
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Helloservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String requestFor=request.getParameter("task");
		System.out.println(requestFor) ;
	if(requestFor.equals("login"))
		{
			RequestDispatcher rd =  request.getRequestDispatcher("/LoginServlet");
		rd.forward(request, response)	;
		}
		else {
			response.sendRedirect("/RegisteruserServlet");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	}
}

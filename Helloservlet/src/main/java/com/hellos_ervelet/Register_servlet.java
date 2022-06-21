package com.hellos_ervelet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.simplilearn.dto.User;
import com.simplilearn.service.Userserviceimpl;


public class Register_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String address=request.getParameter("address");
		String username=request.getParameter("uname");
		String password = request.getParameter("password");
		
		User user= new User (fname,lname,address,username,password) ;
		boolean Isuserregistered = new Userserviceimpl().registerUser(User);
		
		if(Isuserregistered==true)
		{
			response.sendRedirect("New.html") ;
		}
		else
		{
			response.sendRedirect("Register.html");
		}
		
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			}

}

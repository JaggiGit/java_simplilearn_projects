package com.hellos_ervelet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.simplilearn.dto.User;
import com.simplilearn.service.Userserviceimpl;


public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name = request.getParameter("Maninder");
		String password= request.getParameter("pword");
		
		User user = new User (name, password) ;
		
		boolean Isuservalid = new Userserviceimpl().Validateuser(user);
		
	   if(Isuservalid==true)
	   {
		   System.out.println("User validated") ;
		    }
	   else
	   {
		   response.sendRedirect("New.html");
	   }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

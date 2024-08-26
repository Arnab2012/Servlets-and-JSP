package com.arnab.Servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class LoginServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upwd");
		
		RequestDispatcher rd=null;
		if(uname.equals("Arnab") && upwd.equals("arnab")) {
			System.out.println("Login successful");
//			rd=request.getRequestDispatcher("success.html");
//			rd.forward(request, response);
		}
		else {
			System.out.println("Login Unsuccessful");
//			rd=request.getRequestDispatcher("failure.html");
//			rd.forward(request, response);
		}
	}

}

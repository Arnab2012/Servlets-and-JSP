package com.arnab.Servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Bank extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upwd");
		String unum=request.getParameter("unum");
		
		RequestDispatcher rd=null;
		
		if(uname.equals("Arnab") && upwd.equals("arnab") && unum.equals("12345")) {
			System.out.println("Login successful");
			rd=request.getRequestDispatcher("account.html");
			rd.forward(request, response);
		}
		else {
			System.out.println("Login unsuccessful");
			rd=request.getRequestDispatcher("failure.html");
			rd.forward(request, response);
		}
	}

}

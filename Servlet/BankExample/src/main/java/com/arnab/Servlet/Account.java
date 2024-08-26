package com.arnab.Servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Account extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bal=2000;
		String amount=request.getParameter("amount");
		RequestDispatcher rd=null;
		
		int amt=Integer.parseInt(amount);
		if(amt<=bal) {
			System.out.println("Withdrawal successful");
			rd=request.getRequestDispatcher("success.html");
			rd.forward(request, response);
		}
		else {
			System.out.println("Withdrawal unsuccessful");
			rd=request.getRequestDispatcher("account.html");
			rd.forward(request, response);
		}
	}
}

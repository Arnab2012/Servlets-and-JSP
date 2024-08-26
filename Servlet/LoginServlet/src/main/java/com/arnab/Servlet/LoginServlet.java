package com.arnab.Servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upwd");
		
		RequestDispatcher rd=null;
		if(uname.equals("Arnab") && upwd.equals("arnab")) {
			rd=request.getRequestDispatcher("success.html");
			rd.forward(request, response);
		}
		else {
			rd=request.getRequestDispatcher("failure.html");
			rd.forward(request, response);
		}
	}

}

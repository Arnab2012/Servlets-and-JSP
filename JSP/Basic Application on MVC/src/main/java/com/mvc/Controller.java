package com.mvc;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param=request.getParameter("page");
		if(param.equals("login")) {
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		else if(param.equals("signup")) {
			request.getRequestDispatcher("/signup.jsp").forward(request, response);
		}
		else if(param.equals("about")) {
			request.getRequestDispatcher("/about.jsp").forward(request, response);
		}
		else {
			request.getRequestDispatcher("/noaction.jsp").forward(request, response);
		}
	}


}

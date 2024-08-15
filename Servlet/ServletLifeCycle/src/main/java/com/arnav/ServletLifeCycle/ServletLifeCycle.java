package com.arnav.ServletLifeCycle;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

/**
 * Servlet implementation class ServletLifeCycle
 */
public class ServletLifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static {
		System.out.println("*****Servlet Loaading*****");
	}
    public ServletLifeCycle() {
        System.out.println("*****Servlet Instantiation*****");
    }

	
	public void init() throws ServletException {
		System.out.println("*****Servlet Initialization*****");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("*****Request Processing*****");
	}
	
	public void destroy() {
		System.out.println("*****Servlet Deinstantiation*****");
	}
}

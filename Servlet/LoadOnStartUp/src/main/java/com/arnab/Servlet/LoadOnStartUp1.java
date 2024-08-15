package com.arnab.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class LoadOnStartUp1
 */
public class LoadOnStartUp1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	static {
		System.out.println("*****Second Servlet Loaading*****");
	}
    public LoadOnStartUp1() {
        System.out.println("*****Second Servlet Instantiation*****");
    }

	
	public void init() throws ServletException {
		System.out.println("*****Second Servlet Initialization*****");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("*****Second Request Processing*****");
	}
	
	public void destroy() {
		System.out.println("*****Second Servlet Deinstantiation*****");
	}
}

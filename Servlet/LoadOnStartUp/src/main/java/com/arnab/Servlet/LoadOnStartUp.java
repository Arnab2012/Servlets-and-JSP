package com.arnab.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class LoadOnStartUp
 */
public class LoadOnStartUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	static {
		System.out.println("*****First Servlet Loaading*****");
	}
    public LoadOnStartUp() {
        System.out.println("*****First Servlet Instantiation*****");
    }

	
	public void init() throws ServletException {
		System.out.println("*****First Servlet Initialization*****");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("*****First Request Processing*****");
	}
	
	public void destroy() {
		System.out.println("*****First Servlet Deinstantiation*****");
	}
}

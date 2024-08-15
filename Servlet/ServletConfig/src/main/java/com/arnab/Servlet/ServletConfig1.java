package com.arnab.Servlet;

import jakarta.servlet.*;
import java.io.*;
import java.util.Enumeration;

public class ServletConfig1 extends GenericServlet{
	public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
//		getting ServletConfig object
		ServletConfig config=getServletConfig();
		String lname=config.getServletName();
		
//		getting initialization parameters
		String value1=config.getInitParameter("name1");
		String value2=config.getInitParameter("name2");
		
//		getting parameter names
		Enumeration<String> e=config.getInitParameterNames();
		String param="";
		while(e.hasMoreElements()) {
			param+=e.nextElement()+"<br>";
		}
		
		out.println("<html>");
		out.println("<body>");
		out.println("Logical Name : "+lname+"<br>");
		out.println("Value1 : "+value1+"<br>");
		out.println("Value2 :"+value2+"<br>");
		
		out.println("Parameters "+"<br>");
		out.println(param);
		out.println("</body>");
		out.println("</html>");
	}
}

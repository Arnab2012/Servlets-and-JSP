package com.arnab.Servlet;

import jakarta.servlet.*;
import java.io.*;
import java.util.Enumeration;

public class ServletContext1 extends GenericServlet{
	public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
//		getting ServletContext object
		ServletContext context=getServletContext();
		String lname=context.getServletContextName();
		
//		getting context parameters
		String value1=context.getInitParameter("name1");
		String value2=context.getInitParameter("name2");
		
//		getting parameter names
		Enumeration<String> e=context.getInitParameterNames();
		String param="";
		while(e.hasMoreElements()) {
			param+=e.nextElement()+"<br>";
		}
		
//		set attributes
		context.setAttribute("Cname", "Java");
		context.setAttribute("CID", "C1");
//		get attributes
		String cname=(String)context.getAttribute("Cname");
		String cid=(String)context.getAttribute("CID");
		
//		get attributes name
		Enumeration<String> e1=context.getAttributeNames();
		String attr="";
		while(e1.hasMoreElements()) {
			attr+=e1.nextElement()+"<br>";
		}
		
		out.println("<html>");
		out.println("<body>");
		out.println("Logical Name : "+lname+"<br>");
		out.println("Value1 : "+value1+"<br>");
		out.println("Value2 :"+value2+"<br>");
		
		out.println("Parameters "+"<br>");
		out.println(param);
		
		out.println("Cname : "+cname+"<br>");
		out.println("CID :"+cid+"<br>");
		
		out.println("Attributes "+"<br>");
		out.println(attr);
		out.println("</body>");
		out.println("</html>");
		
	}
}

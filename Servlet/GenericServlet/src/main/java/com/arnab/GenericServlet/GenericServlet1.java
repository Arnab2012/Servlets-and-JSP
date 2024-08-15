package com.arnab.GenericServlet;

import jakarta.servlet.*;
import java.io.*;

public class GenericServlet1 extends GenericServlet{
	public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
        out.println("<body>");
        out.println("<h2>");
        out.println("<font color='red'>");
        out.println("<b>");
        out.println("Servlet Program extending GenericServlet");
        out.println("</b></font>"); 
        out.println("</h2>");
        out.println("<hr>"); 
        out.println("</body>");
        out.println("</html>");
	}
}

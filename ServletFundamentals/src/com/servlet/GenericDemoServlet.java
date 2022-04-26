package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebInitParam;



@WebServlet(name = "GenericServlet", initParams = {
	    @WebInitParam(name = "username", value = "Kani"),
	    @WebInitParam(name = "password", value = "Pass@123")
	}, urlPatterns = "/hello")
public class GenericDemoServlet extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
        PrintWriter printWriter = res.getWriter();
        printWriter.print("<html>");
        printWriter.print("<body>");
        printWriter.print("<h1>Hello World GenericServlet Class Example</h1>");
        printWriter.print("<p> Servlet name :: " + getServletName() + "</p>");
        printWriter
            .print("<p> Servlet username init parameter :: " + getInitParameter("username") + "</p>");
        printWriter
            .print("<p> Servlet password init parameter :: " + getInitParameter("password") + "</p>");
        printWriter.print("</body>");
        printWriter.print("</html>");
        printWriter.close(); 
        
        
		
	}

}

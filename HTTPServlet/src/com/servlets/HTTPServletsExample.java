package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "HttpServlet", initParams = {
	    @WebInitParam(name = "username", value = "Kani"),
	    @WebInitParam(name = "password", value = "Pass@123")
	}, urlPatterns = "/hello")
public class HTTPServletsExample extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
		response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        printWriter.print("<html>");
        printWriter.print("<body>");
        printWriter.print("<h1>Hello World HttpServlet Class Example</h1>");
        printWriter.print("<p> Servlet name :: " + getServletName() + "</p>");
        printWriter
            .print("<p> Servlet username init parameter :: " + getInitParameter("username") + "</p>");
        printWriter
            .print("<p> Servlet password init parameter :: " + getInitParameter("password") + "</p>");
        printWriter.print("</body>");
        printWriter.print("</html>");
        printWriter.close(); 
        
        HttpSession h =request.getSession();
    }

}

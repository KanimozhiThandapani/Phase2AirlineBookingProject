package com.sample.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sample.pojo.Flight;
import com.sample.service.BaseService;
import com.sample.service.BaseServiceImpl;

public class RegistrationPageController extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     response.sendRedirect("registrationPage.jsp");
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = "registrationPage.jsp";
		HttpSession session = request.getSession();
	     Flight flight = (Flight) session.getAttribute("Flight");        
	     String userName = "kanimozhit34@gmail.com";
	     BaseService bookedFlightService = new BaseServiceImpl();
	     boolean flag = bookedFlightService.bookedFlight(flight, userName);
	     System.out.println("BookedFlight Flag:"+flag);
		request.getRequestDispatcher(page).include(request, response);
	}
}

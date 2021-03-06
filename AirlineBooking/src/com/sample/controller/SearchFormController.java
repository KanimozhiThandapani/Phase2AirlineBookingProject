package com.sample.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sample.dao.BaseDao;
import com.sample.dao.BaseDaoImpl;
import com.sample.pojo.Flight;
import com.sample.pojo.User;
import com.sample.service.BaseService;
import com.sample.service.BaseServiceImpl;

public class SearchFormController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     response.sendRedirect("flightDetails.jsp");
    }
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String source = request.getParameter("source");
		  String destination = request.getParameter("destination");
		  System.out.println("source...+"+source);
		  System.out.println("destination...+"+destination);
		  
		  BaseService loginService = new BaseServiceImpl();
		  List<Flight> flagList = loginService.flightDetails(source, destination);
		  for(Flight row : flagList){
			  String flightCode = row.getAirline();
			   	System.out.println(row.getFlightcode());	  
			   }  
		  request.setAttribute("flights", flagList);
		  
		  String page = "flightDetails.jsp";
		   
		  request.getRequestDispatcher(page).include(request, response);
		 }
	
	
	
}

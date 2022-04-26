<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.sample.pojo.Flight"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Available Flights</title>

<style>
input[type=submit] {
  width: 30%;
  background-color: purple;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  text-align: center;
}

input[type=submit]:hover {
  background-color: #45a049;
  text-align: center;
}

h3 {
  text-align: center; 
  font-size: 2em;
  color: blue;
}

</style>

</head>
<body style="background-color:lightblue;">
<br> <br> <br> <br>
<div align="center">
<h1>Available Flights</h1>
		<form action="registerPage" method="post">
			<table border ="1" width="500" align="center">
	           
	           <tr bgcolor="thistle" >
          <th><b>Flight Code</b></th>
          <th><b>Source</b></th>
          <th><b>Destination</b></th>
          <th><b>AirlineName</b></th>
          <th><b>StartTime</b></th>
          <th><b>ReachTime</b></th>
          <th><b>Price</b></th>
          <th><b>Confirm Booking</b></th>
         </tr>
        <%-- Fetching the attributes of the request object
             which was previously set by the servlet 
              "StudentServlet.java"
        --%> 
        <%ArrayList<Flight> std = 
            (ArrayList<Flight>)request.getAttribute("flights");
        for(Flight f:std){%>
        <%-- Arranging data in tabular form
        --%>
            <tr>
                <td><input type="checkbox" id="booked" name="booked" value="booked"></td>
                <td><%=f.getFlightcode()%></td>
                <td><%=f.getSource()%></td>
                <td><%=f.getDestination()%></td>
                <td><%=f.getAirline()%></td>
                <td><%=f.getStarttime()%></td>
                <td><%=f.getReachtime()%></td>
                <td><%=f.getPrice()%></td>
                
            </tr>
                
             <%
             Flight flight = new Flight();
             flight.setFlightcode(f.getFlightcode());
             flight.setSource(f.getSource());
             flight.setDestination(f.getDestination());
             flight.setAirline(f.getAirline());
             flight.setStarttime(f.getStarttime());
             flight.setReachtime(f.getReachtime());
             flight.setPrice(f.getPrice());
             session.setAttribute("Flight", flight);
         
             
            %>  
            
            <%}%>
 
			</table>
			
			<input type="submit" value="Book" style="background: green;color: white;">
			
			</form>
		
	</div>


</body>
</html>
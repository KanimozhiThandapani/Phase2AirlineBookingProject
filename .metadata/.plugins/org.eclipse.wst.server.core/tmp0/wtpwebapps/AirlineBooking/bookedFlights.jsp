<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
h3 {
  text-align: center; 
  font-size: 2em;
  color: red;
}
input[type=submit] {
  width: 10%;
  background-color: green;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  font-size: 1em;
  text-align: center;
}

input[type=submit]:hover {
  background-color: #45a049;
  text-align: center;
}
th, td {
    font-size: 20px;
  }
</style>
</head>


<body style="background-color:lightblue;">
<br> 
<h3> Kindly Check the Booking Details and Confirm payment!!</h3>
<div align="center">
		<form action="paymentPage" method="get">

   <br> <br> <br> <br> <br> 
   <table align="center" border="1">
   <tr bgcolor="thistle" >
          <th><b>No. Of Travellers</b></th>
          <th><b>Traveller Details</b></th>
          <th><b>Flight Code</b></th>
          <th><b>Source</b></th>
          <th><b>Destination</b></th>
          <th><b>AirlineName</b></th>
          <th><b>Date</b></th>
          <th><b>StartTime</b></th>
          <th><b>ReachTime</b></th>
          <th><b>Price</b></th>
    </tr>
         
   <tr>
                    <td>3</td>
                    <td>Kanimozhi Thandapani|Nishal Kumaresan|Kumaresan Dhandapani</td>
                    <td>Indigo-629</td>
					<td>Chennai</td>
					<td>Bengaluru</td>
					<td>Indigo</td>
					<td>12/05/2022</td>
					<td>21:25:00</td>
					<td>22:20:00</td>
					<td>3,208</td>
	</tr>
				
	</table>			
	                <br>  <br>  <br>  <br> <br>  <br>  <br>  <br>
					<input type="submit" value="Confirm Payment">
					<input type="submit" value="Cancel">
				
   
   </form>
   </div>
</body>
</html>
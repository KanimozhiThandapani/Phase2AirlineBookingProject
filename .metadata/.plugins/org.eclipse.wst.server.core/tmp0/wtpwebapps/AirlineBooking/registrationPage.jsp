<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>:: Login ::</title>
<style>
h1 {
  font-size: 40px;
  color: red;
  font-family: 'Brush Script MT', cursive;
}

input[type=submit] {
  width: 20%;
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

div {
  border-radius: 5px;
  background-color: thistle;
  padding: 20px;
}

h3 {
  text-align: right; 
  font-size: 1.2em;
  color: black;
}

h3 {
  text-align: right; 
  font-size: 1em;
  color: green;
}
</style>
</head>
<body style="background-color:lightblue;">
<form action="bookedFlights" method="get">
   <h1>Traveller 1 Details</h1>
   
   <div>
    <label for="name" style="font-size: 20px"><strong>Name :</strong></label>
    <input type="text" name="t1username" style="width:250px;height: 28px;background: aliceblue;" required="required"> <br> <br>
     
    <label for="dob" style="font-size: 20px"><strong>Date Of Birth :</strong></label>
    <input type="date" name="t1dob" style="width:250px;height: 28px;background: aliceblue;" required="required"> <br> <br>
    
    <label for="mobNumber" style="font-size: 20px"><strong>Mobile Number :</strong></label>
    <input type="number" name="t1mobileNo" style="width:250px;height: 28px;background: aliceblue;" required="required"> <br> <br>
    
    <label for="address" style="font-size: 20px"><strong>Address :</strong></label>
    <input type="text" name="t1address" style="width:250px;height: 28px;background: aliceblue;" required="required"> <br> <br>
  
 </div>
 <h1>Traveller 2 Details</h1>
 <div>
    <label for="name" style="font-size: 20px"><strong>Name :</strong></label>
    <input type="text" name="t1username" style="width:250px;height: 28px;background: aliceblue;" required="required"> <br> <br>
     
    <label for="dob" style="font-size: 20px"><strong>Date Of Birth :</strong></label>
    <input type="date" name="t1dob" style="width:250px;height: 28px;background: aliceblue;" required="required"> <br> <br>
    
    <label for="mobNumber" style="font-size: 20px"><strong>Mobile Number :</strong></label>
    <input type="number" name="t1mobileNo" style="width:250px;height: 28px;background: aliceblue;" required="required"> <br> <br>
    
    <label for="address" style="font-size: 20px"><strong>Address :</strong></label>
    <input type="text" name="t1address" style="width:250px;height: 28px;background: aliceblue;" required="required"> <br> <br>
  
 </div>
 <h1>Traveller 3 Details</h1>
 <div>
    <label for="name" style="font-size: 20px"><strong>Name :</strong></label>
    <input type="text" name="t1username" style="width:250px;height: 28px;background: aliceblue;" required="required"> <br> <br>
     
    <label for="dob" style="font-size: 20px"><strong>Date Of Birth :</strong></label>
    <input type="date" name="t1dob" style="width:250px;height: 28px;background: aliceblue;" required="required"> <br> <br>
    
    <label for="mobNumber" style="font-size: 20px"><strong>Mobile Number :</strong></label>
    <input type="number" name="t1mobileNo" style="width:250px;height: 28px;background: aliceblue;" required="required"> <br> <br>
    
    <label for="address" style="font-size: 20px"><strong>Address :</strong></label>
    <input type="text" name="t1address" style="width:250px;height: 28px;background: aliceblue;" required="required"> <br> <br>
  
 </div>
 <br> <br>
 
 <input type="submit" value="Enter" style="font-size: 25px;background: green;color: #FFF;"><br> <br>
 </form>
</body>
</html>

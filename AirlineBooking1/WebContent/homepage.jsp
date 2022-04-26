<!DOCTYPE html>
<html>
<style>
input[type=text], select {
  width: 50%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
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
  text-align: center; 
  font-size: 3em;
  color: black;
}
</style>
<body style="background-color:lightblue;">


<h3>Welcome To FlyAway!!</h3>

<div>
  <form action="flightDetails" method="post">

    <label for="source" style="font-size: 30px"><strong>Source* :</strong></label>
    <select id="source" name="source" style="width:200px;height: 40px; background: purple; color: #FFF;">
      <option value="bengaluru">Bengaluru</option>
      <option value="chennai">Chennai</option>
      <option value="kochi">Kochi</option>
      <option value="mumbai">Mumbai</option>
    </select><br>
    
    <label for="destination" style="font-size: 30px"><strong>Destination* :</strong></label>
    <select id="destination" name="destination" style="width:200px;height: 40px; background: purple; color: #FFF;">
      <option value="bangkok">Bangkok</option>
      <option value="bengaluru">Bengaluru</option>
      <option value="mumbai">Mumbai</option>
      <option value="newDelhi">New Delhi</option>
    </select><br>
    
    <label for="dateOfTravel" style="font-size: 30px"><strong>Date Of Travel* :</strong></label>
    <input type="date" id="dot" name="dot" style="width:200px;height: 40px; background: purple; color: #FFF;" required><br><br>

    <label for="numberOfPersons" style="font-size: 30px"><strong>Number Of Persons* :</strong></label>
    <input type="number" name="numberOfPersons" style="width:200px;height: 40px; background: purple; color: #FFF;" required><br><br>
  
    <input type="submit" value="Search" style="font-size: 25px">
  </form>
</div>

</body>
</html>



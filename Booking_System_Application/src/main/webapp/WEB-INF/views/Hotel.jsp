<html>

<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" ></script>
<script type = "text/javascript"> 
function AddHotelData() {
/**
window.open("/addhotel","_self");
**/
} 
function UserPage() {

window.open("/user","_self");
}
</script>
</head>

</head>
<body>
<div class="container-fluid col-offset-3 col-md-6  centered">
<h2 style="text-align:center">Hotel information</h2>
<form id="login"  method="post"  modelAttribute="hotel">
  <div class="form-group">
    <label for="hotelname" path="hotelname">Hotel name:</label>
    <input class="form-control" id="hotelname" path="hotelname" name="hotelname">
  </div>
  <div class="form-group">
    <label for="location" path="location">Location:</label>
    <input class="form-control" id="location" path="location" name="location">
  </div> 
  <%--
  <div class="form-group">
    <form:label for="availdate" path="availdate">Avail Date:</label>
    <form:input type="date" class="form-control" id="availdate" path="availdate"  name="availdate">
  </div>
 <div class="form-group">
    <form:label for="noofrooms">Number of rooms:</label>
    <form:input type="text" class="form-control" id="noofrooms" name="noofrooms">
  </div>
 <div class="form-group">
    <form:label for="noofstars">Number of stars:</label>
    <form:input type="text" class="form-control" id="noofstars" name="noofstars">
  </div>
 <div class="form-group">
    <form:label for="wifi">Is Wifi Available:</label>
    <form:input type="text" class="form-control" id="wifi" name="wifi">
  </div>
 <div class="form-group">
    <form:label for="restaurnaut">Is Restaurnaut Available:</label>
    <form:input type="text" class="form-control" id="restaurnaut" name="restaurnaut">
  </div>
  
 <div class="form-group">
    <form:label for="ac">AC:</label>
    <form:input type="text" class="form-control" id="ac" name="ac">
  </div>
  
 <div class="form-group">
    <form:label for="mealsincluded">Is Meals included:</label>
    <form:input type="text" class="form-control" id="mealsincluded" name="mealsincluded">
  </div> --%> 
  <button type="submit" class="btn btn-primary"  name="add" >Add hotel</button>
   <button type="submit" class="btn btn-primary" name="delete">Delete hotel </button>
</form>
</div>
</body>
</html>
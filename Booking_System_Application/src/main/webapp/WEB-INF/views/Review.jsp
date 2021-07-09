<body>
<div class="container-fluid col-offset-3 col-md-6  centered">
<h2 style="text-align:center">Review details</h2>
<form id="login"  method="post"  modelAttribute="review">
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
</body>
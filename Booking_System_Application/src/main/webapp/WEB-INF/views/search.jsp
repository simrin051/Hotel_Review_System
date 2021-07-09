<html>

<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" ></script>
</head>
<body>

<div class="container-fluid col-offset-3  col-md-6  centered">
<h2 style="text-align:center">Search Hotel</h2>
<form method="POST" action="/search" modelAttribute="searchhotel">
  <div class="form-group col-md-12">
    <label for="City">City</label>
    <input type="text" class="form-control " id="City" >
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group col-md-12">
    <label for="Date of requirement">Date of requirement</label>
    <input type="date" class="form-control" id="Date of requirement" >
  </div>
  <div class="form-group col-md-12">
    <label for="rooms">Number of rooms</label>
    <input type="number" class="form-control" id="rooms" >
  </div>
    <div class="form-group col-md-12">
    <label for="stars">Stars</label>
       <select name="stars" id="stars">
        <c:forEach  var="category">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
        </c:forEach>
    </select>

  </div>
   
    <div class="form-group col-md-12">
    <label for="wifi">Wifi</label>
    <input type="number" class="form-control" id="wifi">
  </div>
    <div class="form-group col-md-12">
    <label for="restaurant">Restaurant</label>
    <input type="text" class="form-control" id="restaurant">
  </div>
    <div class="form-group col-md-12">
    <label for="AC">AC</label>
    <input type="number" class="form-control" id="AC">
  </div>
  <div class="form-group col-md-12">
    <label for="meals">Meals</label>
    <input type="number" class="form-control" id="meals">
  </div>
  
  <button type="submit" class="btn btn-primary " style="margin-left: 12px " name="search">Submit</button>
</form>
</div>
</body>
</html>

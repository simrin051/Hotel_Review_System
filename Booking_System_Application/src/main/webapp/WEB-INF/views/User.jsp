<html>

<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" ></script>
</head>
<body>
<div class="container-fluid col-offset-3 col-md-6  centered">
<h2 style="text-align:center">User information</h2>
<form id="userform"  method="post" modelAttribute="user">
  <div class="form-group">
    <label for="username">User name:</label>
    <input type="text" class="form-control" id="username"  path="username" name="username">
  </div>
  <div class="form-group">
    <label for="phoneno">Phone no:</label>
    <input type="text" class="form-control" id="phonenumber" path="phonenumber" name="phonenumber">
  </div>
 <button type="submit" class="btn btn-primary" name="adduser">Register </button>
 <button type="submit" class="btn btn-primary" name="deleteuser">Delete </button>
 	
</form>
</div>
</body>
</html>
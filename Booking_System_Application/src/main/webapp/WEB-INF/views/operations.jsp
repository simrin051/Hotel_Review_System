<html>

<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" ></script>
<script type = "text/javascript">
function HotelPage() {
window.open("/hotel","_self");
}
function UserPage() {

window.open("/user","_self");
}
</script>
</head>
<%

%>
<body>
<div class="col-md-12  offset-md-3">
<h2>Add/Delete operations on Hotel and User</h2>
<div class="container-fluid col-offset-3 centered">
<button class="btn btn-primary" onclick="HotelPage()" >Add Hotel/Delete Hotel</button>  
<button class="btn btn-primary"  onclick="UserPage()">Add User/Delete User</button>
 <button type="submit" class="btn btn-primary" name="review">Add Review/Delete Review </button>

</div>
</div>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<meta charset="ISO-8859-1">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<title>Edit Details</title>
</head>
<body>
<%@ include file="header.jsp" %>
<div class="row">
<div class=" mx-auto  m-5">
<div class="card" style="width: 21rem;">
    <form action="updateProfile" class = p-4>
  <div class="form-group">
    <label >Customer Id:</label>
    <input type="number" class="form-control" name="name" readonly="readonly" value="${sessionScope.customer.customerId}">
  </div>
  <div class="form-group">
    <label >Username:</label>
    <input type="text" class="form-control" name="name" readonly="readonly" value="${sessionScope.customer.customerName}">
  </div>
  <div class="form-group">
    <label >Email address:</label>
    <input type="email" class="form-control" name="email" value="${sessionScope.customer.customerEmail}">
  </div>
  <div class="form-group">
    <label >Address:</label>
    <input type="text" class="form-control" name="address" value="${sessionScope.customer.customerAddress}">
  </div>
   <div class="form-group">
    <label >Date-Of-Birth:</label>
    <input type="date" class="form-control" name="dob" value="${sessionScope.customer.customerDateOfBirth}">
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>
</div>
</div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
  </body>


</body>
</html>
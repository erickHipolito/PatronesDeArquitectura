<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" 
	href="resources/bootstrap-4.2.1-dist/css/bootstrap.min.css" 
	>
	<meta charset="UTF-8">
<title>Principal</title>
</head>
<body>
	
	<div class="container">
		<hr>
	  	<h1>ARQUITECTURA EN CAPAS</h1>
	  	<hr>
	  	<form action="#Controller" method="get">
	  	 <div class="form-group row">
		    <label for="inputNameClient" class="col-sm-2 col-form-label">Nombre Cliente:</label>
		    <div class="col-sm-9">
		      <input type="text" class="form-control" id="inputNameClient" placeholder="Nombre del Cliente">
		    </div>
		  </div>
		  <div class="form-group row">
		    <label for="inputIdDeptoClient" class="col-sm-2 col-form-label">Departamento del cliente:</label>
		    <div class="col-sm-9">
		      <input type="text" class="form-control" id="inputIdDeptoClient" placeholder="Id depto. Cliente">
		    </div>
		  </div>
		  <div class="form-group row">
		    <label for="inputIdDireccionClient" class="col-sm-2 col-form-label">Direccion del cliente:</label>
		    <div class="col-sm-9">
		      <input type="text" class="form-control" id="inputIdDireccionClient" placeholder="Id Direccion Cliente">
		    </div>
		  </div>
		   <div class="form-group row">
		    <label for="inputEmail" class="col-sm-2 col-form-label">Email</label>
		    <div class="col-sm-9">
		      <input type="email" class="form-control" id="inputEmail" placeholder="Email">
		    </div>
		  </div>
		   <div class="form-group row">
		    <label for="inputPassword" class="col-sm-2 col-form-label">Password</label>
		    <div class="col-sm-9">
		      <input type="password" class="form-control" id="inputPassword" placeholder="Password">
		    </div>
		  </div>
		  <input class="btn btn-primary" type="submit" value="Consultar" >
	  	
	  	 
	</div>
	
	
</body>
</html>
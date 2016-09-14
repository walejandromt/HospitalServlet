<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="/hospital/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<%=request.getAttribute("r") == null ? "" : request.getAttribute("r") %>

<div  class="container">

<form class="form-horizontal" action="/hospital/registrar" method="get">
  
  Nombre: <input type="text" name="nombre"><br>
  Edad  : <input type="text" name="edad"><br>
  
  Especialidad  : <input type="text" name="especialidad"><br>
  
    <label>
    <input type="radio" name="sexo" id="optionsRadios1" value="MASCULINO" checked>
    MASCULINO
  </label>
  
      <label>
    <input type="radio" name="sexo" id="optionsRadios1" value="FEMENINO" checked>
    FEMENINO
  </label>
  <br>
 
  RFC  : <input type="text" name="rfc"><br>
  
 
  Email: <input type="email" name="email"><br>
  Passw: <input type="password" name="password"><br>
  
  <input class="btn btn-success" type="submit" value="Guardar">
  </form>
</div>



</body>
</html>
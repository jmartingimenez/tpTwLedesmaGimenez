<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<!-- Bootstrap core CSS -->
	    <link href="css/bootstrap.min.css" rel="stylesheet" >
	    <!-- Bootstrap theme -->
	    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
	</head>
<body> 	 
	<h3>Suma</h3>
	<div class="container">
		<form:form action="validar-numeros" method="POST" modelAttribute="operacion">
			<form:input path="valor1" type="text" class="form-control" id="valor1" placeholder="Valor 1"/>
			<h1><div class="mas">+</div></h1>
			<form:input path="valor2" type="text" class="form-control" id="valor2" placeholder="Valor 2"/>		
			<button class="btn btn-lg btn-success btn-block btn-editar" Type="Submit">Sumar</button>
		</form:form>
	</div>
	
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script>
	<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script>        
</body>
</html>
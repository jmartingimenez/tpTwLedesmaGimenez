<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<!-- Bootstrap core CSS -->
	    <link href="css/bootstrap.min.css" rel="stylesheet" >
	    <!-- Bootstrap theme -->
	    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
	    <link href="css/css2.css" rel="stylesheet">
	</head>
<body> 	 
<div class="row">
        <div class="col-md-4"></div> 
        <div class="col-md-4 recuadro"> 
	<h3><div class="texto">Suma</div></h3>
	
		<form:form action="obtener-resultado" method="POST" modelAttribute="operacion">
		<div class="conteiner">
			<form:input path="valor1" type="text" class="form-control" id="valor1" placeholder="Valor 1"/>
			<h1><div class="mas">+</div></h1>
			<form:input path="valor2" type="text" class="form-control" id="valor2" placeholder="Valor 2"/>	
			</div>	
			<button class="btn btn-lg btn-success btn-block btn-editar" Type="Submit">Sumar</button>
			
		</form:form>
	      
        </div> 
        <div class="col-md-4"></div> 
    </div>
        
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script>
	<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script>        
</body>
</html>
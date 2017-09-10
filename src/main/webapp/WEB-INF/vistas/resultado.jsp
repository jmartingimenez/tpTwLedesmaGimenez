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
	<h3><div class="texto">
	<c:choose>
 		<c:when test="${not empty operacion}">
 			"El resultado de sumar ${operacion.valor1} y ${operacion.valor2} 
 			da ${operacion.resultado}"
 		</c:when>
 		<c:otherwise>
 			Deben ingresarse números en el formulario primero.
 		</c:otherwise>		
 	</c:choose>
	</div></h3>
 	
 	 	
 	<br/><br/><br/>
 	
	<form:form action="calculo" method="GET">
		<button class="btn btn-lg btn-success btn-block btn-editar" Type="Submit">Volver</button>
	</form:form> 
	</div>
	</div>
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script>
	<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script> 		        
</body>
</html>
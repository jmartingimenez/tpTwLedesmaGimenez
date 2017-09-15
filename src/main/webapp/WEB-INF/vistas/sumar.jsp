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
 		<c:when test = "${not empty resultado}">
 			"El resultado de sumar ${valor1} y ${valor2} da ${resultado}"<br/>
 			Proba editar los dos paths para obtener distintos resultados<br/>
 			(Solo se admiten números enteros)
 		</c:when>
 		<c:otherwise>
 			Trabajo practico para Taller Web I.<br/>
 			Alumnos: Ledesma Mauro, Gimenez Jonatan<br/>
 			Ingresar dos path en la URL para obtener la suma. <br/>
 			Ejemplo: 'http://localhost:8080/proyecto-limpio-spring/1/2'<br/>
 			(Solo se admiten números enteros)
 		</c:otherwise>		
 	</c:choose>
	</div></h3> 
	</div>
	</div>
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script>
	<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script> 		        
</body>
</html>
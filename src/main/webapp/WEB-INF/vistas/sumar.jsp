<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	
	</head>
<body>
	<c:choose>
 		<c:when test = "${not empty resultado}"> 		
 			<h4>
	 			"El resultado de sumar ${valor1} y ${valor2} da ${resultado}"<br/>
	 			Proba editar los dos paths para obtener distintos resultados<br/>
	 			(Solo se admiten números enteros)
 			</h4> 			
 		</c:when>
 		<c:otherwise>
	 		<h4>	
	 			Trabajo practico para Taller Web I.<br/>
	 			Alumnos: Ledesma Mauro, Gimenez Jonatan<br/>
	 			Ingresar dos path en la URL para obtener la suma. <br/>
	 			Ejemplo: 'http://localhost:8080/proyecto-limpio-spring/sumar/1/2'<br/>
	 			(Solo se admiten números enteros)
	 		</h4>	
 		</c:otherwise>		
 	</c:choose>
</body>
</html>
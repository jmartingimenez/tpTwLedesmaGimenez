<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	
	</head>
<body>
<div class="row">
        <div class="col-md-4"></div> 
        <div class="col-md-4 recuadro"> 
	<h3><div class="texto">
 	<h4>No se pudo realizar la operaci�n. Esto puede deberse a que  
 	alguno de los dos �ltimos valores del path no sea un n�mero<br/>
 	(Solo se admiten enteros).</h4><br/>
 	<a href="<c:url value="/" />">Volver</a>
 	</div></h3>
		</div>
	</div>
	
</body>
</html>
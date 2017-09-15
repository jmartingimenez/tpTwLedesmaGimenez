<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<h4>No se pudo realizar la operación. Esto puede deberse a que  
 	alguno de los dos últimos valores del path no sea un número<br/>
 	(Solo se admiten enteros).</h4><br/>
 	<a href="<c:url value="/" />">Volver</a>	
</body>
</html>
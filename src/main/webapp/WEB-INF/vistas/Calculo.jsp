<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" 
integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
	    <link href="css/bootstrap.min.css" rel="stylesheet" >
	    <!-- Bootstrap theme -->
	    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
	    <link rel="stylesheet" href="../git/tpTwLedesmaGimenez/src/main/webapp/css/css2.css"/>
</head>
<body>
 
    <div class="row">
        <div class="col-md-4"></div> 
        <div class="col-md-4 recuadro"> 
             <form:form action="validar-numeros" method="GET" modelAttribute="operacion">
               
                        
                    <h2><div class="texto">Operaci&oacute;n</div></h2>
                  <div class="conteiner">
                    <form:input path="valor1"type="" class="form-control" id="valor1" placeholder="Valor 1"/>
                      <h1><div class="mas">+</div></h1>
                   <form:input path="valor2" type="" class="form-control" id="valor2" placeholder="Valor 2"/>
                

                </div>
                 <button class="btn btn-lg btn-success btn-block btn-editar" Type="Submit">sumar</button>
            </form:form>
            
            
        </div> 
        <div class="col-md-4"></div> 
    </div>
        
</body>
</html>
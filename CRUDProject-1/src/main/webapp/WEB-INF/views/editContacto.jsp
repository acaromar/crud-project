<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE>
<html>
<head>
<head>
    <meta charset="ISO-8859-1">
    
     <spring:url value="resources/css/bootstrap.css" var="bootstrap"/>
        <link href="${bootstrap}" rel="stylesheet" />
        <spring:url value="resources/css/custom.css" var="custom"/>
        <link href="${custom}" rel="stylesheet" />
        
    <title> Alta de Contacto</title>
</head>

<body>
    <h1>Alta de contacto</h1>

   <form:form action="User" method="post" modelAttribute="user" >
        <div class="contentform">
        			<input type ="hidden" name="id" value= "${user.idUser}">
                    <p>Nombre Persona</p>
                    <span class="icon-case"><i class="fa fa-male"></i></span>
                    <input type="text" name="name" data-rule="required" value="${user.name}" data-msg="Introduzca nombre" />
                    <div class="validation"></div>
                    <p>Primer apellido</p>
                    <span class="icon-case"><i class="fa fa-male"></i></span>
                    <input type="text" name="surname" data-rule="required" value="${user.surname}" data-msg="Introduzca primer apellido" />
                    <div class="validation"></div>
                    <p>Email</p>
                    <span class="icon-case"><i class="fa fa-male"></i></span>
                    <input type="text" name="email" data-rule="required" value="${user.email}" data-msg="Introduzca segundo apellido" />
                    <div class="validation"></div>
                                    
                </div>
            <button type="submit" class="bouton-contact">Agregar</button>

    </form:form>


</body>
</html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!--
 En este se muestra el uso mas comun de los TAG  "core"
-->


<%

   String alumnos[]={"Antoni","Sandra","Mario"};
   

   pageContext.setAttribute("losAlumnos", alumnos);

%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach var="tempAlumnos" items="${losAlumnos}">
            ${tempAlumnos} <br/> 
        </c:forEach>
            
            <c:if test="${1==1}"><!--funcion de if-->
                aqui ira el todo el codigo si cumple con la condicion
            </c:if>
                
                
    
          
    </body>
</html>

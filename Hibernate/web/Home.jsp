<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta  content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>hay <c:out value="${persona.size()}"/></p>       
        <ul>
            <c:forEach items="${persona}" var="persona">
                
                <li>persona:<c:out value="${persona.getNombres()}"/></li>
            </c:forEach>
            
        </ul>
        
    </body>
</html>

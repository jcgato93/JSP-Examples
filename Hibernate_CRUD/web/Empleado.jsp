<%-- 
    Document   : Empleado
    Created on : 13/11/2017, 01:45:16 PM
    Author     : GATO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta   charset="UTF-8">
        <%@include file="header.jsp" %>        
    </head>
    <body>
        <form action="#" method="GET" id="formPersona"></form>
        <h1>Empleados</h1>
        
        <p>
            <a href="<%=request.getContextPath()%>/agregar" class="btn btn-success">Agregar</a>
        </p>
        <table class="table table-bordered">
            <thead>
                <th>PersonaId</th>
                <th>Nombres</th>
                <th>Apellidos</th>
                <th>Tipo de Doc</th>
                <th>Num documento</th>
                <th>Direccion</th>
                <th>Telefono</th>
                <th>Email</th>
                <th>Acciones</th>
            </thead>
            <tbody>
                <c:forEach items="${persona}" var="persona">
                    <tr>
                        <td><c:out value="${persona.getPersonaId()}"/></td>
                        <td><c:out value="${persona.getNombres()}"/></td>
                        <td><c:out value="${persona.getApellidos()}"/></td>
                        <td><c:out value="${persona.getTipoDocumento()}"/></td>
                        <td><c:out value="${persona.getNumDocumento()}"/></td>
                        <td><c:out value="${persona.getDireccion()}"/></td>
                        <td><c:out value="${persona.getTelefono()}"/></td>
                        <td><c:out value="${persona.getEmail()}"/></td>
                        <td>
                        <a href="<%=request.getContextPath()%>/editar?id=<c:out value="${persona.getPersonaId()}"/>"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span></a>
                        <a href="<%=request.getContextPath()%>/eliminar?id=<c:out value="${persona.getPersonaId()}"/>"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span></a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>

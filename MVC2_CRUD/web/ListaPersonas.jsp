

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page  import="java.util.*,Controllers.*,Models.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
           //obtine lista personas
            List<persona> listPersona=(List<persona>)request.getAttribute("persona");
            persona p;
             for (int i = 0; i < listPersona.size(); i++) {
                  p=listPersona.get(i);    
                  
                  out.write(p.getNombres()+"<br/>");
                  out.write(p.getApellidos()+"<br/>");
                  
                 }
        %>
        
    
        
        
    </body>
</html>

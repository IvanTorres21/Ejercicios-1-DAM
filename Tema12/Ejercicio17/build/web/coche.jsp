<%-- 
    Document   : coche
    Created on : 17-feb-2020, 9:05:45
    Author     : ivant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tu coche</title>
    </head>
    <body>
        <%
            String opt = request.getParameter("col");
            String opt2 = request.getParameter("mat");
            out.println("<img src=\"img/" + opt + opt2 + ".jpg\">");
            %>
            <img src="img/ blanco madera .jpg">
    </body>
</html>

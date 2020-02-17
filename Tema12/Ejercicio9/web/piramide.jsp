<%-- 
    Document   : piramide
    Created on : 17-feb-2020, 8:36:59
    Author     : ivant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pinta piramide</title>
        <style>
            img {
                
                width: 50px;
                display: inline-block;
                float: left;
            }
            .clear {
                
                clear: both;
            }
        </style>
    </head>
    <body>
        <%
            int h = Integer.parseInt(request.getParameter("altura"));
            int blanco = h;
            int ladrillo = 1;
            for (int i = 0; i < h; i++){
                
                for (int j = 0; j < blanco; j++) { //Imagenes en blanco
                    
                    out.println("<img src=\"img/w.png\">");
                }
                for (int j = 0; j < ladrillo; j++) { //Imagenes ladrillo
                    
                    out.println("<img src=\"img/l.png\">");
                }
                out.println("<div class=\"clear\"></div>");
                blanco -= 1;
                ladrillo += 2;
            }
        %>
    </body>
</html>

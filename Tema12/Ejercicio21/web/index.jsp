<%-- 
    Document   : index
    Created on : 17-feb-2020, 10:58:03
    Author     : ivant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Heladería</title>
        <style>
            * {

                text-align: center;
            }
            img {

                margin: 2px;
            }
            .helado {
                
                width: 300px;
                height: 300px;
                border: 3px solid black;
                border-top: 0px;
                margin: auto;
            }
        </style>
    </head>
    <body>
        <h1>Máquina de helados</h1>
        <p>Seleccione los porcentajes para preparar el helado a su gusto</p>
        <table style="margin: 0 auto">
            <tr>
                <th><img src="c.jpg" width="300px"></th>
                <th><img src="f.jpg" width="300px"></th>
                <th><img src="v.jpg" width="300px"></th>
            </tr>
            <form method="GET">
                <tr>
                    <th>Chocolate: <input type="number" name="c" value="0" min="0">%</th>
                    <th>Fresa: <input type="number" name="f" value="0" min="0">%</th>
                    <th>Vainilla: <input type="number" name="v" value="0"min="0">%</th>
                </tr>
                <tr>
                    <th></th>
                    <th><input type="submit" value="Enviar"></th>
                    <th></th>
                </tr>
            </form>
        </table>

        <%
            try {
                int choc = Integer.parseInt(request.getParameter("c"));
                int fre = Integer.parseInt(request.getParameter("f"));
                int vai = Integer.parseInt(request.getParameter("v"));
                int vacio = 100 - (choc + fre + vai);
                if ((choc + fre + vai) > 100) {

                    out.println("<p style=\"color: red\">La suma de los porcentajes no puede superar el 100%</p>");
                } else if ( (choc + fre + vai) <= 0) {
                    
                    out.println("<p style=\"color: red\">No has introducido ningún valor</p>");
                } else {
                    
                    out.println("<div class=\"helado\">");
                    out.println("<div style=\"height:" + vacio * 3 + "px;background-color: white\"></div>");
                    if (choc != 0) {
                    out.println("<div style=\"height:" + choc * 3 + "px;background-color: brown\"></div>");                        
                    }
                    if (fre != 0) {
                        out.println("<div style=\"height:" + fre * 3 + "px;background-color: pink\"></div>");
                    }
                    if (vai != 0) {
                        out.println("<div style=\"height:" + vai * 3 + "px;background-color: yellow\"></div>");
                    }
                    out.println("</div>");
                }
            } catch (Exception e) {
                
                
            }
        %>
    </body>
</html>

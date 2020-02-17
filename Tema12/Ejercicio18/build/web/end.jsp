<%-- 
    Document   : index
    Created on : 17-feb-2020, 9:18:09
    Author     : ivant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trile</title>
        <style>

            img {

                display: inline-block;
                float: left;
            }
        </style>
    </head>
    <body>
        <h1 style="text-align: center">Juego del Trile</h1>
        <%
            int opt = Integer.parseInt(request.getParameter("bol"));
            int win = (int) (Math.random() * 3) + 1;
            if (opt != win) {
                out.println("<h1>Has perdido!</h1>");
            } else {
                
                out.println("<h1>Has ganado!</h1>");
            }
            for (int i = 1; i <= 3; i++){
                
                if(i != win && i != opt) {
                    
                    out.println("<img src=\"img/c.png\">");
                } else if (i == opt && i != win) {
                    
                    out.println("<img src=\"img/cv.png\">");
                } else {
                    out.println("<img src=\"img/cb.png\">");
                }
            }
        %>
        <form action="index.html" method="POST">
            <input type="submit" value="Jugar otra vez">
        </form>
    </body>
</html>

<%-- 
    Document   : mostrarProfesor
    Created on : 14 ago. 2023, 04:26:53
    Author     : abel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>

<%@page import="modelos.Profesor"%>
<%@page import="modelos.Asignatura"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <link href="estilos/mostrarProfesores.css" rel="stylesheet" type="text/css"/>
        <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,400;1,400;1,900&display=swap" rel="stylesheet">


    </head>
    <body > 
        <div class="fijoArriba">
            <h1>Lista de profesores  </h1>

        </div>
        <div class="spacer"></div>
        <div class="contenedorProfesores">
            <%List <Profesor> listaProfesores=(List)request.getSession().getAttribute("listaProfesores");
         int cont=1;
         for(Profesor profe:listaProfesores){
            %>
            <div class="datosProfesor">
                <span class="numero">  <%=cont%></span>
                <p>ID: <%=profe.getId_profesor()%> </p>
                <p>Nombre: <%= profe.getNombre() %></p>
                <p>Apellido: <%= profe.getApellido() %></p>
                <p>Legajo: <%= profe.getLegajo() %></p>
                <p>Teléfono:<%=profe.getTelefono()%> </p>
                <div class="contenedorAsignaturas">
                    <span class="titulo"> Asignaturas que Dicta:</span>

                    <ul >
                        <div class="listaAsignaturas">
                            <% 
                            for (Asignatura asignatura : profe.getAsignaturas()) {
                            %>
                            <li><%= asignatura.getNombre() %></li>
                                <% 
                                } 
                                %>
                        </div>
                    </ul>
                </div>

            </div>
            <%cont=cont+1;%>
            <% } %>
        
            <%if(cont-1==0){%><span class="mensajeListaVacia"> La lista de profesores esta vacia   </span><%}%>
        </div>
            <div class="fijoAbajo">
            <span>Total: <%=cont-1%> Profesores</span>
            <button class="btn"> <a href="index.jsp">Volver a la página principal</a></button>
        </div>
    </body>
</html>

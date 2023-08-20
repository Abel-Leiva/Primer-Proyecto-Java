<%-- 
    Document   : index
    Created on : 13 ago. 2023, 00:59:25
    Author     : abel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <link href="estilos/index.css" rel="stylesheet" type="text/css"/>
        <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,400;1,400;1,900&display=swap" rel="stylesheet">

    </head>
    <body> <h1>Trabajo Practico Final</h1>
        <div class="contenedora">


            <div class="form " >
                <h2>Dar de Alta Profesor</h2>
                <form class="formAltaProfesor" action="SvAltaProfesor" method="Post">
                    <div>
                        <label for="legajo">Legajo n°:</label>
                        <input type="number" name="legajo" id="legajo" placeholder="n° legajo" required><br>

                        <label for="nombres">Nombre :</label>
                        <input type="text" name="nombres" id="nombres" placeholder="ingrese aqui el nombre" required><br>

                        <label for="apellidos">Apellido :</label>
                        <input type="text" name="apellidos" id="apellidos" placeholder="ingrese aqui el apellido" required><br>

                        <label for="telefono">Teléfono:</label>
                        <input type="number" name="telefono" id="telefono" placeholder="ingrese aqui el n° de telefono" required><br>
                    </div>

                    <div>
                        <label>Asignaturas a Dictar :<br> (debe ingresar al menos una asignatura)</label><br>
                        <div class="contenedorAsignaturas">

                            <input type="text" name="asignatura1" placeholder="campo obligatorio" required>
                            <input type="text" name="asignatura2" placeholder="Ingrese una asignatura">
                            <input type="text" name="asignatura3" placeholder="Ingrese una asignatura">
                            <input type="text" name="asignatura4" placeholder="Ingrese una asignatura">
                            <input type="text" name="asignatura5" placeholder="Ingrese una asignatura">
                            <input type="text" name="asignatura6" placeholder="Ingrese una asignatura">
                            <input type="text" name="asignatura7" placeholder="Ingrese una asignatura">
                            <input type="text" name="asignatura8" placeholder="Ingrese una asignatura">
                        </div>


                    </div>
                    <button type="submit" class="boton" value="Registrar Profesor">Registrar Profesor</button>
                </form>
            </div>
            <div>

                <div class="form">
                    <h2>Listar Profesores</h2>
                    <form action="SvListarProfesores" method="GET">


                        <button class="boton">Ver profesores</button>
                    </form>
                </div>
                <div class="form"> 
                    <h2>Dar de Baja Profesor</h2>
                    <form action="SvBajaProfesor" method="POST">
                        <label for="idProfesor">ID del profesor a dar de baja:</label> <br>
                        <input type="number" id="idProfesor" name="idProfesor" placeholder="ingrese n° de id" required><br>
                        <button class="boton" type="submit" value="Dar de Baja">Dar de Baja</button>
                    </form>
                </div>


            </div>
        </div>
    </body>
</html>

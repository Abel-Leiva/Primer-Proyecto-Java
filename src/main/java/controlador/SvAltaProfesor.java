package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import modelos.Asignatura;
import modelos.Profesor;

@WebServlet(name = "SvAltaProfesor", urlPatterns = {"/SvAltaProfesor"})
public class SvAltaProfesor extends HttpServlet {

    //creo instancia de controladoralogica
    ControladoraLogica control = new ControladoraLogica();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int legajo = Integer.parseInt(request.getParameter("legajo"));
        String nombres = request.getParameter("nombres").toLowerCase();
        String apellidos = request.getParameter("apellidos").toLowerCase();
        String telefono = request.getParameter("telefono");

        // Crear instancia de Profesor con   asignaturas=null
        Profesor profesor = new Profesor(legajo, nombres, apellidos, telefono, null);

        // Crear la lista de asignaturas
        List<Asignatura> asignaturas = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            String nombreAsignatura = request.getParameter("asignatura" + i);
            if (nombreAsignatura != null && !nombreAsignatura.trim().isEmpty()) {
                nombreAsignatura = nombreAsignatura.toLowerCase();
                asignaturas.add(new Asignatura(nombreAsignatura, profesor));
            }
        }

        //seteo valor de asignaturas
        profesor.setAsignaturas(asignaturas);

        //creo profesor en la db
        control.crearProfesor(profesor);

        System.out.println(profesor);
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

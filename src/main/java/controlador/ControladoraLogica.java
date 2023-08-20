package controlador;

import java.util.List;
import modelos.Profesor;
import persistencia.ControladoraPersistencia;

public class ControladoraLogica {

    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();

    public void crearProfesor(Profesor profesor) {
        controlPersistencia.crearProfesor(profesor);
    }

    public List<Profesor> traerProfesores() {
        return controlPersistencia.traerProfesores();
    }

    public void eliminarProfesor(int id) {
        controlPersistencia.eliminarProfesor(id);
    }
}

package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import modelos.Profesor;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

    ProfesorJpaController profesorJpa = new ProfesorJpaController();

    public void crearProfesor(Profesor profe) {
        profesorJpa.create(profe);
    }

    public List<Profesor> traerProfesores() {
        return profesorJpa.findProfesorEntities();
    }

    public void eliminarProfesor(int id) {
        try {
            profesorJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

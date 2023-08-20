package modelos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "asignaturas")
public class Asignatura implements Serializable {

    @Id
    @Column(name = "id_asignatura")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_asignatura;
    private String nombre;
    @ManyToOne
    private Profesor profe;

    public Asignatura() {
    }

    public Asignatura(String nombre, Profesor profe) {
        this.nombre = nombre;
        this.profe = profe;
    }

    public void setProfe(Profesor profe) {
        this.profe = profe;
    }

    public Asignatura(int id_asignatura, String nombre) {
        this.id_asignatura = id_asignatura;
        this.nombre = nombre;
    }

    public int getId_asignatura() {
        return id_asignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfe() {
        return profe;
    }

    public void setId_asignatura(int id_asignatura) {
        this.id_asignatura = id_asignatura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "id_asignatura=" + id_asignatura + ", nombre=" + nombre + '}';
    }

}

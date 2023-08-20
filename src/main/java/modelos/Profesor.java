package modelos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

@Entity
@Table(name = "profesores")
public class Profesor implements Serializable {

    @Id
    @Column(name = "id_profesor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_profesor;
    private int legajo;
    private String nombre;
    private String apellido;
    private String telefono;
    @OneToMany(mappedBy = "profe", cascade = CascadeType.PERSIST)
    private List<Asignatura> asignaturas;

    public Profesor() {
    }

    public Profesor(int id_profesor, int legajo, String nombre, String apellido, String telefono, List<Asignatura> asignaturas) {
        this.id_profesor = id_profesor;
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.asignaturas = asignaturas;
    }

    public Profesor(int legajo, String nombre, String apellido, String telefono, List<Asignatura> asignaturas) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.asignaturas = asignaturas;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
        return "Profesor{" + "id_profesor=" + id_profesor + ", legajo=" + legajo + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", asignaturas=" + asignaturas + '}';
    }

}

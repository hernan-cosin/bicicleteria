package model;

import java.util.ArrayList;
import java.util.List;

public class Agrupacion {
    private String nombre;
    private List<Actividad> actividades;
    private List<Profesor> profesores;

    public Agrupacion(String nombre) {
        this.nombre = nombre;
        this.actividades = new ArrayList<Actividad>();
        this.profesores = new ArrayList<Profesor>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Actividad> getActividades() {
        return actividades;
    }
    public void setActividades(List<Actividad> actividades) {
        this.actividades = actividades;
    }
    public List<Profesor> getProfesores() {
        return profesores;
    }
    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }


}

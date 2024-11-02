package model;

public class Profesor {
    private String nombre;
    private String apellido;
    private int dni;
    private Fecha fecha_nacimiento;
    private Agrupacion agrupacion;

    public Profesor(String nombre, String apellido, int dni, Fecha fecha_nacimiento, Agrupacion agrupacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.agrupacion = agrupacion;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public Fecha getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public void setFecha_nacimiento(Fecha fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public Agrupacion getAgrupacion() {
        return agrupacion;
    }
    public void setAgrupacion(Agrupacion agrupacion) {
        this.agrupacion = agrupacion;
    }

    
}

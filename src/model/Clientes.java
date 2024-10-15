package model;

public abstract class Clientes {
    private String nombre;
    private String apellido;
    private Fecha fecha_nacimiento;
    private Long dni;
    private Integer compras;

    public void comprar_bicicleta () {
        
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
    public Fecha getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public void setFecha_nacimiento(Fecha fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public Long getDni() {
        return dni;
    }
    public void setDni(Long dni) {
        this.dni = dni;
    }

    public Integer getCompras() {
        return compras;
    }
    public void setCompras(Integer compras) {
        this.compras = compras;
    }
}

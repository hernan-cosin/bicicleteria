package model;

import java.util.List;

public class Cliente_federado extends Clientes{
    private Integer nro_matricula;
    private Agrupacion agrupacion;

    public Cliente_federado(String nombre, String apellido, Fecha fecha_nacimiento, int dni, List<Compra> compras, Direccion direccion, Agrupacion agrupacion, Integer nro_matricula) {
        super(nombre, apellido, fecha_nacimiento,dni,compras);
        this.agrupacion = agrupacion;
        this.nro_matricula = nro_matricula;
    }
    
    public Integer getNro_matricula() {
        return nro_matricula;
    }
    public void setNro_matricula(Integer nro_matricula) {
        this.nro_matricula = nro_matricula;
    }
    public Agrupacion getAgrupacion() {
        return agrupacion;
    }
    public void setAgrupacion(Agrupacion agrupacion) {
        this.agrupacion = agrupacion;
    }

    
}

package model;

import java.util.List;

public class Cliente_comun extends Clientes{
    private Direccion direccion;

    public Cliente_comun(String nombre, String apellido, Fecha fecha_nacimiento, int dni, List<Compra> compras, Direccion direccion) {
        super(nombre, apellido, fecha_nacimiento,dni,compras);
        this.direccion = direccion;
    }
    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    
}

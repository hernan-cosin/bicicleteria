package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Clientes {
    private String nombre;
    private String apellido;
    private Fecha fecha_nacimiento;
    private int dni;
    private List<Compra> compras;

    // constructor
    public Clientes(String nombre, String apellido, Fecha fecha_nacimiento, int dni, List<Compra> compras) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.dni = dni;
        this.compras = new ArrayList<Compra>();
    }

    public void comprar_bicicleta(Compra compra) {
        if (compra != null) {
            compras.add (compra);

            for (Bicicleta bici : compra.getProductos()) {
                if (bici.getStock() > 0) {
                        bici.setStock(bici.getStock() - 1); // reduce el stock
                    } else {
                        System.out.println("Bicicleta " + bici.getModelo() + " is out of stock.");
                    }
            }
        }
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }
}

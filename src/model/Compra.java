package model;

import java.util.List;

public class Compra {
    private Forma_de_pago Forma_de_pago;
    private List<Bicicleta> productos;
    private Double total;
    private Fecha fecha;
    private Clientes cliente;
    private Integer nro_factura;

    // Constructor
    public Compra(Forma_de_pago formaDePago, List<Bicicleta> productos, Double total,
            Fecha fecha, Clientes cliente, Integer nroFactura) {
        this.Forma_de_pago = formaDePago;
        this.productos = productos;
        this.total = total;
        this.fecha = fecha;
        this.cliente = cliente;
        this.nro_factura = nroFactura;
    }

    public Forma_de_pago getForma_de_pago() {
        return Forma_de_pago;
    }

    public void setForma_de_pago(Forma_de_pago forma_de_pago) {
        Forma_de_pago = forma_de_pago;
    }

    public List<Bicicleta> getProductos() {
        return productos;
    }

    public void setProductos(List<Bicicleta> productos) {
        this.productos = productos;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Integer getNro_factura() {
        return nro_factura;
    }

    public void setNro_factura(Integer nro_factura) {
        this.nro_factura = nro_factura;
    }

}

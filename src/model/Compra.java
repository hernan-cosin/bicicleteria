package model;

import java.util.List;

public abstract class Compra {
    private Forma_de_pago Forma_de_pago;
    private List<Bicicleta> productos;
    private Float total;
    private Fecha fecha;
    private Clientes cliente;
    private Integer nro_factura;
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
    public Float getTotal() {
        return total;
    }
    public void setTotal(Float total) {
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

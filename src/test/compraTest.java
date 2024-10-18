package test;

import java.util.ArrayList;
import java.util.List;

import model.Bicicleta;
import model.Cliente_comun;
import model.Compra;
import model.Especialidad;
import model.Fecha;
import model.Fecha_vencimiento;
import model.Tarjeta_credito;
import model.Tipo_bicicleta;

public class compraTest {
    public static void main(String[] args) {
        Compra compraTarjetaCredito = new Compra();

        Tarjeta_credito tarjetaCredito = new Tarjeta_credito();
        Fecha_vencimiento fechaVencimiento = new Fecha_vencimiento();

        fechaVencimiento.setMes(11);
        fechaVencimiento.setAnio(2029);

        tarjetaCredito.setMonto(null);
        tarjetaCredito.setNro_tarjeta(4550669812213256L);
        tarjetaCredito.setTipo_tarjeta("visa");
        tarjetaCredito.setVencimiento(fechaVencimiento);
        tarjetaCredito.setMonto(150000.00);

        Cliente_comun cliente = new Cliente_comun();
        Fecha fechaNacimientoCl1 = new Fecha();
        fechaNacimientoCl1.setDia(06);
        fechaNacimientoCl1.setMes(06);
        fechaNacimientoCl1.setAnio(1993);
        cliente.setNombre("Hernán");
        cliente.setApellido("Cosin");
        cliente.setDni((long) 123456789);
        cliente.setFecha_nacimiento(fechaNacimientoCl1);

        Fecha fechaCompra = new Fecha();
        fechaCompra.setAnio(2024);
        fechaCompra.setMes(11);
        fechaCompra.setDia(1);

        Bicicleta bici1 = new Bicicleta();
        Bicicleta bici2 = new Bicicleta();
        Especialidad especialidad1 = new Especialidad();
        especialidad1.setNombre("Competición");
        Tipo_bicicleta tipoBicicleta1 = new Tipo_bicicleta();
        tipoBicicleta1.setNombre("Triatlon");

        Especialidad especialidad2 = new Especialidad();
        especialidad1.setNombre("Sport");
        Tipo_bicicleta tipoBicicleta2 = new Tipo_bicicleta();
        tipoBicicleta1.setNombre("Ruta");

        bici1.setEspecialidad(especialidad1);
        bici1.setMarca("Mondial");
        bici1.setModelo("XR150");
        bici1.setRodado(24);
        bici1.setStock(20);
        bici1.setTipo_bicicleta(tipoBicicleta1);
        bici1.setValor(250000.00);

        bici2.setEspecialidad(especialidad2);
        bici2.setMarca("Zenith");
        bici2.setModelo("Z250");
        bici2.setRodado(22);
        bici2.setStock(20);
        bici2.setTipo_bicicleta(tipoBicicleta2);
        bici2.setValor(150000.00);

        List<Bicicleta> listaDeProductos = new ArrayList<Bicicleta>();
        listaDeProductos.add(bici1);
        listaDeProductos.add(bici2);

        compraTarjetaCredito.setForma_de_pago(tarjetaCredito);
        compraTarjetaCredito.setCliente(cliente);
        compraTarjetaCredito.setFecha(fechaCompra);
        compraTarjetaCredito.setNro_factura(0056);
        compraTarjetaCredito.setProductos(listaDeProductos);
        compraTarjetaCredito.setTotal(300000.00);

        // PRINTS
        System.out.println(compraTarjetaCredito.getNro_factura());
        System.out.println(compraTarjetaCredito.getTotal());
        System.out.println(compraTarjetaCredito.getFecha());
        System.out.println(compraTarjetaCredito.getForma_de_pago());
        System.out.println(compraTarjetaCredito.getProductos());
    }
}

package test;

import java.util.ArrayList;
import java.util.List;

import model.Agrupacion;
import model.Bicicleta;
import model.Cliente_comun;
import model.Cliente_federado;
import model.Clientes;
import model.Direccion;
import model.Especialidad;
import model.Fecha;
import model.Tipo_bicicleta;

public class clientesTest {
    public static void main(String[] args) {
        // CREO CLIENTE COMUN
        Clientes clienteComun = new Cliente_comun();

        Fecha fechaNacimientoCl1 = new Fecha();
        fechaNacimientoCl1.setDia(06);
        fechaNacimientoCl1.setMes(06);
        fechaNacimientoCl1.setAnio(1993);
        // CREO DIRECCION
        Direccion direccion = new Direccion();
        direccion.setCalle("Calle falsa");
        direccion.setNumero(123);
        // SETEO CLIENTE
        clienteComun.setNombre("Hernán");
        clienteComun.setApellido("Cosin");
        clienteComun.setDni((long) 123456789);
        clienteComun.setFecha_nacimiento(fechaNacimientoCl1);
        // CREO BICICLETA
        Bicicleta compraBicileta1 = new Bicicleta();
        Bicicleta compraBicileta2 = new Bicicleta();

        Especialidad especialidad1 = new Especialidad();
        especialidad1.setNombre("Competición");
        Tipo_bicicleta tipoBicicleta1 = new Tipo_bicicleta();
        tipoBicicleta1.setNombre("Triatlon");

        Especialidad especialidad2 = new Especialidad();
        especialidad1.setNombre("Sport");
        Tipo_bicicleta tipoBicicleta2 = new Tipo_bicicleta();
        tipoBicicleta1.setNombre("Ruta");

        compraBicileta1.setEspecialidad(especialidad1);
        compraBicileta1.setMarca("Mondial");
        compraBicileta1.setModelo("XR150");
        compraBicileta1.setRodado(24);
        compraBicileta1.setStock(20);
        compraBicileta1.setTipo_bicicleta(tipoBicicleta1);
        compraBicileta1.setValor(250000.00);

        compraBicileta2.setEspecialidad(especialidad2);
        compraBicileta2.setMarca("Zenith");
        compraBicileta2.setModelo("Z250");
        compraBicileta2.setRodado(22);
        compraBicileta2.setStock(20);
        compraBicileta2.setTipo_bicicleta(tipoBicicleta2);
        compraBicileta2.setValor(150000.00);
        // CREO LISTA DE COMPRAS
        List<Bicicleta> listaDecompras = new ArrayList<Bicicleta>();
        listaDecompras.add(compraBicileta1);
        listaDecompras.add(compraBicileta2);

        clienteComun.setCompras(listaDecompras);

        // CREO CLIENTE FEDERADO
        Cliente_federado clienteFederado = new Cliente_federado();
        
        Fecha fechaNacimientoCl2 = new Fecha();
        fechaNacimientoCl2.setDia(06);
        fechaNacimientoCl2.setMes(06);
        fechaNacimientoCl2.setAnio(1993);
    
        clienteFederado.setNombre("Miguel");
        clienteFederado.setApellido("Díaz");
        clienteFederado.setDni((long) 234567891);
        clienteFederado.setFecha_nacimiento(fechaNacimientoCl2);
        clienteFederado.setNro_matricula(123);

        Agrupacion agrupacion = new Agrupacion();
        agrupacion.setNombre("Circulo de Ciclistas");
        clienteFederado.setAgrupacion(agrupacion);

        // PRINTS
        System.out.println(clienteComun.getNombre());
        System.out.println(clienteComun.getApellido());
        System.out.println(clienteComun.getDni());
        System.out.println(clienteComun.getFecha_nacimiento().getDia() + "/" +
        clienteComun.getFecha_nacimiento().getMes() + "/"
        + clienteComun.getFecha_nacimiento().getAnio());
        System.out.println(clienteComun.getCompras());

        for (Bicicleta bicicleta : listaDecompras) {
            System.out.println(bicicleta.getMarca());
        }

        System.out.println(clienteFederado.getNombre());
        System.out.println(clienteFederado.getApellido());
        System.out.println(clienteFederado.getDni());
        System.out.println(clienteFederado.getFecha_nacimiento());
        System.out.println(clienteFederado.getNro_matricula());
        System.out.println(clienteFederado.getAgrupacion());
    }
}

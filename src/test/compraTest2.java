package test;

import java.util.ArrayList;
import java.util.List;

import model.Bicicleta;
import model.Cliente_comun;
import model.Compra;
import model.Direccion;
import model.Especialidad;
import model.Fecha;
import model.Forma_de_pago;
import model.Tarjeta_debito;
import model.Tipo_bicicleta;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class compraTest2 {
        // public static void main(String[] args) {
        @Test
        public void comprar_bicicleta() {
                Fecha fechaNacimiento = new Fecha(07, 1993, 07);
                Direccion direccion = new Direccion("Calle Falsa", 123);
                Cliente_comun clienteNro1 = new Cliente_comun("Hernan", "Cosin", fechaNacimiento, 37993227, null,
                                direccion);

                Tipo_bicicleta tipo_bicicletaNro1 = new Tipo_bicicleta("Competición");
                Especialidad especialidadNro1 = new Especialidad("Ruta");
                Bicicleta bicicletaNro1 = new Bicicleta("Mondial", "XR150", 24, tipo_bicicletaNro1, especialidadNro1,
                                20,
                                150000.00);

                Tipo_bicicleta tipo_bicicletaNro2 = new Tipo_bicicleta("Sport");
                Especialidad especialidadNro2 = new Especialidad("Triatlon");
                Bicicleta bicicletaNro2 = new Bicicleta("Zenith", "Vento", 22, tipo_bicicletaNro2, especialidadNro2, 25,
                                175000.00);

                List<Bicicleta> listaDeBicicletas = new ArrayList<Bicicleta>();
                listaDeBicicletas.add(bicicletaNro1);
                listaDeBicicletas.add(bicicletaNro2);

                Forma_de_pago formaDePagoClienteNro1 = new Tarjeta_debito(325000.00, 4500640036923774L, "visa");

                Compra compraClienteNro1 = new Compra(formaDePagoClienteNro1, listaDeBicicletas, 325000.00,
                                fechaNacimiento,
                                clienteNro1, 001);

                clienteNro1.comprar_bicicleta(compraClienteNro1);

                Compra compraClienteNro2 = new Compra(formaDePagoClienteNro1,
                                listaDeBicicletas, 325000.00, fechaNacimiento,
                                clienteNro1, 002);

                clienteNro1.comprar_bicicleta(compraClienteNro2);
                Integer expected = 18;
                assertEquals(expected, bicicletaNro1.getStock());
        }
}

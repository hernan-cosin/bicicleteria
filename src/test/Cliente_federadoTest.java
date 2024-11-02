package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Agrupacion;
import model.Cliente_federado;
import model.Direccion;
import model.Fecha;

public class Cliente_federadoTest {
    Cliente_federado clienteFederado = new Cliente_federado("Miguel", "Díaz", new Fecha(01, 1964, 27), 965423644, null, new Direccion("Av. Belgrano", 336), new Agrupacion("Federación ciclistas del Pilar"), 4556);

    @Test
    public void testGetAgrupacion() {
        Agrupacion nombreAgrupacion = new Agrupacion("Federación ciclistas del Pilar");
        assertEquals(nombreAgrupacion.getNombre(), clienteFederado.getAgrupacion().getNombre());
    }

    @Test
    public void testGetNro_matricula() {
        Integer nroDeMatriculaExpected = 4556;
        assertEquals(nroDeMatriculaExpected, clienteFederado.getNro_matricula());
    }
}

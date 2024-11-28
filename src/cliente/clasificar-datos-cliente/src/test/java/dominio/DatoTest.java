package dominio;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import es.uclm.esi.clasificar.datos.cliente.Dominio.*;

import static org.junit.jupiter.api.Assertions.*;

class DatoTest {
    private Dato dato;
    private Categoria categoria;
    private EstadoClasificacion estadoClasificacion;

    @BeforeEach
    void setUp() {
        dato = new Dato();
        categoria = new Categoria();
        estadoClasificacion = new EstadoClasificacion();

        dato.setId("123");
        dato.setNombre("TestDato");
    }

    @Test
    void testSetId() {
        dato.setId("456");
        assertEquals("456", dato.getId());
    }

    @Test
    void testSetNombre() {
        dato.setNombre("NuevoNombre");
        assertEquals("NuevoNombre", dato.getNombre());
    }
}



package dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Dominio.Categoria;
import Dominio.Dato;
import Dominio.EstadoClasificacion;

public class DatoTest {
    private Dato dato;
    private Categoria categoria;
    private EstadoClasificacion estado;

    @BeforeEach
    public void setUp() {
        dato = new Dato();
        categoria = new Categoria();
        estado = new EstadoClasificacion();
        dato.setId("123");
        dato.setNombre("TestDato");
    }

    @Test
    public void testSetId() {
        dato.setId("456");
        assertEquals("456", dato.getId());
    }

    @Test
    public void testSetNombre() {
        dato.setNombre("NewName");
        assertEquals("NewName", dato.getNombre());
    }

    @Test
    public void testAsignarCategoria() {
        // Asigna la categoría al dato
        dato.asignarCategoria(categoria);
        assertNotNull(dato.getCategoria()); // Verifica que la categoría no sea nula
        assertEquals(categoria, dato.getCategoria()); // Verifica que la categoría asignada sea la misma
    }

    @Test
    public void testActualizarEstado() {
        // Asigna el estado de clasificación al dato
        dato.actualizarEstado(estado);
        assertNotNull(dato.getEstado()); // Verifica que el estado no sea nulo
        assertEquals(estado, dato.getEstado()); // Verifica que el estado asignado sea el mismo
    }
}

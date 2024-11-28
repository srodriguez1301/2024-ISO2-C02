
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import Diseño_It2.Dominio.Dato;
import Diseño_It2.Dominio.Categoria;
import Diseño_It2.Dominio.EstadoClasificacion;

public class DatoTest {
    private Dato dato;
    private Categoria categoria;
    private EstadoClasificacion estado;

    @Before
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
        dato.asignarCategoria(categoria);
        // Complete the assertions once the method logic is implemented
    }

    @Test
    public void testActualizarEstado() {
        dato.actualizarEstado(estado);
        // Complete the assertions once the method logic is implemented
    }
}

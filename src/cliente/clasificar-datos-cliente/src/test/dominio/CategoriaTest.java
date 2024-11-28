
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import Diseño_It2.Dominio.Categoria;

public class CategoriaTest {
    private Categoria categoria;

    @Before
    public void setUp() {
        categoria = new Categoria();
        categoria.setNombre("TestName");
        categoria.setDescripcion("TestDescription");
    }

    @Test
    public void testSetNombre() {
        categoria.setNombre("NewName");
        assertEquals("NewName", categoria.getNombre());
    }

    @Test
    public void testSetDescripcion() {
        categoria.setDescripcion("NewDescription");
        assertEquals("NewDescription", categoria.getDescripcion());
    }

    @Test
    public void testEsCategoriaValida() {
        // Implement the logic of the method to complete this test
        // Assuming it should return true for "TestName"
        assertTrue(categoria.esCategoriaValida("TestName"));
    }
}

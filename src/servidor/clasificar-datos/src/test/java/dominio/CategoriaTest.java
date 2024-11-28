package dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Dominio.Categoria;


public class CategoriaTest {
    private Categoria categoria;

    @BeforeEach
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
        // Test para un nombre válido
        assertTrue(categoria.esCategoriaValida("TestName"));

        // Test para un nombre inválido (por ejemplo, vacío o nulo)
        assertFalse(categoria.esCategoriaValida(""));
        assertFalse(categoria.esCategoriaValida(null));
    }

}

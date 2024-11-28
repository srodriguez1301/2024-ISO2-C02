package InterfazUsuario;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Dominio.Dato;

public class InterfazUsuarioTest {
    private InterfazUsuario usuario;
    private Dato dato;

    @BeforeEach
    public void setUp() {
        usuario = new InterfazUsuario();  // Se crea la instancia de InterfazUsuario
        dato = new Dato();  // Se crea la instancia de Dato
    }

    @Test
    public void testEnviarDatos() {
        // Verifica que el método devuelve true cuando se pasa un dato no nulo
        assertTrue(usuario.enviarDatos(dato));

        // Verifica que el método devuelve false cuando se pasa un dato nulo
        assertFalse(usuario.enviarDatos(null));
    }
}

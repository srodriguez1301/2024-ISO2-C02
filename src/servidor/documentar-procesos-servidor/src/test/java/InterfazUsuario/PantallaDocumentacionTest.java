package InterfazUsuario;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PantallaDocumentacionTest {
    @Test
    void testPantallaInicializacion() {
        PantallaDocumentacion pantalla = new PantallaDocumentacion();
        assertNotNull(pantalla);
    }
}

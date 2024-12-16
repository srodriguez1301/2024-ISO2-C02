package InterfazServidor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InterfazCrearServidorTest {
    @Test
    void testInterfazServidorInicializacion() {
        InterfazCrearServidor interfaz = new InterfazCrearServidor();
        assertNotNull(interfaz);
    }
}

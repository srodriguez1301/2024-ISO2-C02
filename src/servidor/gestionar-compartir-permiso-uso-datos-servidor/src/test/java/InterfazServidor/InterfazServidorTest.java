package InterfazServidor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InterfazServidorTest {
    @Test
    void testServerInitialization() {
        InterfazServidor server = new InterfazServidor();
        assertNotNull(server);
    }
}
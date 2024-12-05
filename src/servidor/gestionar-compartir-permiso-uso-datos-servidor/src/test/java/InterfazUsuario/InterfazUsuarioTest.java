package InterfazUsuario;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InterfazUsuarioTest {
    @Test
    void testUserInterfaceLoading() {
        InterfazUsuario ui = new InterfazUsuario();
        assertNotNull(ui);
    }
}
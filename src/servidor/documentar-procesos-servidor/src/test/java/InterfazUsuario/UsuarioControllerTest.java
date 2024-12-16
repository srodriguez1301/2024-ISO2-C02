package InterfazUsuario;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UsuarioControllerTest {
    @Test
    void testUsuarioControllerCreacion() {
        UsuarioController controller = new UsuarioController();
        assertNotNull(controller);
    }
}

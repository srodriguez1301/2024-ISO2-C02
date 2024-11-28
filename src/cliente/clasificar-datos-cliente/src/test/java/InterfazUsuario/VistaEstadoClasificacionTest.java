package InterfazUsuario;


import org.junit.jupiter.api.Test;
import es.uclm.esi.clasificar.datos.cliente.InterfazUsuario.*;

import static org.junit.jupiter.api.Assertions.*;

class VistaEstadoClasificacionTest {
    private VistaClasificacion vista;

    @Test
    void testInstancia() {
        vista = new VistaClasificacion();
        assertNotNull(vista);
    }
}

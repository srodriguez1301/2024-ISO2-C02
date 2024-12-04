package es.uclm.esi.gestionar;

import InterfazUsuario.PantallaPrincipal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PantallaPrincipalTest {

    private PantallaPrincipal pantallaPrincipal;

    @BeforeEach
    public void setUp() {
        // Inicializamos la instancia de PantallaPrincipal
        pantallaPrincipal = new PantallaPrincipal();
    }

    @Test
    public void testVerProyecto() {
        // Verificamos que el método verProyecto lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            pantallaPrincipal.verProyecto(new Object());
        });
    }

    @Test
    public void testCrearProyecto() {
        // Verificamos que el método crearProyecto lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            pantallaPrincipal.crearProyecto(new Object());
        });
    }

    @Test
    public void testVerTarea() {
        // Verificamos que el método verTarea lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            pantallaPrincipal.verTarea(new Object());
        });
    }

    @Test
    public void testReasignarTarea() {
        // Verificamos que el método reasignarTarea lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            pantallaPrincipal.reasignarTarea(new Object());
        });
    }
}

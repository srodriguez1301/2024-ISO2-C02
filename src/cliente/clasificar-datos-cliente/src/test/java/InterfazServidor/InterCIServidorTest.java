package InterfazServidor;

import es.uclm.esi.clasificar.datos.cliente.InterfazServidor.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterCIServidorTest {
    private InterCIServidor servidor;

    @BeforeEach
    void setUp() {
        servidor = new InterCIServidor();
    }

    @Test
    void testRecibirEstado() {
        // Placeholder para la lógica de implementación real
        // EstadoClasificacion estado = servidor.recibirEstado();
        // assertNotNull(estado);
    }
}

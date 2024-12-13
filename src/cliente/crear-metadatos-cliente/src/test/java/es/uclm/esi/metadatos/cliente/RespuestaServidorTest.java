package es.uclm.esi.metadatos.cliente;

import static org.junit.jupiter.api.Assertions.*;

import InterfazServidor.RespuestaServidor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RespuestaServidorTest {

    private RespuestaServidor respuestaServidor;

    @BeforeEach
    public void setUp() {
        respuestaServidor = new RespuestaServidor();
    }

    @Test
    public void testEsExitosoThrowsException() {
        assertThrows(UnsupportedOperationException.class, 
            () -> respuestaServidor.esExitoso(), 
            "Se esperaba UnsupportedOperationException al verificar si la respuesta es exitosa");
    }
}

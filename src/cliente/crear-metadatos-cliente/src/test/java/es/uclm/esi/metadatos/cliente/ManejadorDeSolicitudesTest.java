package es.uclm.esi.metadatos.cliente;

import static org.junit.jupiter.api.Assertions.*;

import Dominio.Metadato;
import InterfazServidor.ManejadorDeSolicitudes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManejadorDeSolicitudesTest {

    private ManejadorDeSolicitudes manejadorDeSolicitudes;

    @BeforeEach
    public void setUp() {
        manejadorDeSolicitudes = new ManejadorDeSolicitudes();
    }

    @Test
    public void testEnviarSolicitudThrowsException() {
        Metadato metadato = new Metadato();
        assertThrows(UnsupportedOperationException.class, 
            () -> manejadorDeSolicitudes.enviarSolicitud(metadato), 
            "Se esperaba UnsupportedOperationException al enviar una solicitud");
    }

    @Test
    public void testManejarErroresServidorThrowsException() {
        Integer codigoError = 500;
        assertThrows(UnsupportedOperationException.class, 
            () -> manejadorDeSolicitudes.manejarErroresServidor(codigoError), 
            "Se esperaba UnsupportedOperationException al manejar errores del servidor");
    }
}

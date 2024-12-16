package es.uclm.esi.documentar.procesos.cliente;

import static org.junit.jupiter.api.Assertions.*;
import InterfazServidor.InterfazCrearServidor;
import Dominio.Documento;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManejadorSolicitudesTest {

    private InterfazCrearServidor interfazCrearServidor;

    @BeforeEach
    public void setUp() {
        interfazCrearServidor = new InterfazCrearServidor();
    }

    @Test
    public void testAlmacenarDocumentoThrowsException() {
        Documento documento = new Documento();
        assertThrows(UnsupportedOperationException.class, 
            () -> interfazCrearServidor.almacenarDocumento(documento));
    }

    @Test
    public void testValidarDocumentoThrowsException() {
        Documento documento = new Documento();
        assertThrows(UnsupportedOperationException.class, 
            () -> interfazCrearServidor.validarDocumento(documento));
    }

    @Test
    public void testRegistrarVersionThrowsException() {
        Documento documento = new Documento();
        assertThrows(UnsupportedOperationException.class, 
            () -> interfazCrearServidor.registrarVersion(documento));
    }

    @Test
    public void testBuscarDocumentoThrowsException() {
        assertThrows(UnsupportedOperationException.class, 
            () -> interfazCrearServidor.buscarDocumento());
    }

    @Test
    public void testGenerarReporteThrowsException() {
        assertThrows(UnsupportedOperationException.class, 
            () -> interfazCrearServidor.generarReporte());
    }
}

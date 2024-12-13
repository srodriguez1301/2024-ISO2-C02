package es.uclm.esi.metadatos.cliente;

import static org.junit.jupiter.api.Assertions.*;

import InterfazServidor.InterfazCrearServidor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InterfazCrearServidorTest {

    private InterfazCrearServidor interfazCrearServidor;

    @BeforeEach
    public void setUp() {
        interfazCrearServidor = new InterfazCrearServidor();
    }

    @Test
    public void testVerificarMetadatosThrowsException() {
        assertThrows(UnsupportedOperationException.class, 
            () -> interfazCrearServidor.verificarMetadatos(), 
            "Se esperaba UnsupportedOperationException al verificar metadatos");
    }

    @Test
    public void testGuardarMetadatosThrowsException() {
        assertThrows(UnsupportedOperationException.class, 
            () -> interfazCrearServidor.guardarMetadatos(), 
            "Se esperaba UnsupportedOperationException al guardar metadatos");
    }

    @Test
    public void testRegistrarCambiosThrowsException() {
        assertThrows(UnsupportedOperationException.class, 
            () -> interfazCrearServidor.registrarCambios(), 
            "Se esperaba UnsupportedOperationException al registrar cambios");
    }

    @Test
    public void testInformarClienteThrowsException() {
        assertThrows(UnsupportedOperationException.class, 
            () -> interfazCrearServidor.informarCliente(), 
            "Se esperaba UnsupportedOperationException al informar al cliente");
    }

    @Test
    public void testClasificarMetadatosThrowsException() {
        assertThrows(UnsupportedOperationException.class, 
            () -> interfazCrearServidor.clasificarMetadatos(), 
            "Se esperaba UnsupportedOperationException al clasificar metadatos");
    }
}


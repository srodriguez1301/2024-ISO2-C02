package es.uclm.esi.documentar.procesos.cliente;

import static org.junit.jupiter.api.Assertions.*;
import InterfazUsuario.PantallaDocumentacion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PantallaDocumentacionTest {

    private PantallaDocumentacion pantallaDocumentacion;

    @BeforeEach
    public void setUp() {
        pantallaDocumentacion = new PantallaDocumentacion();
    }

    @Test
    public void testMostrarFormularioThrowsException() {
        assertThrows(UnsupportedOperationException.class, 
            () -> pantallaDocumentacion.mostrarFormulario());
    }

    @Test
    public void testMostrarErrorThrowsException() {
        assertThrows(UnsupportedOperationException.class, 
            () -> pantallaDocumentacion.mostrarError());
    }
}

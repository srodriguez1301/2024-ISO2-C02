package es.uclm.esi.metadatos.cliente;

import static org.junit.jupiter.api.Assertions.*;

import Dominio.Metadato;
import InterfazUsuario.Interfaz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

public class InterfazTest {

    private Interfaz interfaz;

    @BeforeEach
    public void setUp() {
        interfaz = new Interfaz();
    }

    @Test
    public void testSolicitarDatosThrowsException() {
        assertThrows(UnsupportedOperationException.class, 
            () -> interfaz.solicitarDatos(), 
            "Se esperaba UnsupportedOperationException al solicitar datos");
    }

    @Test
    public void testMostrarErroresValidacionThrowsException() {
        List<String> mensajes = List.of("Error 1", "Error 2"); // Puedes ajustar los mensajes según lo que necesites
        assertThrows(UnsupportedOperationException.class, 
            () -> interfaz.mostrarErroresValidacion(mensajes), 
            "Se esperaba UnsupportedOperationException al mostrar errores de validación");
    }

    @Test
    public void testMostrarVistaPreviaThrowsException() {
        Metadato metadato = new Metadato(); // Asegúrate de que el objeto Metadato se crea de forma adecuada
        assertThrows(UnsupportedOperationException.class, 
            () -> interfaz.mostrarVistaPrevia(metadato), 
            "Se esperaba UnsupportedOperationException al mostrar vista previa");
    }
}

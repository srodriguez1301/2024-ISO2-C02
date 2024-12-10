package es.uclm.esi.datos.cliente;

import InterCIServidor.InterfazCrearServidor;
import Dominio.Dominio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InterfazCrearServidorTest {

    private InterfazCrearServidor interfazCrearServidor;
    private Dominio dominio;

    @BeforeEach
    public void setUp() {
        // Inicializamos las instancias necesarias antes de cada prueba
        interfazCrearServidor = new InterfazCrearServidor();
        dominio = new Dominio();
    }

    @Test
    public void testControlDominioThrowsException() {
        // Verificamos que el método controlDominio lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> interfazCrearServidor.controlDominio(dominio),
                "El método controlDominio debería lanzar UnsupportedOperationException.");
    }

    @Test
    public void testValidarDominioThrowsException() {
        // Verificamos que el método validarDominio lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> interfazCrearServidor.validarDominio(dominio),
                "El método validarDominio debería lanzar UnsupportedOperationException.");
    }

    @Test
    public void testAsignarDominioThrowsException() {
        // Verificamos que el método asignarDominio lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> interfazCrearServidor.asignarDominio(dominio),
                "El método asignarDominio debería lanzar UnsupportedOperationException.");
    }

    @Test
    public void testProporcionarInformacionThrowsException() {
        // Verificamos que el método proporcionarInformacion lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> interfazCrearServidor.proporcionarInformacion(dominio),
                "El método proporcionarInformacion debería lanzar UnsupportedOperationException.");
    }
}

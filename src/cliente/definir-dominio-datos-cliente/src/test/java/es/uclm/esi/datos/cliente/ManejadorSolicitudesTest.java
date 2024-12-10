package es.uclm.esi.datos.cliente;

import InterCIServidor.ManejadorSolicitudes;
import Dominio.Dominio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ManejadorSolicitudesTest {

    private ManejadorSolicitudes manejadorSolicitudes;
    private Dominio dominio;

    @BeforeEach
    public void setUp() {
        // Inicializamos las instancias necesarias antes de cada prueba
        manejadorSolicitudes = new ManejadorSolicitudes();
        dominio = new Dominio();
    }

    @Test
    public void testEnviarDominioThrowsException() {
        // Verificamos que el método enviarDominio lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> manejadorSolicitudes.enviarDominio(dominio),
                "El método enviarDominio debería lanzar UnsupportedOperationException.");
    }

    @Test
    public void testObtenerListaDominiosThrowsException() {
        // Verificamos que el método obtenerListaDominios lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> manejadorSolicitudes.obtenerListaDominios(),
                "El método obtenerListaDominios debería lanzar UnsupportedOperationException.");
    }
}

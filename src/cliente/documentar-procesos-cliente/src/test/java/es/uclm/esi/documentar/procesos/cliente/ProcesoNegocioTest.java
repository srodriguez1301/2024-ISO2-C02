package es.uclm.esi.documentar.procesos.cliente;

import static org.junit.jupiter.api.Assertions.*;
import Dominio.ProcesoNegocio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

public class ProcesoNegocioTest {
    private ProcesoNegocio procesoNegocio;

    @BeforeEach
    public void setUp() {
        procesoNegocio = new ProcesoNegocio();
    }

    @Test
    public void testGetEntradasThrowsException() {
        assertThrows(UnsupportedOperationException.class, 
            () -> procesoNegocio.getEntradas());
    }

    @Test
    public void testSetEntradasThrowsException() {
        List<String> entradas = List.of("Entrada1", "Entrada2");
        assertThrows(UnsupportedOperationException.class, 
            () -> procesoNegocio.setEntradas(entradas));
    }

    @Test
    public void testGetSalidasThrowsException() {
        assertThrows(UnsupportedOperationException.class, 
            () -> procesoNegocio.getSalidas());
    }

    @Test
    public void testSetSalidasThrowsException() {
        List<String> salidas = List.of("Salida1", "Salida2");
        assertThrows(UnsupportedOperationException.class, 
            () -> procesoNegocio.setSalidas(salidas));
    }

    @Test
    public void testGetActividadesThrowsException() {
        assertThrows(UnsupportedOperationException.class, 
            () -> procesoNegocio.getActividades());
    }

    @Test
    public void testSetActividadesThrowsException() {
        List<String> actividades = List.of("Actividad1", "Actividad2");
        assertThrows(UnsupportedOperationException.class, 
            () -> procesoNegocio.setActividades(actividades));
    }

    @Test
    public void testGetPuntosDecisionThrowsException() {
        assertThrows(UnsupportedOperationException.class, 
            () -> procesoNegocio.getPuntosDecision());
    }

    @Test
    public void testSetPuntosDecisionThrowsException() {
        List<String> puntosDecision = List.of("Decisión1", "Decisión2");
        assertThrows(UnsupportedOperationException.class, 
            () -> procesoNegocio.setPuntosDecision(puntosDecision));
    }
}

package es.uclm.esi.documentar.procesos.cliente;

import static org.junit.jupiter.api.Assertions.*;
import Dominio.HistorialVersiones;
import Dominio.Documento;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

public class HistorialVersionesTest {
    private HistorialVersiones historialVersiones;

    @BeforeEach
    public void setUp() {
        historialVersiones = new HistorialVersiones();
    }

    @Test
    public void testGetVersionesThrowsException() {
        assertThrows(UnsupportedOperationException.class, 
            () -> historialVersiones.getVersiones());
    }

    @Test
    public void testSetVersionesThrowsException() {
        List<Documento> versiones = List.of(new Documento(), new Documento());
        assertThrows(UnsupportedOperationException.class, 
            () -> historialVersiones.setVersiones(versiones));
    }
}

package es.uclm.esi.documentar.procesos.cliente;

import static org.junit.jupiter.api.Assertions.*;

import Dominio.Documento;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

public class DocumentoTest {

    private Documento documento;

    @BeforeEach
    public void setUp() {
        documento = new Documento();
    }

    @Test
    public void testGetId() {
        documento.setId(1);
        assertEquals(1, documento.getId(), "El ID no coincide con el valor esperado.");
    }

    @Test
    public void testSetTitulo() {
        String titulo = "Documento de prueba";
        documento.setTitulo(titulo);
        assertEquals(titulo, documento.getTitulo(), "El título no se estableció correctamente.");
    }

    @Test
    public void testSetDescripcion() {
        String descripcion = "Descripción de prueba";
        documento.setDescripcion(descripcion);
        assertEquals(descripcion, documento.getDescripcion(), "La descripción no se estableció correctamente.");
    }

    @Test
    public void testSetVersion() {
        String version = "1.0";
        documento.setVersion(version);
        assertEquals(version, documento.getVersion(), "La versión no se estableció correctamente.");
    }

    @Test
    public void testGetArchivosAdjuntosThrowsException() {
        assertThrows(UnsupportedOperationException.class, 
            () -> documento.getArchivosAdjuntos(), 
            "Se esperaba UnsupportedOperationException al obtener los archivos adjuntos.");
    }

    @Test
    public void testSetArchivosAdjuntosThrowsException() {
        List<File> archivosAdjuntos = List.of(new File("archivo1.txt"));
        assertThrows(UnsupportedOperationException.class, 
            () -> documento.setArchivosAdjuntos(archivosAdjuntos), 
            "Se esperaba UnsupportedOperationException al establecer los archivos adjuntos.");
    }

    @Test
    public void testActualizarVersionThrowsException() {
        assertThrows(UnsupportedOperationException.class, 
            () -> documento.actualizarVersion(), 
            "Se esperaba UnsupportedOperationException al actualizar la versión.");
    }
}

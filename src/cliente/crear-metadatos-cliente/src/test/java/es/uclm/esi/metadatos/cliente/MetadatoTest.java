package es.uclm.esi.metadatos.cliente;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Dominio.Metadato;

class MetadatoTest {

    private Metadato metadato;

    @BeforeEach
    void setUp() {
        metadato = new Metadato();
    }

    @Test
    void testSetAndGetIdMetadato() {
        String idMetadato = "123";
        metadato.setIdMetadato(idMetadato);
        assertEquals(idMetadato, metadato.getIdMetadato(), "El ID del metadato no coincide");
    }

    @Test
    void testSetAndGetNombre() {
        String nombre = "Nombre de ejemplo";
        metadato.setNombre(nombre);
        assertEquals(nombre, metadato.getNombre(), "El nombre no coincide");
    }

    @Test
    void testSetAndGetDescripcion() {
        String descripcion = "Descripción de ejemplo";
        metadato.setDescripcion(descripcion);
        assertEquals(descripcion, metadato.getDescripcion(), "La descripción no coincide");
    }

    @Test
    void testSetAndGetTipo() {
        String tipo = "Tipo de ejemplo";
        metadato.setTipo(tipo);
        assertEquals(tipo, metadato.getTipo(), "El tipo no coincide");
    }

    @Test
    void testValidarFormatoThrowsException() {
        assertThrows(UnsupportedOperationException.class, () -> metadato.validarFormato(), "Se esperaba UnsupportedOperationException");
    }

    @Test
    void testMostrarVistaPreviaThrowsException() {
        assertThrows(UnsupportedOperationException.class, () -> metadato.mostrarVistaPrevia(), "Se esperaba UnsupportedOperationException");
    }
}

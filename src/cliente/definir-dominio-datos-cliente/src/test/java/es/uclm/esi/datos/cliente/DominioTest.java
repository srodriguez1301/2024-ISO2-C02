package es.uclm.esi.datos.cliente;

import Dominio.Dominio;
import Dominio.Activo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DominioTest {

    private Dominio dominio;

    @BeforeEach
    public void setUp() {
        // Inicializamos una nueva instancia de Dominio antes de cada prueba
        dominio = new Dominio();
    }

    @Test
    public void testSetAndGetId() {
        // Probamos los métodos setId y getId
        String id = "12345";
        dominio.setId(id);
        assertEquals(id, dominio.getId(), "El ID debería coincidir con el valor asignado.");
    }

    @Test
    public void testSetAndGetNombre() {
        // Probamos los métodos setNombre y getNombre
        String nombre = "Dominio de Prueba";
        dominio.setNombre(nombre);
        assertEquals(nombre, dominio.getNombre(), "El nombre debería coincidir con el valor asignado.");
    }

    @Test
    public void testSetAndGetDescripcion() {
        // Probamos los métodos setDescripcion y getDescripcion
        String descripcion = "Descripción de prueba";
        dominio.setDescripcion(descripcion);
        assertEquals(descripcion, dominio.getDescripcion(), "La descripción debería coincidir con el valor asignado.");
    }

    @Test
    public void testAsignarActivo() {
        // Verificamos que el método asignarActivo lanza UnsupportedOperationException
        Activo activo = new Activo();
        assertThrows(UnsupportedOperationException.class, () -> dominio.asignarActivo(activo));
    }

    @Test
    public void testEditar() {
        // Verificamos que el método editar lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> dominio.editar("Nuevo Nombre", "Nueva Descripción"));
    }

    @Test
    public void testEliminar() {
        // Verificamos que el método eliminar lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, dominio::eliminar);
    }

    @Test
    public void testGetAttribute() {
        // Verificamos que el método getAttribute lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, dominio::getAttribute);
    }

    @Test
    public void testSetAttribute() {
        // Verificamos que el método setAttribute lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> dominio.setAttribute(new Object()));
    }
}


package es.uclm.esi.datos.cliente;

import Dominio.Activo;
import Dominio.Dominio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ActivoTest {

    private Activo activo;

    @BeforeEach
    public void setUp() {
        // Inicializamos una nueva instancia de Activo antes de cada prueba
        activo = new Activo();
    }

    @Test
    public void testSetAndGetId() {
        // Probamos los métodos setId y getId
        String id = "A001";
        activo.setId(id);
        assertEquals(id, activo.getId(), "El ID debería coincidir con el valor asignado.");
    }

    @Test
    public void testSetAndGetNombre() {
        // Probamos los métodos setNombre y getNombre
        String nombre = "Activo Principal";
        activo.setNombre(nombre);
        assertEquals(nombre, activo.getNombre(), "El nombre debería coincidir con el valor asignado.");
    }

    @Test
    public void testSetAndGetTipo() {
        // Probamos los métodos setTipo y getTipo
        String tipo = "Tipo1";
        activo.setTipo(tipo);
        assertEquals(tipo, activo.getTipo(), "El tipo debería coincidir con el valor asignado.");
    }

    @Test
    public void testAsignarDominio() {
        // Verificamos que el método asignarDominio lanza UnsupportedOperationException
        Dominio dominio = new Dominio();
        assertThrows(UnsupportedOperationException.class, () -> activo.asignarDominio(dominio),
                "El método asignarDominio debería lanzar UnsupportedOperationException.");
    }
}

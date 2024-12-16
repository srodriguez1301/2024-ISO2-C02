package es.uclm.esi.documentar.procesos.cliente;

import static org.junit.jupiter.api.Assertions.*;
import Dominio.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
    private Usuario usuario;

    @BeforeEach
    public void setUp() {
        usuario = new Usuario();
    }

    @Test
    public void testGetSetId() {
        usuario.setId(123);
        assertEquals(123, usuario.getId());
    }

    @Test
    public void testGetSetNombre() {
        usuario.setNombre("Juan Pérez");
        assertEquals("Juan Pérez", usuario.getNombre());
    }

    @Test
    public void testGetSetEmail() {
        usuario.setEmail("juan.perez@example.com");
        assertEquals("juan.perez@example.com", usuario.getEmail());
    }

    @Test
    public void testGetAttributeThrowsException() {
        assertThrows(UnsupportedOperationException.class, 
            () -> usuario.getAttribute());
    }

    @Test
    public void testSetAttributeThrowsException() {
        assertThrows(UnsupportedOperationException.class, 
            () -> usuario.setAttribute(new Object()));
    }
}

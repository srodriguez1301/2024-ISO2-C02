package es.uclm.esi.metadatos.cliente;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Dominio.Usuario;

class UsuarioTest {

    private Usuario usuario;

    @BeforeEach
    void setUp() {
        usuario = new Usuario();
    }

    @Test
    void testSetAndGetIdUsuario() {
        String idUsuario = "U123";
        usuario.setIdUsuario(idUsuario);
        assertEquals(idUsuario, usuario.getIdUsuario(), "El ID del usuario no coincide");
    }

    @Test
    void testSetAndGetNombre() {
        String nombre = "Juan Pérez";
        usuario.setNombre(nombre);
        assertEquals(nombre, usuario.getNombre(), "El nombre del usuario no coincide");
    }

    @Test
    void testSetAndGetTipoUsuario() {
        String tipoUsuario = "Administrador";
        usuario.setTipoUsuario(tipoUsuario);
        assertEquals(tipoUsuario, usuario.getTipoUsuario(), "El tipo de usuario no coincide");
    }

    @Test
    void testIniciarSesionThrowsException() {
        assertThrows(UnsupportedOperationException.class, () -> usuario.iniciarSesion(), "Se esperaba UnsupportedOperationException");
    }

    @Test
    void testCrearMetadatosThrowsException() {
        assertThrows(UnsupportedOperationException.class, () -> usuario.crearMetadatos(), "Se esperaba UnsupportedOperationException");
    }
}

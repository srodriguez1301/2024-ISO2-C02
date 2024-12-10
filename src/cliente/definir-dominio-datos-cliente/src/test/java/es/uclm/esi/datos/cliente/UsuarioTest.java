package es.uclm.esi.datos.cliente;

import InterfazUsuario.Usuario;
import Dominio.Dominio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    private Usuario usuario;

    @BeforeEach
    public void setUp() {
        // Inicializamos la instancia de Usuario antes de cada prueba
        usuario = new Usuario();
    }

    @Test
    public void testGestionarDominiosThrowsException() {
        // Creamos un Dominio de prueba
        Dominio dominio = new Dominio();

        // Verificamos que gestionarDominios lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, 
            () -> usuario.gestionarDominios(dominio),
            "El método gestionarDominios debería lanzar UnsupportedOperationException.");
    }

    @Test
    public void testSetAndGetRol() {
        // Configuración y prueba del atributo rol
        String rol = "Administrador";
        usuario.setRol(rol); // Esto supone que añadas un setter para `_rol`
        assertEquals(rol, usuario.getRol(), "El método getRol debería devolver el rol establecido.");
    }

    @Test
    public void testSetAndGetNombre() {
        // Configuración y prueba del atributo nombre
        String nombre = "Juan Pérez";
        usuario.setNombre(nombre); // Esto supone que añadas un setter para `_nombre`
        assertEquals(nombre, usuario.getNombre(), "El método getNombre debería devolver el nombre establecido.");
    }
}

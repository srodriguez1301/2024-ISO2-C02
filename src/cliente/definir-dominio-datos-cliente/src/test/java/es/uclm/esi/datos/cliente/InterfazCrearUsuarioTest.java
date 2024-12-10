package es.uclm.esi.datos.cliente;

import InterfazUsuario.InterfazCrearUsuario;
import Dominio.Dominio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InterfazCrearUsuarioTest {

    private InterfazCrearUsuario interfazCrearUsuario;
    private Dominio dominio;

    @BeforeEach
    public void setUp() {
        // Inicializamos las instancias necesarias antes de cada prueba
        interfazCrearUsuario = new InterfazCrearUsuario();
        dominio = new Dominio();
    }

    @Test
    public void testEnviarDominioThrowsException() {
        // Verificamos que el método enviarDominio lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> interfazCrearUsuario.enviarDominio(dominio),
                "El método enviarDominio debería lanzar UnsupportedOperationException.");
    }
}

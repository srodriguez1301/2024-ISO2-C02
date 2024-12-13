package es.uclm.esi.metadatos.cliente;

import static org.junit.jupiter.api.Assertions.*;

import Dominio.Usuario;
import InterfazUsuario.InterfazCrearUsuario;
import Dominio.Metadato;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InterfazCrearUsuarioTest {

    private InterfazCrearUsuario interfazCrearUsuario;

    @BeforeEach
    public void setUp() {
        interfazCrearUsuario = new InterfazCrearUsuario();
    }

    @Test
    public void testEnviarUsuarioThrowsException() {
        Usuario usuario = new Usuario(); // Se debe crear un objeto adecuado de la clase Usuario
        assertThrows(UnsupportedOperationException.class, 
            () -> interfazCrearUsuario.enviarUsuario(usuario), 
            "Se esperaba UnsupportedOperationException al enviar el usuario");
    }

    @Test
    public void testEnviarMetadatoThrowsException() {
        Metadato metadato = new Metadato(); // Se debe crear un objeto adecuado de la clase Metadato
        assertThrows(UnsupportedOperationException.class, 
            () -> interfazCrearUsuario.enviarMetadato(metadato), 
            "Se esperaba UnsupportedOperationException al enviar el metadato");
    }
}

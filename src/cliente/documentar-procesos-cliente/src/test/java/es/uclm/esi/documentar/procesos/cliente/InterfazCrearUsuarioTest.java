package es.uclm.esi.documentar.procesos.cliente;

import static org.junit.jupiter.api.Assertions.*;
import InterfazCrearUsuario.InterfazCrearUsuario;
import Dominio.Documento;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InterfazCrearUsuarioTest {

    private InterfazCrearUsuario interfazCrearUsuario;

    @BeforeEach
    public void setUp() {
        interfazCrearUsuario = new InterfazCrearUsuario();
    }

    @Test
    public void testEnviarDatosThrowsException() {
        Documento documento = new Documento();
        assertThrows(UnsupportedOperationException.class, 
            () -> interfazCrearUsuario.enviarDatos(documento));
    }
}

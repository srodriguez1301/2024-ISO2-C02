package es.uclm.esi.datos.cliente;

import InterfazUsuario.ValidadorLocal;
import Dominio.Dominio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidadorLocalTest {

    @Test
    public void testValidarDatosThrowsException() {
        // Creamos una instancia de ValidadorLocal
        ValidadorLocal validador = new ValidadorLocal();

        // Creamos un Dominio de prueba
        Dominio dominio = new Dominio();

        // Verificamos que validarDatos lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, 
            () -> validador.validarDatos(dominio),
            "El método validarDatos debería lanzar UnsupportedOperationException.");
    }
}

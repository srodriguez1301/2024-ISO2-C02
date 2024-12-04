package es.uclm.esi.gestionar;

import InterfazUsuario.AutentificacionIU;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutenticationIUTest {

    private AutentificacionIU autentificacionIU;

    @BeforeEach
    public void setUp() {
        // Inicializamos la instancia de AutentificacionIU
        autentificacionIU = new AutentificacionIU();
    }

    @Test
    public void testValidateCredentials() {
        // Verificamos que el método validate_credentials lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            autentificacionIU.validate_credentials("username", "password");
        });
    }

    @Test
    public void testShowErrorMessage() {
        // Verificamos que el método show_error_message lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            autentificacionIU.show_error_message();
        });
    }
}

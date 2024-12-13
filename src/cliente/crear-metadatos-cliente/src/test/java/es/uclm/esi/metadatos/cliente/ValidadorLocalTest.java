package es.uclm.esi.metadatos.cliente;

import static org.junit.jupiter.api.Assertions.*;

import Dominio.Metadato;
import InterfazUsuario.ValidadorLocal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidadorLocalTest {

    private ValidadorLocal validadorLocal;

    @BeforeEach
    public void setUp() {
        validadorLocal = new ValidadorLocal();
    }

    @Test
    public void testValidarCamposObligatoriosThrowsException() {
        Metadato metadato = new Metadato(); // Se debe crear un objeto adecuado de la clase Metadato
        assertThrows(UnsupportedOperationException.class, 
            () -> validadorLocal.validarCamposObligatorios(metadato), 
            "Se esperaba UnsupportedOperationException al validar los campos obligatorios");
    }

    @Test
    public void testVerificarConsistenciaThrowsException() {
        Metadato metadato = new Metadato(); // Se debe crear un objeto adecuado de la clase Metadato
        assertThrows(UnsupportedOperationException.class, 
            () -> validadorLocal.verificarConsistencia(metadato), 
            "Se esperaba UnsupportedOperationException al verificar la consistencia");
    }
}

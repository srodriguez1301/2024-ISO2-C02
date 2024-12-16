package es.uclm.esi.documentar.procesos.cliente;

import static org.junit.jupiter.api.Assertions.*;
import InterfazUsuario.ValidadorLocal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Map;

public class ValidadorLocalTest {

    private ValidadorLocal validadorLocal;

    @BeforeEach
    public void setUp() {
        validadorLocal = new ValidadorLocal();
    }

    @Test
    public void testValidarCamposThrowsException() {
        Map<String, String> campos = Map.of("campo1", "valor1", "campo2", "valor2");
        assertThrows(UnsupportedOperationException.class, 
            () -> validadorLocal.validarCampos(campos));
    }

    @Test
    public void testValidarArchivoThrowsException() {
        File archivo = new File("archivo.txt");
        assertThrows(UnsupportedOperationException.class, 
            () -> validadorLocal.validarArchivo(archivo));
    }
}

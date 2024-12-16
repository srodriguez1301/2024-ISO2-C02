package es.uclm.esi.documentar.procesos.cliente;

import static org.junit.jupiter.api.Assertions.*;
import InterfazUsuario.UsuarioController;
import Dominio.Documento;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

public class UsuarioControllerTest {

    private UsuarioController usuarioController;

    @BeforeEach
    public void setUp() {
        usuarioController = new UsuarioController();
    }

    @Test
    public void testCrearDocumentacionThrowsException() {
        assertThrows(UnsupportedOperationException.class, 
            () -> usuarioController.crearDocumentacion());
    }

    @Test
    public void testEditarDocumentacionThrowsException() {
        Documento documento = new Documento();
        assertThrows(UnsupportedOperationException.class, 
            () -> usuarioController.editarDocumentacion(documento));
    }

    @Test
    public void testBuscarProcesosThrowsException() {
        assertThrows(UnsupportedOperationException.class, 
            () -> usuarioController.buscarProcesos());
    }

    @Test
    public void testAdjuntarArchivoThrowsException() {
        Documento documento = new Documento();
        File archivo = new File("archivo.txt");
        assertThrows(UnsupportedOperationException.class, 
            () -> usuarioController.adjuntarArchivo(documento, archivo));
    }
}

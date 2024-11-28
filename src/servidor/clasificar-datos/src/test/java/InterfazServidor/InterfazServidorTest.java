package InterfazServidor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Dominio.EstadoClasificacion;
import Dominio.Dato;
import Dominio.Categoria;

public class InterfazServidorTest {
    private InterfazServidor servidor;
    private Dato dato;
    private Categoria categoria;

    @BeforeEach
    public void setUp() {
        servidor = new InterfazServidor(); // Asegúrate de que esta clase tenga un constructor adecuado
        dato = new Dato(); // Suponiendo que Dato es una clase que tiene un constructor por defecto
        categoria = new Categoria(); // Lo mismo con Categoria
    }

    @Test
    public void testRecibirDatos() {
        // Suponiendo que recibirDatos(dato) devuelve un booleano si el dato es recibido correctamente
        assertTrue(servidor.recibirDatos(dato)); // Verifica que el dato sea recibido correctamente
    }

    @Test
    public void testValidarCategoria() {
        // Suponiendo que validarCategoria(dato, categoria) devuelve una instancia de Categoria
        Categoria result = servidor.validarCategoria(dato, categoria);
        // Verifica que la categoría devuelta sea la esperada
        assertEquals(categoria, result); // Asegúrate de que la validación retorne la categoría correcta
    }

    @Test
    public void testAlmacenarInformacion() {
        // Suponiendo que almacenarInformacion(dato) devuelve un booleano
        assertTrue(servidor.almacenarInformacion(dato)); // Verifica que la información se almacene correctamente
    }
}

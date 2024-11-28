package dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Dominio.EstadoClasificacion;
import Dominio.Dato;

public class EstadoClasificacionTest {
    private EstadoClasificacion estadoClasificacion;

    @BeforeEach
    public void setUp() {
        estadoClasificacion = new EstadoClasificacion(); // Estado inicial con un dato por defecto
    }

    @Test
    public void testCambiarEstado() {
        // Creamos un nuevo estado y un nuevo dato
        EstadoClasificacion nuevoEstado = new EstadoClasificacion();
        Dato nuevoDato = new Dato();
        nuevoEstado.setDato(nuevoDato); // Asignamos el nuevo dato al nuevo estado

        // Cambiamos el estado de estadoClasificacion a nuevoEstado
        estadoClasificacion.cambiarEstado(nuevoEstado);

        // Verificamos que el dato ha sido correctamente copiado
        assertEquals(nuevoDato, estadoClasificacion.getDato());
    }

    @Test
    public void testCambiarEstadoAEstadoNulo() {
        // Intentamos cambiar a un estado nulo
        EstadoClasificacion nuevoEstado = null;

        // Verificamos que se lanza una excepción IllegalArgumentException cuando el estado es nulo
        assertThrows(IllegalArgumentException.class, () -> estadoClasificacion.cambiarEstado(nuevoEstado));
    }
}

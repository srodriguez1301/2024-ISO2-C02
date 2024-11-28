package dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import Dominio.estado;

public class EstadoTest {

    @Test
    public void testPendienteDescripcion() {
        // Verificar que la constante PENDIENTE tiene la descripción correcta
        assertEquals("El proceso está pendiente", estado.PENDIENTE.getDescripcion());
    }

    @Test
    public void testClasificadoDescripcion() {
        // Verificar que la constante CLASIFICADO tiene la descripción correcta
        assertEquals("El proceso ha sido clasificado", estado.CLASIFICADO.getDescripcion());
    }

    @Test
    public void testEnumValues() {
        // Verificar que los valores del enum se corresponden con los nombres esperados
        assertEquals(2, estado.values().length); // Asegura que hay 2 valores en el enum
        assertEquals(estado.PENDIENTE, estado.valueOf("PENDIENTE"));
        assertEquals(estado.CLASIFICADO, estado.valueOf("CLASIFICADO"));
    }

    @Test
    public void testEnumOrdinal() {
        // Verificar que el ordinal (posición) de los valores del enum es correcto
        assertEquals(0, estado.PENDIENTE.ordinal());  
        assertEquals(1, estado.CLASIFICADO.ordinal()); 
    }
}

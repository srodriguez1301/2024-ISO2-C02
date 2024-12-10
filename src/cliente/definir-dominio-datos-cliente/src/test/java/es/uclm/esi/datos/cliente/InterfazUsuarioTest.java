package es.uclm.esi.datos.cliente;

import InterfazUsuario.InterfazUsuario;
import Dominio.Dominio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class InterfazUsuarioTest {

    private InterfazUsuario interfazUsuario;

    @BeforeEach
    public void setUp() {
        // Inicializamos la instancia de InterfazUsuario antes de cada prueba
        interfazUsuario = new InterfazUsuario();
    }

    @Test
    public void testMostrarListaDominiosThrowsException() {
        // Creamos una lista de dominios de prueba
        List<Dominio> listaDominios = new ArrayList<>();
        listaDominios.add(new Dominio());
        
        // Verificamos que mostrarListaDominios lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, 
            () -> interfazUsuario.mostrarListaDominios(listaDominios),
            "El método mostrarListaDominios debería lanzar UnsupportedOperationException.");
    }

    @Test
    public void testMostrarFormularioDominioThrowsException() {
        // Verificamos que mostrarFormularioDominio lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, 
            () -> interfazUsuario.mostrarFormularioDominio(),
            "El método mostrarFormularioDominio debería lanzar UnsupportedOperationException.");
    }

    @Test
    public void testNotificarErrorThrowsException() {
        // Verificamos que notificarError lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, 
            () -> interfazUsuario.notificarError(),
            "El método notificarError debería lanzar UnsupportedOperationException.");
    }
}

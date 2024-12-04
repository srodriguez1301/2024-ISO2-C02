package es.uclm.esi.gestionar;

import Dominio.Project;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProjectTest {
    private Project project;

    @BeforeEach
    public void setUp() {
        // Inicialización de la clase Project antes de cada prueba
        project = new Project("Test Project");
    }

    @Test
    public void testGetName() {
        // Verificar que el nombre inicial es el que se pasa en el constructor
        assertEquals("Test Project", project.getName(), "El nombre del proyecto debería ser 'Test Project'");
    }

    @Test
    public void testSetName() {
        // Cambiar el nombre del proyecto
        project.setName("New Project Name");
        
        // Verificar que el nombre ha sido actualizado correctamente
        assertEquals("New Project Name", project.getName(), "El nombre del proyecto debería ser 'New Project Name'");
    }
}

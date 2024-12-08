package es.uclm.esi.gestionar;

import Dominio.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {
    private Task task;

    @BeforeEach
    public void setUp() {
        // Inicialización de la clase Task antes de cada prueba
        task = new Task(1, "Test Task");
    }

    @Test
    public void testGetId() {
        // Verificar que el ID de la tarea es el que se pasó en el constructor
        assertEquals(1, task.getId(), "El ID de la tarea debería ser 1");
    }

    @Test
    public void testSetId() {
        // Cambiar el ID de la tarea
        task.setId(2);
        
        // Verificar que el ID se actualizó correctamente
        assertEquals(2, task.getId(), "El ID de la tarea debería ser 2 después de usar setId");
    }

    @Test
    public void testGetTitle() {
        // Verificar que el título de la tarea es el que se pasó en el constructor
        assertEquals("Test Task", task.getTitle(), "El título de la tarea debería ser 'Test Task'");
    }

    @Test
    public void testSetTitle() {
        // Cambiar el título de la tarea
        task.setTitle("New Task Title");
        
        // Verificar que el título se actualizó correctamente
        assertEquals("New Task Title", task.getTitle(), "El título de la tarea debería ser 'New Task Title'");
    }
}

package es.uclm.esi.gestionar;

import Dominio.DataSource;
import Dominio.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DataSourceTest {
    private DataSource dataSource;

    @BeforeEach
    public void setUp() {
        dataSource = new DataSource();
    }

    @Test
    public void testSetAndGetTask() {
        Task task = new Task(10, "Test Task");
        dataSource.setTask(task);
        
        assertNotNull(dataSource.getTask(), "La tarea asociada no debería ser nula");
        assertEquals(10, dataSource.getTask().getId(), "El ID de la tarea no coincide");
        assertEquals("Test Task", dataSource.getTask().getTitle(), "El título de la tarea no coincide");
    }
}


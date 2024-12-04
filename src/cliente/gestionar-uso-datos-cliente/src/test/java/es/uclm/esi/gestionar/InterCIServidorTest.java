package es.uclm.esi.gestionar;

import InterfazServidor.InterCIServidor;
import Dominio.DataSource;
import Dominio.Colaborator;
import Dominio.Project;
import Dominio.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InterCIServidorTest {
    private InterCIServidor servidor;

    @BeforeEach
    public void setUp() {
        // Inicializamos la instancia del servidor
        servidor = new InterCIServidor();
    }

    @Test
    public void testLogin() {
        // Verificamos que el método login lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            servidor.login("user", "password");
        });
    }

    @Test
    public void testRecoverPassword() {
        // Verificamos que el método recoverPassword lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            servidor.recoverPassword("email@example.com");
        });
    }

    @Test
    public void testGetAllProjects() {
        // Verificamos que el método getAllProjects lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            servidor.getAllProjects();
        });
    }

    @Test
    public void testCreateProject() {
        // Verificamos que el método createProject lanza UnsupportedOperationException
        Project project = new Project("New Project");
        assertThrows(UnsupportedOperationException.class, () -> {
            servidor.createProject(project);
        });
    }

    @Test
    public void testUpdateProject() {
        // Verificamos que el método updateProject lanza UnsupportedOperationException
        Project project = new Project("Updated Project");
        assertThrows(UnsupportedOperationException.class, () -> {
            servidor.updateProject(1, project);
        });
    }

    @Test
    public void testCompleteProject() {
        // Verificamos que el método completeProject lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            servidor.completeProject(1);
        });
    }

    @Test
    public void testGetAllTasks() {
        // Verificamos que el método getAllTasks lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            servidor.getAllTasks();
        });
    }

    @Test
    public void testCreateTask() {
        // Verificamos que el método createTask lanza UnsupportedOperationException
        Task task = new Task(1, "New Task");
        assertThrows(UnsupportedOperationException.class, () -> {
            servidor.createTask(task);
        });
    }

    @Test
    public void testReassignTask() {
        // Verificamos que el método reassignTask lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            servidor.reassignTask(1, 1);
        });
    }

    @Test
    public void testUpdateTaskStatus() {
        // Verificamos que el método updateTaskStatus lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            servidor.updateTaskStatus(1, "In Progress");
        });
    }

    @Test
    public void testGetAllCollaborators() {
        // Verificamos que el método getAllCollaborators lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            servidor.getAllCollaborators();
        });
    }

    @Test
    public void testAddCollaborator() {
        // Verificamos que el método addCollaborator lanza UnsupportedOperationException
        Colaborator collaborator = new Colaborator();
        assertThrows(UnsupportedOperationException.class, () -> {
            servidor.addCollaborator(collaborator);
        });
    }

    @Test
    public void testUpdatePermissions() {
        // Verificamos que el método updatePermissions lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            servidor.updatePermissions(1, "Admin");
        });
    }

    @Test
    public void testGetAllDataSources() {
        // Verificamos que el método getAllDataSources lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            servidor.getAllDataSources();
        });
    }

    @Test
    public void testAddDataSource() {
        // Verificamos que el método addDataSource lanza UnsupportedOperationException
        DataSource dataSource = new DataSource();
        assertThrows(UnsupportedOperationException.class, () -> {
            servidor.addDataSource(dataSource);
        });
    }
}

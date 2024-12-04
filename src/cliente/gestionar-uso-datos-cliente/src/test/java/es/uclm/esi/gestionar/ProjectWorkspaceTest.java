package es.uclm.esi.gestionar;

import InterfazUsuario.ProjectWorkspace;
import Dominio.Colaborator;
import Dominio.Proposal;
import Dominio.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class ProjectWorkspaceTest {

    private ProjectWorkspace projectWorkspace;

    @BeforeEach
    public void setUp() {
        // Inicializamos la instancia de ProjectWorkspace
        projectWorkspace = new ProjectWorkspace();
    }

    @Test
    public void testUpdateProjectSettings() {
        // Verificamos que el método updateProjectSettings lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            projectWorkspace.updateProjectSettings("Project Name", "Project Description", Collections.singletonList("Objective"));
        });
    }

    @Test
    public void testAddCollaborator() {
        // Verificamos que el método addCollaborator lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            projectWorkspace.addCollaborator(new Colaborator());
        });
    }

    @Test
    public void testSetPermissions() {
        // Verificamos que el método setPermissions lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            projectWorkspace.setPermissions("collaboratorId", "permission");
        });
    }

    @Test
    public void testClassifyData() {
        // Verificamos que el método classifyData lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            projectWorkspace.classifyData("data");
        });
    }

    @Test
    public void testSelectDataSources() {
        // Verificamos que el método selectDataSources lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            projectWorkspace.selectDataSources(Collections.singletonList("source"));
        });
    }

    @Test
    public void testApproveProposal() {
        // Verificamos que el método approveProposal lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            projectWorkspace.approveProposal(1);
        });
    }

    @Test
    public void testRejectProposal() {
        // Verificamos que el método rejectProposal lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            projectWorkspace.rejectProposal(1);
        });
    }

    @Test
    public void testAssignTask() {
        // Verificamos que el método assignTask lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            projectWorkspace.assignTask(new Task(1, "Task Title"));
        });
    }

    @Test
    public void testMarkProjectCompleted() {
        // Verificamos que el método markProjectCompleted lanza UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            projectWorkspace.markProjectCompleted();
        });
    }
}

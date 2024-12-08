package es.uclm.esi.gestionar;

import Dominio.Colaborator;
import Dominio.Project;
import Dominio.Proposal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColaboratorTest {
    private Colaborator colaborator;

    @BeforeEach
    public void setUp() {
        colaborator = new Colaborator();
    }

    @Test
    public void testDefaultProposalAssociation() {
        assertNotNull(colaborator.getProposal(), "La propuesta asociada debería ser inicializada");
        assertEquals("Default Proposal", colaborator.getProposal().getTitle(), "El título de la propuesta no coincide");
    }

    @Test
    public void testDefaultProjectAssociation() {
        assertNotNull(colaborator.getProject(), "El proyecto asociado debería ser inicializado");
        assertEquals("Default Project", colaborator.getProject().getName(), "El nombre del proyecto no coincide");
    }

    @Test
    public void testSetAndGetName() {
        colaborator.setName("John Doe");
        assertEquals("John Doe", colaborator.getName(), "El nombre no coincide");
    }

    @Test
    public void testSetAndGetRole() {
        colaborator.setRole("Manager");
        assertEquals("Manager", colaborator.getRole(), "El rol no coincide");
    }

    @Test
    public void testSetAndGetId() {
        colaborator.setId(1);
        assertEquals(1, colaborator.getId(), "El ID no coincide");
    }
}

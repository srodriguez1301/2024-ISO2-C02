package es.uclm.esi.gestionar;

import Dominio.Proposal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProposalTest {
    private Proposal proposal;

    @BeforeEach
    public void setUp() {
        // Inicialización de la clase Proposal antes de cada prueba
        proposal = new Proposal("Test Proposal");
    }

    @Test
    public void testGetTitle() {
        // Verificar que el título inicial es el que se pasa en el constructor
        assertEquals("Test Proposal", proposal.getTitle(), "El título de la propuesta debería ser 'Test Proposal'");
    }

    @Test
    public void testSetTitle() {
        // Cambiar el título de la propuesta
        proposal.setTitle("New Proposal Title");
        
        // Verificar que el título ha sido actualizado correctamente
        assertEquals("New Proposal Title", proposal.getTitle(), "El título de la propuesta debería ser 'New Proposal Title'");
    }

    @Test
    public void testDefaultConstructor() {
        // Probar el constructor sin argumentos
        Proposal defaultProposal = new Proposal();
        assertNull(defaultProposal.getTitle(), "El título debería ser null al usar el constructor por defecto");
    }
}

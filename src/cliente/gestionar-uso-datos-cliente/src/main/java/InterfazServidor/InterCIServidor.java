package InterfazServidor;
import java.util.List;


import org.springframework.http.ResponseEntity;

import Dominio.DataSource;
import Dominio.Colaborator;
import Dominio.Project;
import Dominio.Task;

public class InterCIServidor {

	public ResponseEntity<String> login(String aUsername, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public ResponseEntity<String> recoverPassword(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public ResponseEntity<List<Project>> getAllProjects() {
		throw new UnsupportedOperationException();
	}

	public ResponseEntity<String> createProject(Project aProject) {
		throw new UnsupportedOperationException();
	}

	public ResponseEntity<String> updateProject(int aId, Project aProject) {
		throw new UnsupportedOperationException();
	}

	public ResponseEntity<String> completeProject(int aId) {
		throw new UnsupportedOperationException();
	}

	public ResponseEntity<List<Task>> getAllTasks() {
		throw new UnsupportedOperationException();
	}

	public void getAttribute() {
		throw new UnsupportedOperationException();
	}

	public void setAttribute(Object aAttribute) {
		throw new UnsupportedOperationException();
	}

	public ResponseEntity<String> createTask(Task aTask) {
		throw new UnsupportedOperationException();
	}

	public ResponseEntity<String> reassignTask(int aId, int aCollaboratorId) {
		throw new UnsupportedOperationException();
	}

	public ResponseEntity<String> updateTaskStatus(int aId, String aStatus) {
		throw new UnsupportedOperationException();
	}

	public ResponseEntity<List<Colaborator>> getAllCollaborators() {
		throw new UnsupportedOperationException();
	}

	public ResponseEntity<String> addCollaborator(Colaborator aCollaborator) {
		throw new UnsupportedOperationException();
	}

	public ResponseEntity<String> updatePermissions(int aId, String aPermissions) {
		throw new UnsupportedOperationException();
	}

	public ResponseEntity<List<DataSource>> getAllDataSources() {
		throw new UnsupportedOperationException();
	}

	public ResponseEntity<String> addDataSource(DataSource aDataSource) {
		throw new UnsupportedOperationException();
	}
}
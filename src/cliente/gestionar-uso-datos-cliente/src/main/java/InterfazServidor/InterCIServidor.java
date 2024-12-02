package Cliente.InterfazServidor;

import Cliente.Dominio.Project;
import Cliente.Dominio.Task;
import Cliente.Dominio.DataSource;

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

	public ResponseEntity<List<Collaborator>> getAllCollaborators() {
		throw new UnsupportedOperationException();
	}

	public ResponseEntity<String> addCollaborator(Collaborator aCollaborator) {
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
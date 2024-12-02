package Cliente.InterfazUsuario;

public class ProjectWorkspace {
	private String _projectName;
	private String _projectDescription;
	private List<String> _projectObjectives;
	private List<Collaborator> _collaborators;
	private List<String> _permissions;
	private List<String> _dataSources;
	private List<String> _dataClassification;
	private List<Proposal> _proposals;
	private List<Task> _tasks;
	private String _projectStatus;

	public void updateProjectSettings(String aName, String aDescription, List<String> aObjectives) {
		throw new UnsupportedOperationException();
	}

	public void addCollaborator(Collaborator aCollaborator) {
		throw new UnsupportedOperationException();
	}

	public void setPermissions(String aCollaboratorId, String aPermission) {
		throw new UnsupportedOperationException();
	}

	public void classifyData(String aData) {
		throw new UnsupportedOperationException();
	}

	public void selectDataSources(List<String> aSources) {
		throw new UnsupportedOperationException();
	}

	public void approveProposal(int aProposalId) {
		throw new UnsupportedOperationException();
	}

	public void rejectProposal(int aProposalId) {
		throw new UnsupportedOperationException();
	}

	public void assignTask(Task aTask) {
		throw new UnsupportedOperationException();
	}

	public void markProjectCompleted() {
		throw new UnsupportedOperationException();
	}
}
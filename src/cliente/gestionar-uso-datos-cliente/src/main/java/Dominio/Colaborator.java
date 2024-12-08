package Dominio;

public class Colaborator {
    private int _id;
    private String _name;
    private String _role;
    private Project ___; // Relación con Project
    private Proposal _unnamed_Proposal_142; // Relación con Proposal

    // Constructor
    public Colaborator() {
        this._unnamed_Proposal_142 = new Proposal("Default Proposal"); // Inicialización predeterminada
        this.___ = new Project("Default Project"); // Inicialización predeterminada para Project
    }

    // Getters y Setters
    public int getId() {
        return _id;
    }

    public void setId(int id) {
        this._id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public String getRole() {
        return _role;
    }

    public void setRole(String role) {
        this._role = role;
    }

    public Project getProject() {
        return ___;
    }

    public void setProject(Project project) {
        this.___ = project;
    }

    public Proposal getProposal() {
        return _unnamed_Proposal_142;
    }

    public void setProposal(Proposal proposal) {
        this._unnamed_Proposal_142 = proposal;
    }
}


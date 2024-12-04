package Dominio;

public class Proposal {
    private String title;

    // Constructor sin argumentos
    public Proposal() {
    }

    // Constructor con un argumento para inicializar el título
    public Proposal(String title) {
        this.title = title;
    }

    // Getter y Setter para el título
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

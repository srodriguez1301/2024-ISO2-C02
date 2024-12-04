package Dominio;

public class DataSource {
    private int id;
    private String name;
    private String type;
    private String classification;
    private Task task; // Campo de tipo Task

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}

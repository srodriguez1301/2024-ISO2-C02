package Dominio;

public class Dato {
    private String id;
    private String nombre;
    private Categoria categoria;
    private EstadoClasificacion estado;

    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public EstadoClasificacion getEstado() {
        return estado;
    }

    // Implementación del método asignarCategoria
    public void asignarCategoria(Categoria categoria) {
        this.categoria = categoria; // Asigna la categoría
    }

    // Implementación del método actualizarEstado
    public void actualizarEstado(EstadoClasificacion estado) {
        this.estado = estado; // Asigna el estado
    }
}

package Dominio;

public class Categoria {

    private String nombre;
    private String descripcion;

    // Otros métodos, constructores, etc.

    public boolean esCategoriaValida(String nombre) {
        // Ejemplo de validación: el nombre no puede ser nulo ni vacío
        if (nombre == null || nombre.trim().isEmpty()) {
            return false;
        }
        // Si hay más reglas de validación, añádelas aquí
        return true;
    }

    // Métodos setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

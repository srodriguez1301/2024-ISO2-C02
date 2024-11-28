package Dominio;

public class EstadoClasificacion {
    // Cambié el nombre del campo para que sea más claro
    private Dato dato;

    // Constructor
    public EstadoClasificacion() {
        // Inicializa el campo dato si es necesario
        this.dato = new Dato();
    }

    // Getter y Setter para 'dato'
    public Dato getDato() {
        return dato;
    }

    public void setDato(Dato dato) {
        this.dato = dato;
    }

    // Implementación del método cambiarEstado
    public void cambiarEstado(EstadoClasificacion aEstado) {
        if (aEstado != null) {
            // Lógica para cambiar el estado (por ejemplo, asignando el dato de otro estado)
            this.dato = aEstado.getDato(); // Copiamos el dato del otro estado
        } else {
            throw new IllegalArgumentException("El estado no puede ser nulo");
        }
    }
}

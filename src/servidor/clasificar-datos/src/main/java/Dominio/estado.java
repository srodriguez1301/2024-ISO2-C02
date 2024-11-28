package Dominio;

public enum estado {
    PENDIENTE("El proceso está pendiente"),
    CLASIFICADO("El proceso ha sido clasificado");

    private final String descripcion;

    estado(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

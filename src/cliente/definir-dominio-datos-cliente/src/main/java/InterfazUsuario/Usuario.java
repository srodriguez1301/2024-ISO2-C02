package InterfazUsuario;

import Dominio.Dominio;

public class Usuario {
    private String _rol;
    private String _nombre;

    // Métodos set y get para el rol
    public String getRol() {
        return _rol;
    }

    public void setRol(String rol) {
        this._rol = rol;
    }

    // Métodos set y get para el nombre
    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String nombre) {
        this._nombre = nombre;
    }

    public void gestionarDominios(Dominio aDominio) {
        throw new UnsupportedOperationException();
    }
}

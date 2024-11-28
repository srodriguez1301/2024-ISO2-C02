package InterfazServidor;

import Dominio.Categoria;
import Dominio.Dato;

public class InterfazServidor {

    // Método para recibir un Dato
    public boolean recibirDatos(Dato aDato) {
        if (aDato == null) {
            return false; // No se puede recibir un dato nulo
        }
        return true; // Retorna true si el dato es recibido correctamente
    }

    // Método para validar la categoría de un Dato
    public Categoria validarCategoria(Dato aDato, Categoria aCat) {
        if (aDato == null || aCat == null) {
            return null; // Si alguno de los parámetros es nulo, no se puede validar la categoría
        }
        // Aquí podríamos tener más lógica para validar si el dato pertenece a la categoría
        return aCat; // Retorna la categoría si es válida
    }

    // Método para almacenar un Dato
    public boolean almacenarInformacion(Dato aDato) {
        if (aDato == null) {
            return false; // No se puede almacenar un dato nulo
        }
        // Lógica para almacenar el dato (ejemplo: agregar a una base de datos, etc.)
        return true; // Retorna true si el dato es almacenado correctamente
    }

    // Método para responder con un Dato
    public void responder(Dato aDato) {
        if (aDato == null) {
            throw new IllegalArgumentException("El dato no puede ser nulo");
        }
        // Aquí podríamos implementar la lógica para responder con el Dato (ej. devolver algún tipo de respuesta)
        System.out.println("Respuesta: " + aDato.getNombre()); // Supón que Dato tiene un método getNombre()
    }
}

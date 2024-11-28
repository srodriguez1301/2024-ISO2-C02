package InterfazUsuario;

import Dominio.Dato;

public class InterfazUsuario {

    // Método para enviar datos
    public boolean enviarDatos(Dato aDato) {
        if (aDato == null) {
            return false; // No se puede enviar un dato nulo
        }
        return true; // Si el dato se envía correctamente retorna true
    }
}

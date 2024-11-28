package es.uclm.esi.clasificar.datos.cliente.InterfazUsuario;

import java.util.List;
import java.util.Map;

import es.uclm.esi.clasificar.datos.cliente.Dominio.Dato;
import es.uclm.esi.clasificar.datos.cliente.Dominio.EstadoClasificacion;

public class VistaEstadoClasificacion {
	private Map<Dato, EstadoClasificacion> estadoDatos;

	public void actualizarEstado(List<Dato> aDatos) {
		throw new UnsupportedOperationException();
	}

	public void mostrarErrores(String aMensaje) {
		throw new UnsupportedOperationException();
	}
}
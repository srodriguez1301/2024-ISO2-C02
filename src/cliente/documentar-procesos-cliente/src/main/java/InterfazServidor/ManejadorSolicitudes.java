package InterfazServidor;

import java.util.List;
import Dominio.Documento;

public class ManejadorSolicitudes {
	private int _codigo;
	private String _mensaje;
	private Documento _documento;

	public void enviarCrearSolicitud(Documento aDocumento) {
		throw new UnsupportedOperationException();
	}

	public void enviarActualizarSolicitud(Documento aDocumento) {
		throw new UnsupportedOperationException();
	}

	public List<Documento> enviarConsulta() {
		throw new UnsupportedOperationException();
	}

	public void responder(int aCodigo, String aMensaje) {
		throw new UnsupportedOperationException();
	}
}
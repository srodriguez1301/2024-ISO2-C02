package Dominio;

public class Usuario {
	private String _idUsuario;
	private String _nombre;
	private String _tipoUsuario;
	public Metadato metadato;

	public String getIdUsuario() {
		return this._idUsuario;
	}

	public void setIdUsuario(String aIdUsuario) {
		this._idUsuario = aIdUsuario;
	}

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public String getTipoUsuario() {
		return this._tipoUsuario;
	}

	public void setTipoUsuario(String aTipoUsuario) {
		this._tipoUsuario = aTipoUsuario;
	}

	public boolean iniciarSesion() {
		throw new UnsupportedOperationException();
	}

	public void crearMetadatos() {
		throw new UnsupportedOperationException();
	}
}
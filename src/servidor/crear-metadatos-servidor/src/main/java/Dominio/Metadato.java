package Dominio;

public class Metadato {
	private String _idMetadato;
	private String _nombre;
	private String _descripcion;
	private String _tipo;
	public Usuario usuario;

	public String getIdMetadato() {
		return this._idMetadato;
	}

	public void setIdMetadato(String aIdMetadato) {
		this._idMetadato = aIdMetadato;
	}

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public String getDescripcion() {
		return this._descripcion;
	}

	public void setDescripcion(String aDescripcion) {
		this._descripcion = aDescripcion;
	}

	public String getTipo() {
		return this._tipo;
	}

	public void setTipo(String aTipo) {
		this._tipo = aTipo;
	}

	public boolean validarFormato() {
		throw new UnsupportedOperationException();
	}

	public String mostrarVistaPrevia() {
		throw new UnsupportedOperationException();
	}
}
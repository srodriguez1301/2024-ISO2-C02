package Dominio;

public class Dominio {
	private String _id;
	private String _nombre;
	private String _descripcion;
	public Activo _unnamed_Activo_;

	public void asignarActivo(Activo aActivo) {
		throw new UnsupportedOperationException();
	}

	public void editar(String aNombre, String aDescripcion) {
		throw new UnsupportedOperationException();
	}

	public void eliminar() {
		throw new UnsupportedOperationException();
	}

	public String getId() {
		return this._id;
	}

	public void setId(String aId) {
		this._id = aId;
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

	public void getAttribute() {
		throw new UnsupportedOperationException();
	}

	public void setAttribute(Object aAttribute) {
		throw new UnsupportedOperationException();
	}
}
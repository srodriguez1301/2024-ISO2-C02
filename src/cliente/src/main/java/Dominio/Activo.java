package Dominio;

public class Activo {
	private String _id;
	private String _nombre;
	private String _tipo;
	public Dominio _unnamed_Dominio_;

	public void asignarDominio(Dominio aDominio) {
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

	public String getTipo() {
		return this._tipo;
	}

	public void setTipo(String aTipo) {
		this._tipo = aTipo;
	}
}
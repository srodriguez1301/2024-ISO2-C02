package Dominio;

public class Dato {
	private EstadoClasificacion _estadoClasificacion;
	private Categoria _categoria;
	private String _id;
	private String _nombre;
	public EstadoClasificacion _____1;

	public void asignarCategoria(Categoria aCategoria) {
		throw new UnsupportedOperationException();
	}

	public Void actualizarEstado(EstadoClasificacion aEstado) {
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
}
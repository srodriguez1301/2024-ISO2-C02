package Diseño_It2.Dominio;

public class Categoria {
	private String _nombre;
	private String _descripcion;
	private Object _attribute;

	public Boolean esCategoriaValida(String aCategoria) {
		throw new UnsupportedOperationException();
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
		return this._attribute;
	}

	public void setAttribute(Object aAttribute) {
		this._attribute = aAttribute;
	}
}
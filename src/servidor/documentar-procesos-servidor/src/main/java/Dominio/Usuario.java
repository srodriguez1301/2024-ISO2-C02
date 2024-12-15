package Dominio;

public class Usuario {
	private int _id;
	private String _nombre;
	private String _email;
	public Documento _____;

	public int getId() {
		return this._id;
	}

	public void setId(int aId) {
		this._id = aId;
	}

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public String getEmail() {
		return this._email;
	}

	public void setEmail(String aEmail) {
		this._email = aEmail;
	}

	public void getAttribute() {
		throw new UnsupportedOperationException();
	}

	public void setAttribute(Object aAttribute) {
		throw new UnsupportedOperationException();
	}
}
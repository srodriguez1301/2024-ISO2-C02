package Dominio;

import java.io.File;
import java.util.List;

public class Documento {
	private int _id;
	private String _titulo;
	private String _descripcion;
	private String _version;
	private List<File> _archivosAdjuntos;
	public Usuario _____;
	public ProcesoNegocio _______;
	public HistorialVersiones _unnamed_HistorialVersiones_;

	public int getId() {
		return this._id;
	}

	public void setId(int aId) {
		this._id = aId;
	}

	public String getTitulo() {
		return this._titulo;
	}

	public void setTitulo(String aTitulo) {
		this._titulo = aTitulo;
	}

	public String getDescripcion() {
		return this._descripcion;
	}

	public void setDescripcion(String aDescripcion) {
		this._descripcion = aDescripcion;
	}

	public String getVersion() {
		return this._version;
	}

	public void setVersion(String aVersion) {
		this._version = aVersion;
	}

	public List<File> getArchivosAdjuntos() {
		throw new UnsupportedOperationException();
	}

	public void setArchivosAdjuntos(List<File> aArchivosAdjuntos) {
		throw new UnsupportedOperationException();
	}

	public void actualizarVersion() {
		throw new UnsupportedOperationException();
	}
}
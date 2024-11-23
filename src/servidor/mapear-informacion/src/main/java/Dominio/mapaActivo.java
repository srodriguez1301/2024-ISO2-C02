package Dominio;

import java.sql.Date;
import java.util.List;

public class mapaActivo {

	private int id;
	private String nombre;
	private List<String> relaciones;
	private Date fechaGenerado;

	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param relaciones
	 * @param fechaGenerado
	 */
	public void constructor(int id, String nombre, List<String> relaciones, Date fechaGenerado) {
		// TODO - implement mapaActivo.constructor
		throw new UnsupportedOperationException();
	}

	public int getId() {
		return this.id;
	}

	public String getNombre() {
		// TODO - implement mapaActivo.getNombre
		throw new UnsupportedOperationException();
	}

	public List<String> getRepreRelaciones() {
		// TODO - implement mapaActivo.getRepreRelaciones
		throw new UnsupportedOperationException();
	}

	public Date getFechaGenerado() {
		return this.fechaGenerado;
	}

}
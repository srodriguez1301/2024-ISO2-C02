package Dominio;

public class mapaActivo {

	private int id;
	private string nombre;
	private List<string> relaciones;
	private Date fechaGenerado;

	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param relaciones
	 * @param fechaGenerado
	 */
	public void constructor(int id, string nombre, List<String> relaciones, Date fechaGenerado) {
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
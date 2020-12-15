package Recreativa_Objetos;


public class Juego {
	
	private String nombre;
	private int record;
	private boolean multijugador;
	
	public Juego(String nombre) {
		this.nombre = nombre;
		this.record = 0;
		this.multijugador = false;
	}

	public Juego(String nombre, int record, boolean multijugador) {
		super();
		this.nombre = nombre;
		this.record = record;
		this.multijugador = multijugador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRecord() {
		return record;
	}

	public void setRecord(int record) {
		this.record = record;
	}

	public boolean isMultijugador() {
		return multijugador;
	}

	public void setMultijugador(boolean multijugador) {
		this.multijugador = multijugador;
	}

	@Override
	public String toString() {
		return "Juego [nombre=" + nombre + ", record=" + record + ", multijugador=" + multijugador + "]";
	}
	
}

package ar.unju.edu.fi.model;

public class Alumno {
	private Integer legajo;
	private String apellido;
	private String nombre;
	
	
	/**
	 * 
	 */
	public Alumno() {}


	/**
	 * @param legajo
	 * @param apellido
	 * @param nombre
	 */
	public Alumno(Integer legajo, String apellido, String nombre) {
		this.legajo = legajo;
		this.apellido = apellido;
		this.nombre = nombre;
	}


	public Integer getLegajo() {
		return legajo;
	}


	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "legajo= " + this.legajo + ", apellido= " + this.apellido + ", nombre= " + this.nombre;
	}
	
	
	
}

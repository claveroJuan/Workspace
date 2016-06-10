/**
 * 
 */
package cl.java.prueba_dos.jclavero;

/**
 * @author JuanClavero
 *
 */
public abstract class Estacion {

	private String nombre;
	private String linea;
	/*
	 * costructor
	 */
	public Estacion(){
		this.nombre = "la cisterna";
		this.linea = "amarilla";
	}
	
	/**
	 * @param nombre
	 * @param linea
	 */
	public Estacion(String nombre, String linea) {
		super();
		this.nombre = nombre;
		this.linea = linea;
	}

	public abstract boolean seDetieneTrenRutaRoja();
	public abstract boolean seDetieneTrenRutaVerde();

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the linea
	 */
	public String getLinea() {
		return linea;
	}

	/**
	 * @param linea the linea to set
	 */
	public void setLinea(String linea) {
		this.linea = linea;
	}
	
}

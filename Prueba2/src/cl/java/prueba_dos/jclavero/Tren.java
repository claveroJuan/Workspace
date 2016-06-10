/**
 * 
 */
package cl.java.prueba_dos.jclavero;

/**
 * @author JuanClavero
 *
 */
public abstract class Tren {

	private int numero;
	private String linea;
    private Estacion estacion;
	
	/**
	 * @param numero
	 * @param linea
	 */
	public Tren(int numero, String linea,Estacion estacion) {
		super();
		this.numero = numero;
		this.linea = linea;
		this.estacion=estacion;
	}

	public abstract boolean seDetiene(Estacion estacion);

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
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

	/**
	 * @return the estacion
	 */
	public Estacion getEstacion() {
		return estacion;
	}

	/**
	 * @param estacion the estacion to set
	 */
	public void setEstacion(Estacion estacion) {
		this.estacion = estacion;
	}
}

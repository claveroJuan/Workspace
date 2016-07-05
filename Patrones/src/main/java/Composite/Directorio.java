/**
 * 
 */
package Composite;

/**
 * @author JuanClavero
 *
 */
public abstract class  Directorio {

	private String nombre;
	
	public abstract int calcularPeso();

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
}

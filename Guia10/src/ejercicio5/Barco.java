/**
 * 
 */
package ejercicio5;

/**
 * @author JuanClavero
 *
 */
public class Barco implements Desplazable {

	/**
	 * @return the numeroEdicion
	 */
	public int getNumeroEdicion() {
		return numeroEdicion;
	}
	/**
	 * @param numeroEdicion the numeroEdicion to set
	 */
	public void setNumeroEdicion(int numeroEdicion) {
		this.numeroEdicion = numeroEdicion;
	}
	/**
	 * @return the editorial
	 */
	public String getEditorial() {
		return editorial;
	}
	/**
	 * @param editorial the editorial to set
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
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
	private int numeroEdicion;
	private String editorial;
	private String nombre;
	
	/**
	 * @param numeroEdicion
	 * @param editorial
	 * @param nombre
	 */
	public Barco(int numeroEdicion, String editorial, String nombre) {
		super();
		this.numeroEdicion = numeroEdicion;
		this.editorial = editorial;
		this.nombre = nombre;
	}
	public Barco(){
		
	}
	@Override
	public void desplazar(int km) {
		// TODO Auto-generated method stub
		System.out.println("mover barco "+km+" kilometros");
		
	}

}

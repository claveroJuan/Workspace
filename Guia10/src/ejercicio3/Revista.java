/**
 * 
 */
package ejercicio3;

/**
 * @author JuanClavero
 *
 */
public class Revista implements Imprimible{

	private int numeroEdicion;
	private String nombre;
	private String editorial;
	
	public Revista(){
		
	}

	
	/**
	 * @param numeroEdicion
	 * @param nombre
	 * @param editorial
	 */
	public Revista(int numeroEdicion, String nombre, String editorial) {
		super();
		this.numeroEdicion = numeroEdicion;
		this.nombre = nombre;
		this.editorial = editorial;
	}


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

	@Override
	public void imprimible() {
		// TODO Auto-generated method stub
		System.out.println("nombre :"+this.nombre+"\n"
                +"editorial :"+this.editorial+"\n"
                + "numero de edicion :"+this.numeroEdicion);
	}
	
}

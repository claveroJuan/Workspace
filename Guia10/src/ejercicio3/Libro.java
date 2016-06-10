/**
 * 
 */
package ejercicio3;

/**
 * @author JuanClavero
 *
 */
public class Libro implements Imprimible{

	private String nombre;
	private String editorial;
	
	public Libro(){
		
	}

	/**
	 * @param nombre
	 * @param editorial
	 */
	public Libro(String nombre, String editorial) {
		super();
		this.nombre = nombre;
		this.editorial = editorial;
	}

	@Override
	public void imprimible() {
		// TODO Auto-generated method stub
		System.out.println("nombre :"+this.nombre+"\n"
				                    +"editorial :"+this.editorial);
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
	
}

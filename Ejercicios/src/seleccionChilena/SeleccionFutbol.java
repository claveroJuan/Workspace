/**
 * 
 */
package seleccionChilena;

/**
 * @author JuanClavero
 *
 */
public abstract class SeleccionFutbol 
{
	private int id;
	private String nombre;
	private String apellidos;
	private int edad;
	
	public SeleccionFutbol()
	{
		
	}
	
	

	/**
	 * @param id
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 */
	public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}



	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * metodo viajar
	 */
	public void viajar()
	{
		System.out.println("viajar (padre)");
	}
	/**
	 * metodo concentrarce
	 */
	public void concentrarce()
	{
		System.out.println("concentrarce (padre)");
	}
	/**
	 * metodo la funcion de cada subclase en un partidoFutbol
	 */
	public void partidoFutbol()
	{
		System.out.println("asiste a un partido de futbol");
	}
	/**
	 * metodo abstracto diferente para cada subclase 
	 * y que no se implementa en la clase padre
	 */
	public abstract void entrenar();

}

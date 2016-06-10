package ejercicio2Compocicion;

public class Alumno
{

	private String nombre;
	private int edad;
	/**
	 * 
	 */
	public Alumno() {

	}
	/**
	 * @param nombre
	 * @param edad
	 */
	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
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
	
	public String toString()
	{
		 return  "\nNombre: "+getNombre()
				 +"\nEdad: "+getEdad();
	}
	
}

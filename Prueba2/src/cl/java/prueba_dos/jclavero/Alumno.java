/**
 * 
 */
package cl.java.prueba_dos.jclavero;

/**
 * @author JuanClavero
 *
 */
public class Alumno implements Imprimible {

	private String nombre;
	private double promedio;
	/**
	 * costructor por defecto
	 */
	public Alumno(){
		this.nombre = "juan";
		this.promedio = 5.5;
	}
	/**
	 * @param nombre
	 * @param promedio
	 */
	public Alumno(String nombre, double promedio) {
		super();
		this.nombre = nombre;
		this.promedio = promedio;
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
	 * @return the promedio
	 */
	public double getPromedio() {
		return promedio;
	}
	/**
	 * @param promedio the promedio to set
	 */
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
	
			System.out.println(this.nombre+""+this.promedio);
		
		
	}
	
}

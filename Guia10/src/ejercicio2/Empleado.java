/**
 * 
 */
package ejercicio2;

/**
 * @author JuanClavero
 *
 */
public abstract class Empleado {

	private String nombre;
	private int horasTrabajadas;
	
	public Empleado (){
		
	}

	/**
	 * @param nombre
	 * @param horasTrabajadas
	 */
	public Empleado(String nombre, int horasTrabajadas) {
		super();
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
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
	 * @return the horasTrabajadas
	 */
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	/**
	 * @param horasTrabajadas the horasTrabajadas to set
	 */
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	public abstract int calcularSalario();
}

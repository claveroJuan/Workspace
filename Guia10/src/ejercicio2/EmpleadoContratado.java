/**
 * 
 */
package ejercicio2;

/**
 * @author JuanClavero
 *
 */
public class EmpleadoContratado extends Empleado{

	@Override
	public int calcularSalario() {
		// TODO Auto-generated method stub
		return (this.getHorasTrabajadas()*20000);
	}

	/**
	 * 
	 */
	public EmpleadoContratado() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param horasTrabajadas
	 */
	public EmpleadoContratado(String nombre, int horasTrabajadas) {
		super(nombre, horasTrabajadas);
		// TODO Auto-generated constructor stub
	}

}

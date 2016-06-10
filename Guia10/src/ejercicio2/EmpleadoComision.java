/**
 * 
 */
package ejercicio2;

/**
 * @author JuanClavero
 *
 */
public class EmpleadoComision extends Empleado {

	private int cantVentas;
	private int sueldoBase;
	
	public EmpleadoComision(){
		
	}
	/**
	 * @param nombre
	 * @param horasTrabajadas
	 */
	public EmpleadoComision(String nombre, int horasTrabajadas, int cantVentas, int sueldoBase) {
		super(nombre, horasTrabajadas);
		this.cantVentas=cantVentas;
		this.sueldoBase=sueldoBase;
		// TODO Auto-generated constructor stub
	}

	

	/**
	 * @return the cantVentas
	 */
	public int getCantVentas() {
		return cantVentas;
	}

	/**
	 * @param cantVentas the cantVentas to set
	 */
	public void setCantVentas(int cantVentas) {
		this.cantVentas = cantVentas;
	}

	/**
	 * @return the sueldoBase
	 */
	public int getSueldoBase() {
		return sueldoBase;
	}

	/**
	 * @param sueldoBase the sueldoBase to set
	 */
	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	@Override
	public int calcularSalario() {
		// TODO Auto-generated method stub
		return this.sueldoBase=this.cantVentas*9000;
	}
	
}

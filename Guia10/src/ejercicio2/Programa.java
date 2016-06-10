/**
 * 
 */
package ejercicio2;

/**
 * @author JuanClavero
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpleadoComision eComision = new EmpleadoComision("juan", 180, 30, 240000);
		EmpleadoContratado eContratado=new EmpleadoContratado("juanin",40);
		System.out.println("salario empleado comision :" +eComision.calcularSalario()
		                       +"salario empleado contratado :" + eContratado.calcularSalario());

	}

}
/*
 * •	Salario de un empleado contratado es igual a las horas trabajadas por $20.000 
 */
//•	Salario de un empleado por comisiones es igual al salario base mas cantidad de ventas por $9000.

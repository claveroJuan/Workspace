package sueldo;

public class ProgramaEmpleado 
{

	public static void main (String []args)
	{
		Empleado empleado = new Empleado ("juan clavero", "21424472-1", 250000, 80000, 12);
		System.out.println(empleado.getNombre());
		System.out.println(empleado.getRut());
		System.out.println(empleado.getHorasExtraRealizadas());
		System.out.println(empleado.getPagoHoraExtra());
		System.out.println(empleado.getSueldoBase());
		System.out.println(empleado.sueldoBruto());
		System.out.println(empleado.sueldoLiquido(empleado.sueldoBruto()));
		
	}
}

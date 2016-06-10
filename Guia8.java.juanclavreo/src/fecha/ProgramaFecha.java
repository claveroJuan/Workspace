package fecha;

public class ProgramaFecha {

	public static void main(String[] args)
	{
		Fecha fecha = new Fecha ();
		Fecha fecha2= new Fecha (28,5,1994);
		fecha.imprimirFecha();
		fecha.imprimirFechaFormato();
		fecha2.imprimirFecha();
		fecha2.imprimirFechaFormato();
		System.out.println(fecha.validarDia());
		System.out.println(fecha.toString());
		System.out.println(fecha2.validarMes());
		System.out.println(fecha2.toString());

	}

}

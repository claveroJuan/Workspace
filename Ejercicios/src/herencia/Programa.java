package herencia;

public class Programa {

	public static void main(String[] args)
	{
	String[] cursos= {"java","JEE"};
	Profesor profe = new Profesor("1-9","juan","clavero","oliveira",cursos);

	int[] notas = {70,40};
	Alumno alumno1= new Alumno ("21","juan"," "," ",notas);
	
	profe.irClasesAlumn();
	alumno1.irClasesAlumn();
	}

}

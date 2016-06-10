package ejercicio2Compocicion;

public class Programa
{


	public static void main(String[] args)
	{
		Alumno alum = new Alumno("juan clavero", 24);
		Alumno alum1 = new Alumno("pedro franco", 15);
		Alumno alum2 = new Alumno("rata tuile", 32);
		Alumno[] alumnosJava = new Alumno[]{alum, alum1, alum2};
		
		Asignatura progJava = new Asignatura("rata: ","juan clavero", alumnosJava);
		
		System.out.println(progJava.toString()); 
	}
}

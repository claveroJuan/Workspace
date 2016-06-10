package Arrays;


public class Promedio {

public static void main (String []args)
	{
		Promedio prom = new Promedio();
		int p= prom.promedio(30, 40, 60);
		System.out.println(p);
	}
	public int promedio (int nota1, int nota2 , int nota3)
	{
		
		int promedio=(nota1+nota2+nota3)/3;
		return promedio;
		
	}

}

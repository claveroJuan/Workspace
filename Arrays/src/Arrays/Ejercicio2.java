package Arrays;

import java.util.Scanner;

public class Ejercicio2 
{
	public static void main (String [] args)
	{	
		int edad =0;
		int promedio=0;
		int montoBeca;
		
		System.out.println("ingrese edad");
		Scanner leer = new Scanner(System.in);
		edad = leer.nextInt();
		System.out.println("ingrese promedio");
		Scanner leer1 = new Scanner(System.in);
		promedio = leer1.nextInt();
		
if (edad>18)
{
				if (promedio>=65)
				{
					montoBeca=2000000;
					System.out.println(" monto beca asignada :" + montoBeca);
				}
				if (promedio>=60 && promedio<65)
				{
					montoBeca=1000000;
					System.out.println(" monto beca asignada :" + montoBeca);
				}
				if (promedio>=55 && promedio<60)
				{
					montoBeca=500000;
					System.out.println(" monto beca asignada :" + montoBeca);
				}
                if (promedio<55)
                {
	            System.out.println("mejora tu promedio para acceder a las becas en otra oportunidad");
                }
}
 if (edad<=18)
 {
	            if ( promedio>=65)
	            {
		        montoBeca=300000;
		    	System.out.println(" monto beca asignada :" + montoBeca);
	            } 
	            if (promedio>=60 && promedio<65)
	            {
		        montoBeca=200000;
		    	System.out.println(" monto beca asignada :" + montoBeca);
		        if (promedio>=55 && promedio<60)
		       {
			    montoBeca=100000;
				System.out.println(" monto beca asignada :" + montoBeca);
		        }
                if (promedio<55)
		        {
	            System.out.println("mejora tu promedio para acceder a las becas en otra oportunidad");	
		        }
                }
}
}
}
	
	 

	



package Arrays;

import java.util.Scanner;

public class ejercicio4 {
	public static void main (String [] args)
	{
		int anterior=0;
		int siguiente=1;
		int contador=1;
		int numero =0;
		int suma = 0;
		System.out.println("ingrese la cantidad de elementos de la sucecion");
		Scanner leer = new Scanner (System.in);
		numero=leer.nextInt();
		numero=numero-2;
		System.out.println(anterior);
		System.out.println(siguiente);
		do 
		{
			suma=anterior+siguiente;
			anterior=siguiente;
			siguiente=suma;
					contador++;
					System.out.println(suma);
		}while (contador<=numero);
		
		
		
	}

}

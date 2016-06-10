package Arrays;

import java.util.Scanner;

public class ejercicio3 {
	public static void main (String []args){
		int opcion;
		int n;
		System.out.println("================");
		System.out.println("1.lunes");
		System.out.println("2.martes");
		System.out.println("3.miercoles");
		System.out.println("4.jueves");
		System.out.println("5.viernes");
		System.out.println("6.sabado");
		System.out.println("7.domingo");
		System.out.println("8.salir");
		
		System.out.println("================");

do{
		System.out.println("ingrese un opcion");
		Scanner leer= new Scanner (System.in);
		opcion=leer.nextInt();
		switch (opcion)
		{
		case 1: System.out.println("lunes"); break;
		case 2: System.out.println("martes");break;
		case 3: System.out.println("miercoles");break;
		case 4: System.out.println("jueves");break;
		case 5: System.out.println("viernes");break;
		case 6: System.out.println("sabado");break;
		case 7: System.out.println("domingo");break;
		case 8: System.out.println("hasta luego");
		default : 
		
		}
		n=opcion;
		
  }while (n!=8);
	}


}

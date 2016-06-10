package Arrays;

import java.util.Scanner;

public class ejercicio5 {
public static void main (String [] args)
{
	int largo;
	int valor;
	int suma;
	
	System.out.println("ingrese largo del arreglo");
	Scanner leer = new Scanner (System.in);
	System.out.println(leer);
	largo=leer.nextInt();
	int sumaAB[] = {largo};
	int A[] = {largo};
	int B[] = {largo};
	for (int i=0;i<=largo;i++)
	{
		System.out.println("ingrese numeros de arreglo A");
		Scanner leer1 = new Scanner (System.in);
		valor=leer1.nextInt();
		A[i]=valor;
	}
	for (int i=0;i<=largo;i++)
	{
		System.out.println("ingrese numeros de arreglo B");
		Scanner leer2 = new Scanner (System.in);
		valor=leer2.nextInt();
		B[i]=valor;
	}
	for (int i=0;i<=largo;i++)
	{
		suma=A[i]+B[i];
		sumaAB[i]=suma;
		System.out.println(sumaAB[i]);
	}
}
}

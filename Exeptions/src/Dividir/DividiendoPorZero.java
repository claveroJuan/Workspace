/**
 * 
 */
package Dividir;

import java.util.Scanner;

/**
 * @author JuanClavero
 *
 */
public class DividiendoPorZero {

	public static int division(int n1, int n2) throws ArithmeticException{
		return n1/n2;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=true;

		Scanner sc = new Scanner(System.in);
		do{
		try{
		System.out.println("ingrese numerador :");
		int numero1=sc.nextInt();
		System.out.println("ingrese denominador :");
		int numero2=sc.nextInt();
		int resultado = division(numero1, numero2);
		System.out.printf("\nResultado : %d / %d = %d\n",numero1,numero2,resultado);
		}catch(ArithmeticException e){
			System.out.println("0 no es un numero valido intente de nuevo");
		}
	}while (flag);
	}
}

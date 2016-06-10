/**
 * 
 */
package ejercicio6;

import java.util.Scanner;

/**
 * @author JuanClavero
 *
 */
public class ProgramaLibro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		String isbn;
		// obtener isbn
		System.out.println("ingresar isbn");
		isbn = sc.nextLine();
		sc.close();
		 //remover simbolos y remplazarlos por caracteres vacios
	
		isbn = isbn.replace(" ","").replace("-", " ");
		//isbn=isbn.replace("( |-)","");
		//chekear largo del codigo
	
		boolean validar=false;
		if (isbn.length()==10)
		{
			validar=validarISBN10(isbn);
		}else if (isbn.length()==13)
		{
			validar=validarISBN13(isbn);
		}
		else
		{
			validar=false;
		}
		//imprimir estado
		if (validar)
		{
			System.out.println(isbn+"ISBN valido");
			
		}
		else 
		{
			System.out.println(isbn + "ISBN no valido");
		}
	}

	//crear metodosde validacion
	private static boolean validarISBN10(String isbn)
	{
		int sum = 0;
		String dString10;
		for (int d =0;d<10;d++)
		{
			dString10=isbn.substring(d,d+1);
			if (d<9|| dString10!= "X")
			{
				sum+=Integer.parseInt(dString10)*(10-d);
			}
			else
			{
				sum+=10;
			}
		}
		return (sum%11==0);
	}
	private static boolean validarISBN13(String isbn)
	{
		int sum =0;
		int dString13;
		for (int d=0;d<13;d++)
		{
		dString13 = Integer.parseInt(isbn.substring(d,d+1));
			if(d%2==0)//si d es par
			{
			sum+=dString13*1;	
			}
			else 
			{
				sum+=dString13*3;
			}
		}
		
		return (sum%10==0);
	}
}

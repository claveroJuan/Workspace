/**
 * 
 */
package dividiendo;

import javax.swing.JOptionPane;

/**
 * @author JuanClavero
 *
 */
public class Programa {

	public static void main (String []args)
	{
		int dividendo = obtenerNumero("dividendo");
		int divisor = obtenerNumero("divisor");
		Division division = new Division (divisor, divisor);
		
		try{
			division.hacerDivision();
		}catch(ArithmeticException e){
			e.getMessage();
			JOptionPane.showMessageDialog(null, "Error no se puede dividir el 0","",JOptionPane.ERROR_MESSAGE);
		}
		
		
		
	}
	public static int obtenerNumero (String campo)
	{
		int numero =0;
		boolean flag=false;
		do
		{
		try {
			String div =JOptionPane.showInputDialog("ingrese numero");
			int dividendo=Integer.parseInt(div);
			flag=!flag;
			}
	catch (NumberFormatException e)
	{
		e.getMessage();
		JOptionPane.showMessageDialog(null, "Error solo se aceptan numeros","",JOptionPane.ERROR_MESSAGE);
	}
			
		}while(!flag);
		return numero;
	}
}

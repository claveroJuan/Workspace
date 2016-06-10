package ejercicio5;

import javax.swing.JOptionPane;

public class Pinturas 
{

	public static void main (String[]args)
	{
		double iva=0;
		String producto=JOptionPane.showInputDialog("valor del producto");
		double valor=Integer.parseInt(producto);
	    iva =(int) (valor*0.15);
		double precioFinal= (valor-(valor*0.30)+iva);
		JOptionPane.showMessageDialog(null, "valor total :" +precioFinal);
		
//	    int m2=2500;
//		int precio;
//		String metros=JOptionPane.showInputDialog("ingrese m2 a pintar");
//		int m=Integer.parseInt(metros);
//		precio=m*m2;
//		JOptionPane.showMessageDialog(null, "valor total :" +precio);
		
	}
}

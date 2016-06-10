

package ejerclases2;

//import javax.swing.JOptionPane;

public class ProgramaCal
{


	
	public static void main (String [] args)
	{
	  
		/*String pedir =JOptionPane.showInputDialog("ingrese numero 1;");
		int n1=Integer.parseInt(pedir);
		String pedir1 =JOptionPane.showInputDialog("ingrese numero 2;");
		int n2=Integer.parseInt(pedir1);*/
		
		Calculadora objeto1= new Calculadora(45, 66);
		/*el set al pertenecer 
		a la clase calculadora conoce todos sus 
		atributos por ende puede modificar a traves 
		de mensajes(set)*/
		objeto1.setNumero1(50);
		objeto1.setNumero2(50);
		
		int suma =objeto1.sumar();
		int resta=objeto1.restar();
		int multiplicar=objeto1.multiplicar();
		int dividir=objeto1.dividir();
		//objeto1.imprimir();
		
		
		
		
		System.out.println("suma :" + suma+"\n"
				            + "resta :"+ resta+"\n"
				            +"multiplicacion :"+ multiplicar+ "\n"
				            +"dividir :"+dividir+ "\n");

	
	}

}
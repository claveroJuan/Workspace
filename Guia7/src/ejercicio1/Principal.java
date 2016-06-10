
package ejercicio1;

import javax.swing.JOptionPane;

public class Principal
{
	
	public static void main(String[] args)
	{
boolean opcSalir = false;
		CuentaBancaria cuenta1 = new CuentaBancaria();
		
		do {
			String opc = JOptionPane.showInputDialog(
			 "Opc 1 abonar \n" 
			+"Opc 2 retirar \n" 
			+"Opc 3 imprimir \n"
			+"Opc 4 salir ");
			switch (opc) {
			case "1": {
				String saldo = JOptionPane.showInputDialog("ingrese monto a abonar");
				int monto = Integer.parseInt(saldo);
				cuenta1.abonar(monto);
				
				break;
			}
			case "2": {
				String saldo = JOptionPane.showInputDialog("ingrese monto a retirar");
				int monto = Integer.parseInt(saldo);
				cuenta1.retirar(monto);
                
				break;
			}

			case "3": {
				cuenta1.imprimir();
				break;
			}
			case "4": {
				opcSalir = !opcSalir;
				break;
			}
			default:

			}
		} while (!opcSalir);
	}


}
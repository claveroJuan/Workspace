/**
 * 
 */
/**
 * @author JuanClavero
 *
 */
package ejercicio2;
import javax.swing.JOptionPane;



public class Principal
{
	
	public static void main(String[] args)
	{
        boolean opcSalir = false;
		Cafetera cafe1 = new Cafetera();
		
		do {
			String opc = JOptionPane.showInputDialog(
			 "Opc 1 llenar cafetera \n" 
			+"Opc 2 servir tasa \n" 
			+"Opc 3 vaciar cafetera \n"
			+"Opc 4 agregar cafe \n"
			+"Opc 5 imprimir \n"
			+"Opc 6 salir ");
			switch (opc) {
			case "1": {
				
				cafe1.llenarCafetera();
				break;
			}
			case "2": {
				String ml = JOptionPane.showInputDialog("ingrese antidad a servir");
				int cc = Integer.parseInt(ml);
				cafe1.servirTasa(cc);
			
                
				break;
			}

			case "3": {
				cafe1.vaciarCafetera();
				break;
			}
            case "4": {
            	String gramos = JOptionPane.showInputDialog("ingrese cantidad de cafe");
				int gr = Integer.parseInt(gramos);
				cafe1.agregarCAfe(gr);
				break;
			}
            case "5":
            {
            	cafe1.imprimir();
            	break;
            }
			case "6": {
				opcSalir = !opcSalir;
				break;
			}
			default:

			}
		} while (!opcSalir);
	}


}
/**
 * 
 */
package ejercicio4;

import javax.swing.JOptionPane;

/**
 * @author JuanClavero
 *
 */
public interface Validable {

	
		public static void main(){
			Isbn isb=new Isbn();
			String cod=(JOptionPane.showInputDialog("ingrese numero"));
			isb.setNumero(Integer.parseInt(cod));
			System.out.println(isb.validar());
			
		}

		boolean validar();
		
	

}
/*
 * •	El método validar, debe comprobar si un rut es correcto, al igual que un isbn, según su calculo correspondiente.
 */
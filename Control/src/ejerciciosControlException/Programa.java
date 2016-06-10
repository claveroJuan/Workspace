/**
 * 
 */
package ejerciciosControlException;

import javax.swing.JOptionPane;

/**
 * @author JuanClavero
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Auto auto = new Auto("toyota","chino",1994,0);
		try {
			auto.venderAuto();
		} catch (SinStockException e) {
			e.getMessage();
			JOptionPane.showMessageDialog(null, "No es posible vender auto. No hay stock","",JOptionPane.ERROR_MESSAGE);
		}
	}

}

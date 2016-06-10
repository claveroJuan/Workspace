/**
 * 
 */
package ejercio5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * @author JuanClavero
 *
 */
public class CapturandoNullPointer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String a = JOptionPane.showInputDialog("test");
//		Integer.parseInt(a.trim()); // trim elimina espacios en blanco de un string
		
		int numero = 0;
		boolean flag = false;
		JFrame ventana = new JFrame("ejercicio5");
		ventana.setLayout(null);
		JTextField campo = new JTextField();
		JButton botton = new JButton("aceptar");
		botton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String pedir = campo.getText();
				try {
					int numero = Integer.parseInt(pedir);
				} catch (NumberFormatException n) {
					System.out.println(n.getMessage());
				} catch (NullPointerException z) {
					System.out.println(z.getMessage());
				}
			}
		});
		ventana.getContentPane().add(botton);
		ventana.getContentPane().add(campo);

		botton.setBounds(10, 40, 20, 20);
		campo.setBounds(10, 10, 20,20);
		ventana.setSize(400, 400);
		ventana.setVisible(true);

	}

}

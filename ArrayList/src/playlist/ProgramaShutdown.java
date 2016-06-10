/**
 * 
 */
package playlist;

import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * @author JuanClavero
 *
 */
public class ProgramaShutdown {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		Ventana ventana = new Ventana();
		ventana.setVisible(true);
		Runtime.getRuntime().exec("shutdown -s -t 4").waitFor();
	}

}

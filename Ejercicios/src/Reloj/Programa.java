/**
 * 
 */
package Reloj;

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

		
		
		Reloj reloj = new Reloj(0,0,0);
		reloj.setEstaEncendido(true);
		Timer timer=new Timer(reloj);
		ApagarReloj a=new ApagarReloj(reloj,5000);
		a.start();
		timer.run();
	
		
	}

}

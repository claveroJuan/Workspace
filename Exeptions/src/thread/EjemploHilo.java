/**
 * 
 */
package thread;

/**
 * @author JuanClavero
 *
 */
public class EjemploHilo extends Thread {

public void run() {
	// TODO Auto-generated method stub
	try{
	sleep(1000);
	}
	catch(InterruptedException e){
		
	}System.out.println("el nombre de thread es :"+ getName());
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EjemploHilo thread = new EjemploHilo();
		thread.start();
		System.out.println("metodo main; el nombre del thread es :"+Thread.currentThread().getName());
		
	}

}

/**
 * 
 */
package Reloj;

/**
 * @author JuanClavero
 *
 */
public class Timer extends Thread {
	@Override
	public void run() {

		while (this.reloj1.isEstaEncendido()) {
			this.getReloj1().imprimir();
			this.getReloj1().avanzarSeg();

			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private Reloj reloj1 ;

	public void avanzarReloj() {

	}

	public Timer(Reloj reloj) {
		this.reloj1 = reloj;
	}

	/**
	 * @return the reloj1
	 */
	public Reloj getReloj1() {
		return reloj1;
	}

	/**
	 * @param reloj1
	 *            the reloj1 to set
	 */
	public void setReloj1(Reloj reloj1) {
		this.reloj1 = reloj1;
	}

}

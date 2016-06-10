/**
 * 
 */
package Reloj;

/**
 * @author JuanClavero
 *
 */
public class ApagarReloj extends Thread {

	private Reloj reloj1 = new Reloj();
	private long milisegundos;

	public void run() {
		try {
			sleep(this.milisegundos);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.getReloj1().setEstaEncendido(false);
	}

	public ApagarReloj() {

	}

	public ApagarReloj(Reloj reloj, long milisegundos) {

		this.reloj1 = reloj;
		this.milisegundos = milisegundos;
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

	/**
	 * @return the milisegundos
	 */
	public long getMilisegundos() {
		return milisegundos;
	}

	/**
	 * @param milisegundos
	 *            the milisegundos to set
	 */
	public void setMilisegundos(long milisegundos) {
		this.milisegundos = milisegundos;
	}

}

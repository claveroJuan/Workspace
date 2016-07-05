/**
 * 
 */
package Decorador;

/**
 * @author JuanClavero
 *
 */
public class PistolaDecorador implements Arma {

	private Arma arma;
	public PistolaDecorador() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param arma
	 */
	public PistolaDecorador(Arma arma) {
		super();
		this.arma = arma;
	}
	public void disparar() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return the arma
	 */
	public Arma getArma() {
		return arma;
	}

	/**
	 * @param arma the arma to set
	 */
	public void setArma(Arma arma) {
		this.arma = arma;
	}
}

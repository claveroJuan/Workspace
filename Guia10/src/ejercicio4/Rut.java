/**
 * 
 */
package ejercicio4;

/**
 * @author JuanClavero
 *
 */
public class Rut implements Validable {

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the digitoVerificador
	 */
	public String getDigitoVerificador() {
		return digitoVerificador;
	}

	/**
	 * @param digitoVerificador the digitoVerificador to set
	 */
	public void setDigitoVerificador(String digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

	private int numero;
	private String digitoVerificador;
	public Rut(){
		
	}
	
	/**
	 * @param numero
	 * @param digitoVerificador
	 */
	public Rut(int numero, String digitoVerificador) {
		super();
		this.numero = numero;
		this.digitoVerificador = digitoVerificador;
	}

	@Override
	public boolean validar() {
		// TODO Auto-generated method stub
		
		return false;
	}

	
}

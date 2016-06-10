/**
 * 
 */
package ejercicio1;

/**
 * @author JuanClavero
 *
 */
public class CuentaBancaria {

	private int saldo;
	private int numeroCuenta;
	public CuentaBancaria(){
		
	}
	public void depositarDinero(int monto)
	{
		this.saldo+=monto;
	}
	public void retirarDinero(int monto)
	{
		this.saldo-=monto;
	}
	/**
	 * @param saldo
	 * @param numeroCuenta
	 */
	public CuentaBancaria(int saldo, int numeroCuenta) {
		super();
		this.saldo = saldo;
		this.numeroCuenta = numeroCuenta;
	}
	/**
	 * @return the saldo
	 */
	public int getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	/**
	 * @return the numeroCuenta
	 */
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	/**
	 * @param numeroCuenta the numeroCuenta to set
	 */
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
}

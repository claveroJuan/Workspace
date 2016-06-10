/**
 * 
 */
package ejercicio1;

/**
 * @author JuanClavero
 *
 */
public class RetirarDineroThread extends Thread {

	CuentaBancaria cuentaBancaria;

	 public RetirarDineroThread(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated constructor stub
		 this.cuentaBancaria=cuentaBancaria;
	}
	@Override
	public void run() {
		cuentaBancaria.retirarDinero(5000);
	}
}

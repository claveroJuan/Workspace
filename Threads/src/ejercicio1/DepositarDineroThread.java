/**
 * 
 */
package ejercicio1;

/**
 * @author JuanClavero
 *
 */
public class DepositarDineroThread extends Thread {

	CuentaBancaria cuentaBancaria;
	public DepositarDineroThread(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated constructor stub
		this.cuentaBancaria=cuentaBancaria;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		cuentaBancaria.depositarDinero(10000);
	}
}

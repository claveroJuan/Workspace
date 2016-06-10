/**
 * 
 */
package ejercicio1;

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

		CuentaBancaria cuentaBancaria=new CuentaBancaria(0,33523425);
		RetirarDineroThread threadR1 = new RetirarDineroThread(cuentaBancaria);
		RetirarDineroThread threadR2 = new RetirarDineroThread(cuentaBancaria);
		RetirarDineroThread threadR3 = new RetirarDineroThread(cuentaBancaria);
		DepositarDineroThread threadD1 = new DepositarDineroThread(cuentaBancaria);
		DepositarDineroThread threadD2 = new DepositarDineroThread(cuentaBancaria);
		DepositarDineroThread threadD3 = new DepositarDineroThread(cuentaBancaria);
		threadR1.start();
		threadD1.start();
		
	}

}

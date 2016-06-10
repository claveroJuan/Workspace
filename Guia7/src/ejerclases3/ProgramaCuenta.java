/**
 * 
 */
/**
 * @author JuanClavero
 *
 */
package ejerclases3;

public class ProgramaCuenta
{
	public static void main (String [] args)
	{
		
		CuentaVista cuenta1= new CuentaVista ();
		cuenta1.setSaldo(1000);
		cuenta1.setGiroMaximo(5000);
		
		cuenta1.depositar(3000);
		cuenta1.girar(2000);
		
	}
	
	
	
	
}
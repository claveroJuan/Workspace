/**
 * 
 */
package ejercicio2;


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

		Usuario usuario=new Usuario();
		try {
			usuario.login("jddddd","djdj");
		} catch (AutenticacionException e) {
		System.out.println(e.getMessage());
		} catch (CuentaBloqueadaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

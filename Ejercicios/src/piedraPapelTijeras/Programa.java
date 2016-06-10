/**
 * 
 */
package piedraPapelTijeras;

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

		Piedra piedra = new Piedra ();
		Papel papel = new Papel();
		Tijera tijera= new Tijera ();
		 piedra.jugar(piedra);
		 piedra.jugar(papel);
		 piedra.jugar(tijera);
	
		
		
		
	

	}

}

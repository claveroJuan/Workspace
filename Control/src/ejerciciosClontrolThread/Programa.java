/**
 * 
 */
package ejerciciosClontrolThread;

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

		Libro libro = new Libro(10, 5);
		ReservaLibroThread threadReservar1 = new ReservaLibroThread(libro);
		ReservaLibroThread threadReservar2 = new ReservaLibroThread(libro);
		ReservaLibroThread threadReservar3 = new ReservaLibroThread(libro);
		DevolverLibroThread threadDevolver1 = new DevolverLibroThread(libro);
		DevolverLibroThread threadDevolver2 = new DevolverLibroThread(libro);
		DevolverLibroThread threadDevolver3 = new DevolverLibroThread(libro);
	
		threadReservar1.start();
		threadReservar2.start();
		threadReservar3.start();
		threadDevolver1.start();
		threadDevolver2.start();
		threadDevolver3.start();
	
		
	}

}

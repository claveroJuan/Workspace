/**
 * 
 */
package ejerciciosClontrolThread;

/**
 * @author JuanClavero
 *
 */
public class ReservaLibroThread extends Thread {

	Libro libro;

	public ReservaLibroThread(Libro libro){
		this.libro=libro;
	}
	@Override
	public void run() {
		libro.reservarLibro();
	}

	
}

/**
 * 
 */
package ejerciciosClontrolThread;

/**
 * @author JuanClavero
 *
 */
public class DevolverLibroThread extends Thread {
	Libro libro;
	 public DevolverLibroThread(Libro libro) {
		this.libro=libro;
	}
@Override
public void run() {
	libro.devolverLibro();
}
}

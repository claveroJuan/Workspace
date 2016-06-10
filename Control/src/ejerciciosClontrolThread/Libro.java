/**
 * 
 */
package ejerciciosClontrolThread;

/**
 * @author JuanClavero
 *
 */
public class Libro {

	private String nomber;
	private String editorial;
	private int cantidadLibros;
	private int cantidadLibrosPrestados;

	public Libro() {

	}

	public Libro(int cantidadLibros, int cantidadLibrosPrestados) {
		this.cantidadLibros = cantidadLibros;
		this.cantidadLibrosPrestados = cantidadLibrosPrestados;
	}

	public synchronized void reservarLibro() {
		if (this.cantidadLibros > this.cantidadLibrosPrestados) {
			this.cantidadLibrosPrestados++;

		} else {
			System.out.println("error");
		}

	}

	public synchronized void devolverLibro() {

		if (this.cantidadLibrosPrestados >= 0) {
			this.cantidadLibrosPrestados--;

		} else {
			System.out.println("error");
		}
	}

	/**
	 * @return the nomber
	 */
	public String getNomber() {
		return nomber;
	}

	/**
	 * @param nomber
	 *            the nomber to set
	 */
	public void setNomber(String nomber) {
		this.nomber = nomber;
	}

	/**
	 * @return the editorial
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * @param editorial
	 *            the editorial to set
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * @return the cantidadLibros
	 */
	public int getCantidadLibros() {
		return cantidadLibros;
	}

	/**
	 * @param cantidadLibros
	 *            the cantidadLibros to set
	 */
	public void setCantidadLibros(int cantidadLibros) {
		this.cantidadLibros = cantidadLibros;
	}

	/**
	 * @return the cantidadLibrosPrestados
	 */
	public int getCantidadLibrosPrestados() {
		return cantidadLibrosPrestados;
	}

	/**
	 * @param cantidadLibrosPrestados
	 *            the cantidadLibrosPrestados to set
	 */
	public void setCantidadLibrosPrestados(int cantidadLibrosPrestados) {
		this.cantidadLibrosPrestados = cantidadLibrosPrestados;
	}

	/**
	 * @param nomber
	 * @param editorial
	 * @param cantidadLibros
	 * @param cantidadLibrosPrestados
	 */
	public Libro(String nomber, String editorial, int cantidadLibros, int cantidadLibrosPrestados) {
		super();
		this.nomber = nomber;
		this.editorial = editorial;
		this.cantidadLibros = cantidadLibros;
		this.cantidadLibrosPrestados = cantidadLibrosPrestados;
	}

}

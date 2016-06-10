/**
 * 
 */
package ejercicio5;


/**
 * @author JuanClavero
 *
 */
public class Disco 
{
	private String nombreDisco;
	private String nombreAutor;
	private String genero;
	private String canciones[]={"cancion1","cancion2","cancion3","cancion4","cancion5","cancion6"}; 

	public Disco ()
	{
		this.nombreDisco="jazz magnetism";
		this.nombreAutor="kase.O";
		this.genero="hip-hop";
	}
	public void imprimir ()
	{
		System.out.println(this.nombreDisco);
		System.out.println(this.nombreAutor);
		System.out.println(this.genero);						
		System.out.println(canciones[0]);
		System.out.println(canciones[1]);
		System.out.println(canciones[2]);
		System.out.println(canciones[3]);
		System.out.println(canciones[4]);
		System.out.println(canciones[5]);

	}

	
	/**
	 * @return the nombreDisco
	 */
	public String getNombreDisco() {
		return nombreDisco;
	}

	/**
	 * @param nombreDisco the nombreDisco to set
	 */
	public void setNombreDisco(String nombreDisco) {
		this.nombreDisco = nombreDisco;
	}

	/**
	 * @return the nombreAutor
	 */
	public String getNombreAutor() {
		return nombreAutor;
	}

	/**
	 * @param nombreAutor the nombreAutor to set
	 */
	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return the canciones
	 */
	public String[] getCanciones() {
		return canciones;
	}

	/**
	 * @param canciones the canciones to set
	 */
	public void setCanciones(String[] canciones) {
		this.canciones = canciones;
	}
}

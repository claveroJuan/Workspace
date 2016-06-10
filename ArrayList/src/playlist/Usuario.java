/**
 * 
 */
package playlist;

import java.util.ArrayList;

/**
 * @author JuanClavero
 *
 */
public class Usuario {
	private String nombre;
	private ArrayList<PlayList>playList;

	public Usuario() 
	{
		
	}

	/**
	 * @param nombre
	 * @param canciones
	 */
	public Usuario(String nombre, ArrayList<PlayList> canciones) {
		super();
		this.nombre = nombre;
		this.playList = canciones;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the canciones
	 */
	public ArrayList<PlayList> getCanciones() {
		return playList;
	}

	/**
	 * @param canciones
	 *            the canciones to set
	 */
	public void setCanciones(ArrayList<PlayList> canciones) {
		this.playList = canciones;
	}

}

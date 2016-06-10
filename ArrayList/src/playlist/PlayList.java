/**
 * 
 */
package playlist;

import java.util.ArrayList;

/**
 * @author JuanClavero
 *
 */
public class PlayList  {
	private String nombre;
	private ArrayList<Usuario> usuarios;
	private ArrayList<Cancion> canciones;

	public PlayList() {
	}

	public void agregarCancion(Cancion cancion) {
		canciones.add(cancion);
	}

	public void borrarCancion(Cancion cancion) {
		canciones.remove(cancion);
	}

	public int duracionMinutos(Cancion canciones) {
		int suma = 0;
		for (int i = 0; i < this.canciones.size(); i++) {

			suma = suma + this.canciones.get(i).getDuracion();
		}
		return suma;
	}

	public void imprimir() {
		for (int i = 0; i < this.canciones.size(); i++) {
			System.out.println(canciones.get(i));
		}
	}

	public void ordenarCanciones(){
		
		for (int i = 0; i < this.canciones.size(); i++) {
			
		}
	}
	/**
	 * @param nombre
	 * @param usuarios
	 * @param canciones
	 */
	public PlayList(String nombre, ArrayList<Usuario> usuarios, ArrayList<Cancion> canciones) {
		super();
		this.nombre = nombre;
		this.usuarios = usuarios;
		this.canciones = canciones;
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
	 * @return the usuarios
	 */
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	/**
	 * @param usuarios
	 *            the usuarios to set
	 */
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	/**
	 * @return the canciones
	 */
	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}

	/**
	 * @param canciones
	 *            the canciones to set
	 */
	public void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}

	// @Override
	// public int compareTo(T o) {
	// // TODO Auto-generated method stub
	// return 0;
	// }

}

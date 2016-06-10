/**
 * 
 */
package playlist;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author JuanClavero
 *
 */
public class Cancion  {
	private String nombre;
	private String artista;
	private int duracion;

	public Cancion() {
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Cancion) {
			Cancion canciones = (Cancion) obj;
			return this.getNombre().equals(canciones.getNombre()) && this.getArtista().equals(canciones.getArtista());
		}

		return false;
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
	 * @return the artista
	 */
	public String getArtista() {
		return artista;
	}

	/**
	 * @param artista
	 *            the artista to set
	 */
	public void setArtista(String artista) {
		this.artista = artista;
	}

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion
	 *            the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	/**
	 * @param nombre
	 * @param artista
	 * @param duracion
	 */
	public Cancion(String nombre, String artista, int duracion) {
		super();
		this.nombre = nombre;
		this.artista = artista;
		this.duracion = duracion;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cancion [nombre=" + nombre + ", artista=" + artista + ", duracion=" + duracion + "]";
	}

	// @Override
	// public int compareTo(Cancion o) {
	// // TODO Auto-generated method stub
	// if (this.getDuracion() > o.getDuracion())
	// return 1;
	// if (this.getDuracion() > o.getDuracion())
	// return -1;
	// if (this.getDuracion() == o.getDuracion())
	// return 0;
	// else {
	// return 0;
	// }
	//
	// }
//	Collections.sort( cancion ,new Comparator<cancion>(){
//
//	@Override
//	public int compare(Cancion o1, Cancion o2) {
//		// TODO Auto-generated method stub
//		
//		return o1.getDuracion().compareTo(o2.getDuracion());
//	}
//	});
}

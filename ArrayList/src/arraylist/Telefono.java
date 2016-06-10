/**
 * 
 */
package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author JuanClavero
 *
 */
public class Telefono {

	private ArrayList<Contacto> contactos;

	public Telefono() {

	}

	public void imprimirForEach() {
		for (Contacto contactos : contactos) {
			System.out.println(contactos.getNombre());
		}

	}

	/**
	 * @param contactos
	 */
	public Telefono(ArrayList<Contacto> contactos) {
		super();
		this.contactos = contactos;
	}

	public void imprimirFor() {
		for (int i = 0; i < contactos.size(); i++) {
			System.out.println(contactos.get(i).getNombre());
		}
	}

	public void imprimirIterador() {
		Iterator<Contacto> iterador = contactos.iterator();
		{
			while (iterador.hasNext()) {
				System.out.println(iterador.next().getNombre());
			}
		}
		;
	}

	/**
	 * @return the contactos
	 */
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	/**
	 * @param contactos
	 *            the contactos to set
	 */
	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}
}

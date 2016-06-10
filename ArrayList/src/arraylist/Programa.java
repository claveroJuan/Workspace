/**
 * 
 */
package arraylist;

import java.util.ArrayList;

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

		ArrayList<Contacto> c1 = new ArrayList<>(5);
		Telefono telefono = new Telefono();

		c1.add(new Contacto());
		c1.add(new Contacto());
		c1.add(new Contacto());
		c1.add(new Contacto());
		c1.add(new Contacto());

		telefono.setContactos(c1);//
		telefono.imprimirFor();
		telefono.imprimirForEach();
		telefono.imprimirIterador();

	}

}

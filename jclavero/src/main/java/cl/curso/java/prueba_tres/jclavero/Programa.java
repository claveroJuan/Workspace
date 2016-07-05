/**
 * 
 */
package cl.curso.java.prueba_tres.jclavero;

import java.util.ArrayList;

import java.util.List;

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

		TarjetaBip tarjetaBip = new TarjetaBip();
		Viaje viaje = new Viaje();
		PagarViaje pagarViaje = new PagarViaje(tarjetaBip);
		pagarViaje.start();
		List<Viaje> viajes = new ArrayList<Viaje>();
		viajes.add(viaje);

	}

}

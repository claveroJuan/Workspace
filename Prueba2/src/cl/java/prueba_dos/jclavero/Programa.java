/**
 * 
 */
package cl.java.prueba_dos.jclavero;

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

		Tren tren1=new TrenRutaRoja(0, null, null);
		Tren tren2=new TrenRutaVerde(0, null, null);
		Estacion estacion1 = new EstacionComun();
		Estacion estacion2 = new EstacionTrenRutaRoja();
		Estacion estacion3 = new EstacionRutaVerde();
		tren1.seDetiene(estacion1);
		tren2.seDetiene(estacion2);
		tren1.seDetiene(estacion3);
	}

}

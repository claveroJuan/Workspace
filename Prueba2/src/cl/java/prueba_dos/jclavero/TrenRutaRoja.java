/**
 * 
 */
package cl.java.prueba_dos.jclavero;

/**
 * @author JuanClavero
 *
 */
public class TrenRutaRoja extends Tren {

	public TrenRutaRoja(int numero, String linea,Estacion estacion) {
		super(numero, linea, estacion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean seDetiene(Estacion estacion) {
		// TODO Auto-generated method stub
	estacion.seDetieneTrenRutaRoja();
		return true;
	}

}

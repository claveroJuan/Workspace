/**
 * 
 */
package cl.java.prueba_dos.jclavero;

/**
 * @author JuanClavero
 *
 */
public class EstacionTrenRutaRoja extends Estacion {

	/**
	 * 
	 */
	public EstacionTrenRutaRoja() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param linea
	 */
	public EstacionTrenRutaRoja(String nombre, String linea) {
		super(nombre, linea);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see cl.java.prueba_dos.jclavero.Estacion#seDetieneTrenRutaRoja()
	 */
	@Override
	public boolean seDetieneTrenRutaRoja() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see cl.java.prueba_dos.jclavero.Estacion#seDetieneTrenRutaVerde()
	 */
	@Override
	public boolean seDetieneTrenRutaVerde() {
		// TODO Auto-generated method stub
		return false;
	}

}

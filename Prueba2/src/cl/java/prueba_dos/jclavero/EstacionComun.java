/**
 * 
 */
package cl.java.prueba_dos.jclavero;

/**
 * @author JuanClavero
 *
 */
public class EstacionComun extends Estacion {

	/**
	 * 
	 */
	public EstacionComun() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param linea
	 */
	public EstacionComun(String nombre, String linea) {
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

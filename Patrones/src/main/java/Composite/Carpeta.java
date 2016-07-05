/**
 * 
 */
package Composite;

import java.util.List;

/**
 * @author JuanClavero
 *
 */
public class Carpeta extends Directorio {

	private List<Directorio> directorio;

	@Override
	public int calcularPeso() {

		// TODO Auto-generated method stub

		int pesoTotal = 0;
		for (Directorio direct : this.getDirectorio()) {
			pesoTotal = +direct.calcularPeso();
		}
		return pesoTotal;
	}

	/**
	 * @return the directorio
	 */
	public List<Directorio> getDirectorio() {

		return directorio;
	}

	/**
	 * @param directorio
	 *            the directorio to set
	 */
	public void setDirectorio(List<Directorio> directorio) {

		this.directorio = directorio;
	}
}

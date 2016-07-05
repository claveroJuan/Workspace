/**
 * 
 */
package cl.curso.java.prueba_tres.Observer;

import java.util.List;

/**
 * @author JuanClavero
 *
 */
public abstract class Sensor {

	private List<Observador> observer;

	public Sensor() {
		// TODO Auto-generated constructor stub
	}

	public void notificar() {

	}

	public void eliminar(Observador observador) {

	}

	public void actualizar(Observador observador) {

	}

	/**
	 * @return the observer
	 */
	public List<Observador> getObserver() {
		return observer;
	}

	/**
	 * @param observer
	 *            the observer to set
	 */
	public void setObserver(List<Observador> observer) {
		this.observer = observer;
	}

}

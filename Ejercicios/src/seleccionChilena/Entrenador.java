/**
 * 
 */
package seleccionChilena;

/**
 * @author JuanClavero
 *
 */
public class Entrenador extends SeleccionFutbol {

	private String nacionalidad;
		

	/**
	 * 
	 */
	public Entrenador() {
		super();
		// TODO Auto-generated constructor stub
	}


	


	public Entrenador(int i, String string, String string2, int j, String string3) {
		// TODO Auto-generated constructor stub
	}





	@Override
	public void entrenar() {
		// TODO Auto-generated method stub
		System.out.println("entrenar equipo (entrenador)");
	}


	/**
	 * @return the nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}


	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	/* (non-Javadoc)
	 * @see seleccionChilena.SeleccionFutbol#partidoFutbol()
	 */
	@Override
	public void partidoFutbol() {
		// TODO Auto-generated method stub
	System.out.println("dirige equipo (entrenador)");
	}
	public void planificarPartido()
	{
		System.out.println("planificar partido");
	}

}

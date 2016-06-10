/**
 * 
 */
package seleccionChilena;

/**
 * @author JuanClavero
 *
 */
public class Futbolista extends SeleccionFutbol {

	private int dorsal;
	private String demarcacion;
	
	public void darEntrevista()
	{
		System.out.println();
	}
	
	/**
	 * 
	 */
	public Futbolista() {
		// TODO Auto-generated constructor stub
	}

	public Futbolista(int id, String nombre, String apellidos, int edad, int k, String string3) {
		super(id, nombre, apellidos, edad);
		this.dorsal =k;
		this.demarcacion = string3;
	}

	/* (non-Javadoc)
	 * @see seleccionChilena.SeleccionFutbol#entrenar()
	 */
	@Override
	public void entrenar() {
		// TODO Auto-generated method stub
		System.out.println("entrenar (jugador)");

	}

	/**
	 * @return the dorsal
	 */
	public int getDorsal() {
		return dorsal;
	}

	/**
	 * @param dorsal the dorsal to set
	 */
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	/**
	 * @return the demarcacion
	 */
	public String getDemarcacion() {
		return demarcacion;
	}

	/**
	 * @param demarcacion the demarcacion to set
	 */
	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	/* (non-Javadoc)
	 * @see seleccionChilena.SeleccionFutbol#partidoFutbol()
	 */
	@Override
	public void partidoFutbol() {
		// TODO Auto-generated method stub
		System.out.println("jugar partido (jugador)");
	}

}

/**
 * 
 */
package seleccionChilena;

/**
 * @author JuanClavero
 *
 */
public class Paramedicos extends SeleccionFutbol {

	private int a�osExperiencia;

	public Paramedicos(int i, String string, String string2, int j, int k) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the a�osExperiencia
	 */
	public int getA�osExperiencia() {
		return a�osExperiencia;
	}

	/**
	 * @param a�osExperiencia the a�osExperiencia to set
	 */
	public void setA�osExperiencia(int a�osExperiencia) {
		this.a�osExperiencia = a�osExperiencia;
	}

	@Override
	public void entrenar() {
		// TODO Auto-generated method stub
		System.out.println("socorer entrenamiento (paramedico)");
		
	}

	/* (non-Javadoc)
	 * @see seleccionChilena.SeleccionFutbol#partidoFutbol()
	 */
	@Override
	public void partidoFutbol() {
		// TODO Auto-generated method stub

		System.out.println("socorer a jugadores (paramedico)");
	}
	public void brindarAux()
	{
		System.out.println("brindar auxilio (paramedico)");
	}
	
}

/**
 * 
 */
package seleccionChilena;

/**
 * @author JuanClavero
 *
 */
public class Paramedicos extends SeleccionFutbol {

	private int añosExperiencia;

	public Paramedicos(int i, String string, String string2, int j, int k) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the añosExperiencia
	 */
	public int getAñosExperiencia() {
		return añosExperiencia;
	}

	/**
	 * @param añosExperiencia the añosExperiencia to set
	 */
	public void setAñosExperiencia(int añosExperiencia) {
		this.añosExperiencia = añosExperiencia;
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

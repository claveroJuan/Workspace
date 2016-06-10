/**
 * 
 */
package ejercicio1Compocicion;

/**
 * @author JuanClavero
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Permiso per = new Permiso("rata", 8558554, "ratas");
		Perfil perf = new Perfil("rata", "rata", per);
		
		perf.imprimir();

	}

}

/**
 * 
 */
package superheroes;

/**
 * @author JuanClavero
 *
 */
public class Programa
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Superman superman=new Superman ();
		Batman batman = new Batman();
		Kriptonita krip= new Kriptonita();
		Granada granada = new Granada ();
		superman.recibirAtaque(granada);
		superman.recibirAtaque(krip);
		batman.recibirAtaque(granada);
		batman.recibirAtaque(krip);
		
		// TODO Auto-generated method stub

	}

}

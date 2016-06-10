/**
 * 
 */
package superheroes;

/**
 * @author JuanClavero
 *
 */
public class Superman extends SuperHeroe
{

	
	public Superman()
	{
		
	}

	@Override
	public void recibirAtaque(Arma arma)
	{
		if (arma instanceof Kriptonita)
		{
			System.out.println("muere");
		}
		else
		{
			System.out.println("no muere");
		}
		// TODO Auto-generated method stub
		
	}
	

}

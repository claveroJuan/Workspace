/**
 * 
 */
package superheroes;

/**
 * @author JuanClavero
 *
 */
public class Batman extends SuperHeroe 
{
	
	
	public Batman()
	{
		
	}

	@Override
	public void recibirAtaque(Arma arma)
	{
		if(arma instanceof Granada)
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

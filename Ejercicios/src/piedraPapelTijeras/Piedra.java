/**
 * 
 */
package piedraPapelTijeras;

/**
 * @author JuanClavero
 *
 */
public class Piedra extends Jugada 
{

	public Piedra ()
	{
		
	}
	public void jugar(Jugada objeto) 
	{
		
		objeto.jugarPiedra();
		
		
		
//		if (objeto instanceof Tijera)
//		{
//			System.out.println("gana");
//		}
//		else if (objeto instanceof Piedra)
//		{
//			System.out.println("empata");
//		}
//		else if (objeto instanceof Papel)
//		{
//			System.out.println("pierde");
//		}
		// TODO Auto-generated method stub
		
	}
	@Override
	public void jugarPapel() {
		// TODO Auto-generated method stub
		System.out.println("pierde");
	}
	@Override
	public void jugarTijera() {
		// TODO Auto-generated method stub
		System.out.println("gana");
	}
	@Override
	public void jugarPiedra() {
		// TODO Auto-generated method stub
		System.out.println("empata");
	}
	

}

/**
 * 
 */
package piedraPapelTijeras;

/**
 * @author JuanClavero
 *
 */
public class Tijera extends Jugada 
{

	@Override
	public void jugar(Jugada objeto) {
		objeto.jugarTijera();
		
//		if (objeto instanceof Tijera)
//		{
//			System.out.println("empata");
//		}
//		else if (objeto instanceof Piedra)
//		{
//			System.out.println("pierde");
//		}
//		else if (objeto instanceof Papel)
//		{
//			System.out.println("gana");
//		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jugarPapel() {
		// TODO Auto-generated method stub
		System.out.println("gana");
	}

	@Override
	public void jugarTijera() {
		// TODO Auto-generated method stub
		System.out.println("empata");
	}

	@Override
	public void jugarPiedra() {
		// TODO Auto-generated method stub
		System.out.println("pierde");
	}

}

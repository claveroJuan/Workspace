/**
 * 
 */
package piedraPapelTijeras;

/**
 * @author JuanClavero
 *
 */
public class Papel extends Jugada {

	@Override
	public void jugar(Jugada objeto) {
		objeto.jugarPapel();
//		if (objeto instanceof Tijera)
//		{
//			System.out.println("pierde");
//		}
//		else if (objeto instanceof Piedra)
//		{
//			System.out.println("gana");
//		}
//		else if (objeto instanceof Papel)
//		{
//			System.out.println("empata");
//		}
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jugarPapel() {
		// TODO Auto-generated method stub
		System.out.println("empata");
	}

	@Override
	public void jugarTijera() {
		// TODO Auto-generated method stub
		System.out.println("gana");
	}

	@Override
	public void jugarPiedra() {
		// TODO Auto-generated method stub
		System.out.println("pierde");
	}

}

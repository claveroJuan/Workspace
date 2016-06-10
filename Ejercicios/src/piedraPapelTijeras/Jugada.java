/**
 * 
 */
package piedraPapelTijeras;

/**
 * @author JuanClavero
 *
 */
public abstract class Jugada 
{

	public Jugada ()
	{
		
	}
	public abstract void jugar (Jugada objeto);
	public abstract void jugarPapel ();
	public abstract void jugarTijera ();
	public abstract void jugarPiedra ();
	
}

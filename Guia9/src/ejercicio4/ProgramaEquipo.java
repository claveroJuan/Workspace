/**
 * 
 */
package ejercicio4;

/**
 * @author JuanClavero
 *
 */
public class ProgramaEquipo
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Equipo equipo = new Equipo ();
      
        System.out.println(equipo.getNombre()+" "+ equipo.getpJugados()+" "+ equipo.getPuntosTotales());
        equipo.ganar();
        equipo.ganar();
        equipo.ganar();
        equipo.empatar();
        equipo.perder();
        System.out.println(equipo.getNombre()+" "+ equipo.getpJugados()+" "+ equipo.getPuntosTotales());
	}

}

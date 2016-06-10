/**
 * 
 */
package ejercicio4;

/**
 * @author JuanClavero
 *
 */
public class Equipo
{

	private String nombre;
	private int pGanados;
	private int pPerdidos;
	private int pEmpatados;
	private int puntosTotales;
	private int pJugados;
	
	public void ganar ()
	{
		this.pJugados++;
		this.pGanados++;
		this.puntosTotales=this.puntosTotales+3;
		
	}
	public void perder ()
	{
		this.pJugados++;
		this.pPerdidos++;
		
	}
	public void empatar ()
	{
		this.pJugados++;
		this.pEmpatados++;
		this.puntosTotales=this.puntosTotales+1;
	}
	public Equipo ()
	{
		this.nombre = "colo-colo";
		
	}
	/**
	 * @param nombre
	 * @param pGanados
	 * @param pPerdidos
	 * @param pEmpatados
	 * @param pJugados
	 * @param puntosTotales
	 */
	public Equipo(String nombre, int pGanados, int pPerdidos, int pEmpatados) {
		
		this.nombre = nombre;
		this.pGanados = pGanados;
		this.pPerdidos = pPerdidos;
		this.pEmpatados = pEmpatados;
		
		
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the pGanados
	 */
	public int getpGanados() {
		return pGanados;
	}
	/**
	 * @param pGanados the pGanados to set
	 */
	public void setpGanados(int pGanados) {
		this.pGanados = pGanados;
	}
	/**
	 * @return the pPerdidos
	 */
	public int getpPerdidos() {
		return pPerdidos;
	}
	/**
	 * @param pPerdidos the pPerdidos to set
	 */
	public void setpPerdidos(int pPerdidos) {
		this.pPerdidos = pPerdidos;
	}
	/**
	 * @return the pEmpatados
	 */
	public int getpEmpatados() {
		return pEmpatados;
	}
	/**
	 * @param pEmpatados the pEmpatados to set
	 */
	public void setpEmpatados(int pEmpatados) {
		this.pEmpatados = pEmpatados;
	}
	/**
	 * @return the pJugados
	 */
	public int getpJugados() {
		return pJugados;
	}
	/**
	 * @param pJugados the pJugados to set
	 */
	public void setpJugados(int pJugados) {
		this.pJugados = pJugados;
	}
	/**
	 * @return the puntosTotales
	 */
	public int getPuntosTotales() {
		return puntosTotales;
	}
	/**
	 * @param puntosTotales the puntosTotales to set
	 */
	public void setPuntosTotales(int puntosTotales) {
		this.puntosTotales = puntosTotales;
	}
	
	
	
}

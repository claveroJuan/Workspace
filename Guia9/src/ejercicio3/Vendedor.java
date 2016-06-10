package ejercicio3;

public class Vendedor
{
	private String nombre;
	private int semanasTrabajadas;	
	private int artVendidos;
	private int valorArtVendido;

	public int comision (int ventaBruta)
	{
	
		return ((int) ((this.semanasTrabajadas*200)+(ventaBruta*1.09)));
	}
	/**
	 * @param nombre
	 * @param semanasTrabajadas
	 * @param artVendidos
	 * @param valorArtVendido
	 */
	public Vendedor(String nombre, int semanasTrabajadas, int artVendidos, int valorArtVendido) {
		super();
		this.nombre = nombre;
		this.semanasTrabajadas = semanasTrabajadas;
		this.artVendidos = artVendidos;
		this.valorArtVendido = valorArtVendido;
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
	 * @return the semanasTrabajadas
	 */
	public int getSemanasTrabajadas() {
		return semanasTrabajadas;
	}
	/**
	 * @param semanasTrabajadas the semanasTrabajadas to set
	 */
	public void setSemanasTrabajadas(int semanasTrabajadas) {
		this.semanasTrabajadas = semanasTrabajadas;
	}
	/**
	 * @return the artVendidos
	 */
	public int getArtVendidos() {
		return artVendidos;
	}
	/**
	 * @param artVendidos the artVendidos to set
	 */
	public void setArtVendidos(int artVendidos) {
		this.artVendidos = artVendidos;
	}
	/**
	 * @return the valorArtVendido
	 */
	public int getValorArtVendido() {
		return valorArtVendido;
	}
	/**
	 * @param valorArtVendido the valorArtVendido to set
	 */
	public void setValorArtVendido(int valorArtVendido) {
		this.valorArtVendido = valorArtVendido;
	}
	
	

}

package cl.cursos.java.control;

public class Articulo 
{
	private String nombre;
	private int costoBase;
	private int detalle;
	private int mayor;

	public Articulo(String nombre, int costoBase) 
	{
	
		this.nombre="auto";
		this.costoBase=4000000;
		
	}

	public int precioAlDetalle (int costobase)
	{
		int incremento=(int) (this.costoBase*0.30);
	 this.detalle=this.costoBase+incremento;
		
		return this.detalle;
	}
	public int precioAlMayor (int costobase)
	{
		int incremento=(int) (this.costoBase*0.15);
		this.mayor=this.costoBase+incremento;
		return mayor;
	}
	public void imprimir ()
	{
		System.out.println("nombre Articulo :"+ this.nombre);
		System.out.println("precio Articulo :"+ this.costoBase);
		
		
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
	 * @return the costoBase
	 */
	public int getCostoBase() {
		return costoBase;
	}

	/**
	 * @param costoBase the costoBase to set
	 */
	public void setCostoBase(int costoBase) {
		this.costoBase = costoBase;
	}

	/**
	 * @return the detalle
	 */
	public int getDetalle() {
		return detalle;
	}

	/**
	 * @param detalle the detalle to set
	 */
	public void setDetalle(int detalle) {
		this.detalle = detalle;
	}

	/**
	 * @return the mayor
	 */
	public int getMayor() {
		return mayor;
	}

	/**
	 * @param mayor the mayor to set
	 */
	public void setMayor(int mayor) {
		this.mayor = mayor;
	}
}

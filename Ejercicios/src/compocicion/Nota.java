package compocicion;

public class Nota 
{

	private String nombre;
	private double nota;
	private double porcentaje;
	 public Nota ()
	 {}
	public Nota(String nombre ,double nota, double porcentaje)
	{
		this.nombre=nombre;
		this.nota = nota;
		this.porcentaje = porcentaje;
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
	 * @return the nota
	 */
	public double getNota() {
		return nota;
	}
	/**
	 * @param nota the nota to set
	 */
	public void setNota(double nota) {
		this.nota = nota;
	}
	/**
	 * @return the porcentaje
	 */
	public double getPorcentaje() {
		return porcentaje;
	}
	/**
	 * @param porcentaje the porcentaje to set
	 */
	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	 
}

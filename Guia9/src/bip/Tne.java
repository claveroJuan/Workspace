package bip;

import java.util.Date;

public abstract class Tne extends TarjetaBip
{

	private String nombre;
	private Date fechaExp;
	public Tne ()
	{
		
	}
	/**
	 * @param nombre
	 * @param fechaExp
	 */
	public Tne(String nombre, Date fechaExp) {
		super();
		this.nombre = nombre;
		this.fechaExp = fechaExp;
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
	 * @return the fechaExp
	 */
	public Date getFechaExp() {
		return fechaExp;
	}
	/**
	 * @param fechaExp the fechaExp to set
	 */
	public void setFechaExp(Date fechaExp) {
		this.fechaExp = fechaExp;
	}
	public void imprimir ()
	{
		System.out.println(this.nombre);
		System.out.println(this.fechaExp);
	}
}

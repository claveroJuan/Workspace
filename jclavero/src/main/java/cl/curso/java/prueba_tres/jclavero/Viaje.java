/**
 * 
 */
package cl.curso.java.prueba_tres.jclavero;

import java.util.Date;

/**
 * @author JuanClavero
 *
 */
public class Viaje implements Comparable<Date> {
	private Date fecha;
	private int saldoTarjeta;
	private int valorViaje;
	public int compareTo(Date obj) {
		// TODO Auto-generated method stub
		
		return this.fecha.compareTo(getFecha());
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public Viaje() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the saldoTarjeta
	 */
	public int getSaldoTarjeta() {
		return saldoTarjeta;
	}
	/**
	 * @param saldoTarjeta the saldoTarjeta to set
	 */
	public void setSaldoTarjeta(int saldoTarjeta) {
		this.saldoTarjeta = saldoTarjeta;
	}
	/**
	 * @return the valorViaje
	 */
	public int getValorViaje() {
		return valorViaje;
	}
	/**
	 * @param valorViaje the valorViaje to set
	 */
	public void setValorViaje(int valorViaje) {
		this.valorViaje = valorViaje;
	}
	/**
	 * @param fecha
	 * @param saldoTarjeta
	 * @param valorViaje
	 */
	public Viaje(Date fecha, int saldoTarjeta, int valorViaje) {
		super();
		this.fecha = fecha;
		this.saldoTarjeta = saldoTarjeta;
		this.valorViaje = valorViaje;
	}
	
	
}

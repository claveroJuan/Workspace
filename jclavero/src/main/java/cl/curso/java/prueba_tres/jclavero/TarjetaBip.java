/**
 * 
 */
package cl.curso.java.prueba_tres.jclavero;

import java.util.List;

/**
 * @author JuanClavero
 *
 */
public class TarjetaBip {

	private int numeroTarjeta;
	private int saldo;
	private List<Viaje> viajes;

	public TarjetaBip() {
		// TODO Auto-generated constructor stub
		this.numeroTarjeta = 1111111111;
		this.saldo = 0;
		this.viajes = null;
	}

	/**
	 * @param numeroTarjeta
	 * @param saldo
	 * @param viajes
	 */
	public TarjetaBip(int numeroTarjeta, int saldo, List<Viaje> viajes) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.saldo = saldo;
		this.viajes = viajes;
	}

	public void recargar(int monto) {
		this.setSaldo(this.getSaldo() + monto);
	}

	public synchronized void pagarViaje(int valorViaje) {
		// excepcion sin sald
		if (this.getSaldo() < valorViaje) {
			throw new SinSaldoException("no tiene saldo suficiente");
		}
		if (this.getNumeroTarjeta() >= valorViaje) {
			this.setSaldo(this.getSaldo() - valorViaje);
			this.getViajes().add(new Viaje());
			for (Viaje viajes : viajes) {
				System.out.println(viajes);
			}
		}

	}

	public void imprimir() {

		System.out.println(
				"n° tarjeta" + this.getNumeroTarjeta() + "saldo :" + this.saldo + "cant viajes :" + this.getViajes());

	}

	/**
	 * @return the numeroTarjeta
	 */
	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}

	/**
	 * @param numeroTarjeta
	 *            the numeroTarjeta to set
	 */
	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	/**
	 * @return the saldo
	 */
	public int getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo
	 *            the saldo to set
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the viajes
	 */
	public List<Viaje> getViajes() {
		return viajes;
	}

	/**
	 * @param viajes
	 *            the viajes to set
	 */
	public void setViajes(List<Viaje> viajes) {
		this.viajes = viajes;
	}

}

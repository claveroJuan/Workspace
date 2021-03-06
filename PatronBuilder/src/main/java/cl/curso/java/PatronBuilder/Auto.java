/**
 * 
 */
package cl.curso.java.PatronBuilder;

import java.util.List;

/**
 * @author JuanClavero
 *
 */
public class Auto {

	private String marca;
	private String modelo;
	private Gps GPS;
	private Motor motor;
	private List<Rueda> ruedas;

	public Auto() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca
	 *            the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo
	 *            the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the gPS
	 */
	public Gps getGPS() {
		return GPS;
	}

	/**
	 * @param gPS
	 *            the gPS to set
	 */
	public void setGPS(Gps gPS) {
		GPS = gPS;
	}

	/**
	 * @return the motor
	 */
	public Motor getMotor() {
		return motor;
	}

	/**
	 * @param motor
	 *            the motor to set
	 */
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	/**
	 * @return the ruedas
	 */
	public List<Rueda> getRuedas() {
		return ruedas;
	}

	/**
	 * @param ruedas
	 *            the ruedas to set
	 */
	public void setRuedas(List<Rueda> ruedas) {
		this.ruedas = ruedas;
	}
}

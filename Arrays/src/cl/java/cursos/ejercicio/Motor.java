package cl.java.cursos.ejercicio;
/**
 * clase motor
 * @author JuanClavero
 *
 */
public class Motor {
	int caballosFuerza;
	String tipo;
	boolean encendido;


	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the encendido
	 */
	public boolean isEncendido() {
		return encendido;
	}

	/**
	 * @param encendido the encendido to set
	 */
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public Motor() // constructor objeto motor
	{
		this.caballosFuerza = 1000;
	}

	public Motor(int caballosFuerza) {
		this.caballosFuerza = caballosFuerza; // constructor parametizado
	}

	public Motor(int caballosFuerza, String tipo) {
		super(); // costructor con atributos x defecto
		this.caballosFuerza = caballosFuerza;
		this.tipo = tipo;
	}
/**
 * 
 * @return metodo devuelve caballos de fuerza
 */
	public int getCaballosFuerza() {  //devuelve los caballos de fuerza
		return caballosFuerza;
	}

	public void setCaballosFuerza(int caballosFuerza) {
		this.caballosFuerza = caballosFuerza;
	}

}

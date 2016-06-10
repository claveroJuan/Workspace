/**
 * 
 */
package Reloj;

/**
 * @author JuanClavero
 *
 */
public class Reloj {

	
	private int segundos;
	private int minutos;
	private int horas;
	private boolean estaEncendido;
	
	public void avanzarSeg() {
		this.segundos++;
		
		if (this.segundos == 60) {
			this.segundos = 0;
		this.avanzarMin();
		}

	}

	public void avanzarMin() {

		this.minutos++;

		if (this.minutos == 60) {
			this.minutos = 0;
		}
		this.avanzarHora();
		

	}

	public void avanzarHora() {

		
		this.horas++;

		if (this.horas == 24) {
			this.horas = 0;
		}

	}

	/**
	 * @return the segundos
	 */
	public int getSegundos() {
		return segundos;
	}

	/**
	 * @param segundos the segundos to set
	 */
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public void imprimir(){
		System.out.println(this.horas+":"+this.minutos+":"+this.segundos);
	}
	public Reloj(){
		
	}
	/**
	 * @return the minutos
	 */
	public int getMinutos() {
		return minutos;
	}

	/**
	 * @param minutos the minutos to set
	 */
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	/**
	 * @return the horas
	 */
	public int getHoras() {
		return horas;
	}

	/**
	 * @param horas the horas to set
	 */
	public void setHoras(int horas) {
		this.horas = horas;
	}

	/**
	 * @param segundos
	 * @param minutos
	 * @param horas
	 */
	public Reloj(int segundos, int minutos, int horas) {
		super();
		this.segundos = segundos;
		this.minutos = minutos;
		this.horas = horas;
	}

	/**
	 * @return the estaEncendido
	 */
	public boolean isEstaEncendido() {
		return estaEncendido;
	}

	/**
	 * @param estaEncendido the estaEncendido to set
	 */
	public void setEstaEncendido(boolean estaEncendido) {
		this.estaEncendido = estaEncendido;
	}


	
}

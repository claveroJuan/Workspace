/**
 * 
 */
package ejercicio5;

/**
 * @author JuanClavero
 *
 */
public class Moto implements Desplazable {

	private String marca;
	private String modelo;
	
	
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
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
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	/**
	 * @param marca
	 * @param modelo
	 */
	public Moto(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}
	public Moto(){
		
	}
	@Override
	public void desplazar(int km) {
		// TODO Auto-generated method stub
		System.out.println("mover moto "+km+" kilometros");
		
	}

}

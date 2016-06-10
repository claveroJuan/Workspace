/**
 * 
 */
package ejerciciosControlException;

/**
 * @author JuanClavero
 *
 */
public class Auto {

	private String marca;
	private String modelo;
	private int anio;
	private int stock;
	public Auto(){
		
	}
	public void venderAuto() throws SinStockException
	{
		if(this.getStock()>0){
		this.setStock(this.stock--);
		}else{
			throw new SinStockException("");
		}
	}
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
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}
	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}
	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}
	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}
	/**
	 * @param marca
	 * @param modelo
	 * @param anio
	 * @param stock
	 */
	public Auto(String marca, String modelo, int anio, int stock) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.stock = stock;
	}
	
	
	
}

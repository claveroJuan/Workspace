package ejercicio2;

public class Auto 
{
	
	private String marca;
	private String tipo;
	private String patente;
	private int modelo;
	private int codigo;
	private int kilometraje;
	private int precioVenta;
	private int cantidadVender;
	/**
	 * @param marca
	 * @param tipo
	 * @param patente
	 * @param modelo
	 * @param codigo
	 * @param kilometraje
	 * @param precioVenta
	 * @param cantidadVender
	 */
	public Auto() {
		super();
		this.marca = "toyota";
		this.tipo = "camioneta";
		this.patente = "87hgfh";
		this.modelo = 1976;
		this.codigo = 122;
		this.kilometraje = 300;
		this.precioVenta = 8000000;
		this.cantidadVender = 7;
	}
	/**
	 * @param marca
	 * @param tipo
	 * @param patente
	 * @param modelo
	 * @param codigo
	 * @param kilometraje
	 * @param precioVenta
	 * @param cantidadVender
	 */
	public Auto(String marca, String tipo, String patente, int modelo, int codigo, int kilometraje, int precioVenta,
			int cantidadVender) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.patente = patente;
		this.modelo = modelo;
		this.codigo = codigo;
		this.kilometraje = kilometraje;
		this.precioVenta = precioVenta;
		this.cantidadVender = cantidadVender;
	}
	public  void  vender (int cant)
	{
		if (cant<=this.cantidadVender){
		this.cantidadVender=this.cantidadVender-cant;
		System.out.println("vendido");
		}
		else 
	  {System.out.println("sin stock ");}
	
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
	 * @return the tipo
	 */
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
	 * @return the patente
	 */
	public String getPatente() {
		return patente;
	}
	/**
	 * @param patente the patente to set
	 */
	public void setPatente(String patente) {
		this.patente = patente;
	}
	/**
	 * @return the modelo
	 */
	public int getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the kilometraje
	 */
	public int getKilometraje() {
		return kilometraje;
	}
	/**
	 * @param kilometraje the kilometraje to set
	 */
	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}
	/**
	 * @return the precioVenta
	 */
	public int getPrecioVenta() {
		return precioVenta;
	}
	/**
	 * @param precioVenta the precioVenta to set
	 */
	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}
	/**
	 * @return the cantidadVender
	 */
	public int getCantidadVender() {
		return cantidadVender;
	}
	/**
	 * @param cantidadVender the cantidadVender to set
	 */
	public void setCantidadVender(int cantidadVender) {
		this.cantidadVender = cantidadVender;
	}
	

}


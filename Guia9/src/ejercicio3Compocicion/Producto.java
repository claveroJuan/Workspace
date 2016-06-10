package ejercicio3Compocicion;

public class Producto
{

	private String nombre;
	private String tipoArticulo;
	private int cantidad;
	private double precio;
	
	/**
	 * 
	 */
	public Producto() {
	}

	/**
	 * @param nombre
	 * @param tipoArticulo
	 * @param cantidad
	 * @param precio
	 */
	public Producto(String nombre, String tipoArticulo, int cantidad, double precio) {
		this.nombre = nombre;
		this.tipoArticulo = tipoArticulo;
		this.cantidad = cantidad;
		this.precio = precio;
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
	 * @return the tipoArticulo
	 */
	public String getTipoArticulo() {
		return tipoArticulo;
	}

	/**
	 * @param tipoArticulo the tipoArticulo to set
	 */
	public void setTipoArticulo(String tipoArticulo) {
		this.tipoArticulo = tipoArticulo;
	}

	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String toString()
	{
		return "\nNombre producto: "+getNombre()
		+"\nTipo de articulo: "+getTipoArticulo()
		+"\nCantidad: "+getCantidad()
		+"\nPrecio: $"+getPrecio();
	}

}

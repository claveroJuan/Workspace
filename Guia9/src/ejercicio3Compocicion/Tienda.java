package ejercicio3Compocicion;

public class Tienda
{
	private String nombre;
	private String tipoTienda;
	private Producto[] listaProducto;
	
	/**
	 * 
	 */
	public Tienda() {
	}

	/**
	 * @param nombre
	 * @param tipoTienda
	 * @param listaProducto
	 */
	public Tienda(String nombre, String tipoTienda, Producto[] listaProducto) {
		this.nombre = nombre;
		this.tipoTienda = tipoTienda;
		this.listaProducto = listaProducto;
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
	 * @return the tipoTienda
	 */
	public String getTipoTienda() {
		return tipoTienda;
	}

	/**
	 * @param tipoTienda the tipoTienda to set
	 */
	public void setTipoTienda(String tipoTienda) {
		this.tipoTienda = tipoTienda;
	}

	/**
	 * @return the listaProducto
	 */
	public Producto[] getListaProducto() {
		return listaProducto;
	}

	/**
	 * @param listaProducto the listaProducto to set
	 */
	public void setListaProducto(Producto[] listaProducto) {
		this.listaProducto = listaProducto;
	}
	
	public String toString()
	{
		String aux = "\nTienda."
				+"\n--------------"
				+"\nNombre de la tienda: "+getNombre()
				+"\nTipo de tienda: "+getTipoTienda()
				+"\n"
				+"\nLista de productos."
				+"\n--------------";
		
		for (int i = 0; i < listaProducto.length; i++) {
			
			
			aux = aux+"\nProducto n°: "+(i+1)+listaProducto[i].toString()+"\n";
		}
		
		return aux;

}
}

/**
 * 
 */
package Conexion;

/**
 * @author JuanClavero
 *
 */
public class Conexion {

	private EstadoConexion estado ;
	/**
	 * @return the estado
	 */
	public EstadoConexion getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(EstadoConexion estado) {
		this.estado = estado;
	}
	
	
	public Conexion(){
		
	}
	/**
	 * @param estado
	 */
	public Conexion(EstadoConexion estado) {
		super();
		this.estado = estado;
		/*
		 * 
		 * importante abrir conexion y cerrar conexion.
		 * notese que el this como parametro.
		 */
	}
	public void abrirConecion(){
		this.getEstado().abrirConexion(this);
	}
	public void cerrarConexion(){
		this.getEstado().cerarConexion(this);
	}
}

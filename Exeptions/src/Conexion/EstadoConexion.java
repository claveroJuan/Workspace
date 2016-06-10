/**
 * 
 */
package Conexion;

/**
 * @author JuanClavero
 *
 */
public abstract class EstadoConexion {

	public EstadoConexion (){
		
	}
	public abstract void abrirConexion(Conexion conexion);
		
	
	public abstract void cerarConexion(Conexion conexion);
		
	
}

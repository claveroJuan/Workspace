/**
 * 
 */
package Conexion;

/**
 * @author JuanClavero
 *
 */
public class ConexionAbierta extends EstadoConexion{

	public ConexionAbierta (){
		
	}
	@Override
	public void abrirConexion(Conexion conexion) {
		// TODO Auto-generated method stub
		throw new ConexionAbiertaException("el estado  de la conexion es abierta");
	
	}
	@Override
	public void cerarConexion(Conexion conexion) {
		// TODO Auto-generated method stub
		conexion.setEstado(new ConexionCerrada());
	}

}

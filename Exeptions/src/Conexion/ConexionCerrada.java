/**
 * 
 */
package Conexion;

/**
 * @author JuanClavero
 *
 */
public class ConexionCerrada extends EstadoConexion {

	
	public ConexionCerrada(){
		
	}

	@Override
	public void abrirConexion(Conexion conexion) {
		// TODO Auto-generated method stub
		conexion.setEstado(new ConexionCerrada());
	}

	@Override
	public void cerarConexion(Conexion conexion) {
		// TODO Auto-generated method stub
		throw new ConexionCerradaException("el estado de la conexion es cerrado");
	}
	

}

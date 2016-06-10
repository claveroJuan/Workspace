/**
 * 
 */
package Conexion;

import javax.swing.JOptionPane;

/**
 * @author JuanClavero
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*
		 * importante: crer cada objeto para poder acceder a los metodos de la clases
		 * 
		 */
		try{
//		ConexionAbierta open = new ConexionAbierta();
//		Conexion conexion = new Conexion(open);
//		conexion.abrirConecion();
		ConexionCerrada close= new ConexionCerrada();
		Conexion conexion1 =new Conexion(close);	
		conexion1.cerrarConexion();
			
		}catch(ConexionAbiertaException n){
	
			n.getMessage();
			JOptionPane.showMessageDialog(null, "Error ya esta conectado ","",JOptionPane.ERROR_MESSAGE);
		}
		catch (ConexionCerradaException e){
			e.getMessage();
			JOptionPane.showMessageDialog(null, "No se encuentra conectado ","",JOptionPane.ERROR_MESSAGE);
		}finally {
			
		}

	}

}

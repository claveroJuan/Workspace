/**
 * 
 */
package cl.curso.java.login_app;

import java.sql.SQLException;

/**
 * @author JuanClavero
 *
 */
//todoslos metodos de esta clase son estaticos
public final class UsarioFacade {
	public static void login(Usuario usuario) throws AutenticacionException, CuentaBloqueadaException, SQLException {

		
		if (!(UsuarioDAO.validar(usuario))) {
			//usuario.setIntentosFallidos(usuario.getIntentosFallidos()+1);--> esta tarea se la dejamos a UsuarioDAO
			UsuarioDAO.aumentarIntentosFallidos(usuario);
			throw new AutenticacionException("Usuario y/o Pass incorrectos");
		}

	}
	
}

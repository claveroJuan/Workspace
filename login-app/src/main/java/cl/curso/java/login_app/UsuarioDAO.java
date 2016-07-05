/**
 * 
 */
package cl.curso.java.login_app;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author JuanClavero
 *
 */
public class UsuarioDAO {
	public static boolean validar(Usuario usuario) throws SQLException {
		Conexion con = Conexion.getInstancia();
		PreparedStatement st = con.getConnection()
				.prepareStatement("select * from usuarios where " + "nombre_usuario=? AND " + "password =?;");
		st.setString(1, usuario.getUsuario());
		st.setString(2, usuario.getPassword());

		ResultSet rs = st.executeQuery();
		return rs.next();
	}
	public static void aumentarIntentosFallidos(Usuario usuario) throws CuentaBloqueadaException{
		if (usuario.getIntentosFallidos() >= 3) {
			throw new CuentaBloqueadaException("La cuenta ha sido bloqueada");//arrojar excepcion si se intenta realizar mas de 3 intentos
		}
	}
}

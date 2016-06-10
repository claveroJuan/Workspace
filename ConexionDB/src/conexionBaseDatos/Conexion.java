package conexionBaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	private static Conexion _conexion;// EN ALGUN MOMENTO LE GENERARE INSTANCIAS
	private Connection connection;// ATRIBUTO DE CLASES

	private Conexion() {

	}

	public static Conexion getInstancia() {

		if (_conexion == null) {

			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.0.108/curso", "alumnos", "java123");
				Conexion conexion = new Conexion();
				conexion.setConnection(conn);
				_conexion = conexion;

				// } catch (SQLException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// } catch (ClassNotFoundException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
			} catch (Exception d) {
				throw new ConexionException("error al conectarse", d);
			}

		
		}
		return _conexion;
	}

	/**
	 * @return the connection
	 */
	public Connection getConnection() {
		return connection;
	}

	/**
	 * @param connection
	 *            the connection to set
	 */
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
}

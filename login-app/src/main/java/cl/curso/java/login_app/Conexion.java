package cl.curso.java.login_app;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	private static Conexion _conexion;// variable que retornare en metodo
										// ConexiongetInstance
	private Connection connection;// ATRIBUTO DE CLASES

	/*
	 * el constructor de una conexion debe ser privado, para que no se puedan
	 * generar mas instancias de una misma conexion
	 */
	private Conexion() {

	}

	public static Conexion getInstancia() {

		/*
		 * si no existe una conexion, genero una nueva conexion si existe una ,
		 * arrojamos una excepcion
		 */
		if (_conexion == null) {

			try {
				Class.forName("com.mysql.jdbc.Driver");// cargar driver
				Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.0.128/curso", "alumnos", "java123");// conectarse
																														// a
																														// bd
				Conexion conexion = new Conexion();
				conexion.setConnection(conn);//settear el estado de connecion con la conexion establecida
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

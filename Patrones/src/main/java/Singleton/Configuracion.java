/**
 * 
 */
package Singleton;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author JuanClavero
 *
 */
/**
 * 
1.	Crear la clase Configuración, la cual almacenara en un mapa datos para conectarse con una base de datos. La clase configuración debe ser singleton. El mapa almacenará la siguiente configuración.
a.	Clave :urlConexion  Valor : jdbc:mysql://192.168.0.108:3306/curso
b.	Clave :nombreUsuario, Valor : alumnos
c.	Clave :password, Valor : java123

 * @author JuanClavero
 *
 */
public class Configuracion {

	private static Configuracion  _conexion;
	private Connection connection;//objeto de tipo conexion
	
	private Configuracion() {
		// TODO Auto-generated constructor stub
	}
 public static Configuracion getInstance(){
	 if(_conexion==null);
	 try {
		 Class.forName ("com.mysql.jdbc.Driver");//cargar puto driver
		 Connection connect = DriverManager.getConnection("jdbc:mysql://192.168.0.108:3306/curso");
		 Configuracion configuracion=new Configuracion();
		 configuracion.setConnection(connect);
	} catch (Exception e) {
		// TODO: handle exception
		e.getMessage();
	}
	 
	return _conexion;
	 
 }
	/**
	 * @return the _conexion
	 */
	public static Configuracion get_conexion() {
		return _conexion;
	}
	/**
	 * @param _conexion the _conexion to set
	 */
	public static void set_conexion(Configuracion _conexion) {
		Configuracion._conexion = _conexion;
	}
	public Connection getConnection() {
		return connection;
	}
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
}


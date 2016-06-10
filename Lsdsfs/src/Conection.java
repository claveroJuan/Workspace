import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

/**
 * 
 */

/**
 * @author JuanClavero
 *
 */
public class Conection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://192.168.0.108/curso", "alumnos", "java123");
			PreparedStatement pstatementInsert = conexion.prepareStatement( "INSERT INTO alumnos idAlumno,  nombre, apellido,apellido materno)"+ "VALUES (?,?,?,?);");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

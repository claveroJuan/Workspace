package conexionBaseDatos;

public class ProgramaConexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Conexion conn = Conexion.getInstancia();// para obtener instancia de
													// conexion
			Conexion conn2 = Conexion.getInstancia();// crear otra conexion

		} catch (Exception d) {
			d.printStackTrace();
		}
	}

}

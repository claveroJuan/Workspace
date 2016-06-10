/**
 * 
 */
package ejercicio2;

/**
 * @author JuanClavero
 *
 */
public class Usuario {

	private String nombre;
	private String password;
	private int intentosFallidos;

	public Usuario() {
		this.nombre="juan";
		this.password="1234";
		this.intentosFallidos=0;

	}

	public void login(String usuario, String password) throws AutenticacionException, CuentaBloqueadaException {

		if (this.getIntentosFallidos() >= 3) {

			this.setIntentosFallidos(getIntentosFallidos() + 1);
			throw new CuentaBloqueadaException("Error");
		}
		if (this.getNombre().equals("xxx") && this.getPassword().equals("xxx")) {
			this.intentosFallidos++;
			throw new AutenticacionException("usuario y/o password incorrectos");

		}

	}

	/**
	 * @param nombre
	 * @param password
	 * @param intentosFallidos
	 */
	public Usuario(String nombre, String password, int intentosFallidos) {
		super();
		this.nombre = nombre;
		this.password = password;
		this.intentosFallidos = intentosFallidos;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the intentosFallidos
	 */
	public int getIntentosFallidos() {
		return intentosFallidos;
	}

	/**
	 * @param intentosFallidos
	 *            the intentosFallidos to set
	 */
	public void setIntentosFallidos(int intentosFallidos) {
		this.intentosFallidos = intentosFallidos;
	}
}

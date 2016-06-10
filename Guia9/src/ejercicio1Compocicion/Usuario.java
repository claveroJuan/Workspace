/**
 * 
 */
package ejercicio1Compocicion;

/**
 * @author JuanClavero
 *
 */
public class Usuario 
{

	private String nombreUsuario;
	private String password;
	private Perfil perfil;
	/**
	 * 
	 */
	public Usuario() {
	
	}
	/**
	 * @param nombreUsuario
	 * @param password
	 * @param perfil
	 */
	public Usuario(String nombreUsuario, String password, Perfil perfil) {
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.perfil = perfil;
	}
	/**
	 * @return the nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	/**
	 * @param nombreUsuario the nombreUsuario to set
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the perfil
	 */
	public Perfil getPerfil() {
		return perfil;
	}
	/**
	 * @param perfil the perfil to set
	 */
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
}

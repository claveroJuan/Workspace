/**
 * 
 */
package ejercicio1Compocicion;

/**
 * @author JuanClavero
 *
 */
public class Perfil
{

	
	private String nombrePerfil;
	private String descripcion;
	private Permiso permiso;
	/**
	 * 
	 */
	public Perfil() {
	}
	/**
	 * @param nombrePerfil
	 * @param descripcion
	 * @param permiso
	 */
	public Perfil(String nombrePerfil, String descripcion, Permiso permiso) {
		this.nombrePerfil = nombrePerfil;
		this.descripcion = descripcion;
		this.permiso = permiso;
	}
	/**
	 * @return the nombrePerfil
	 */
	public String getNombrePerfil() {
		return nombrePerfil;
	}
	/**
	 * @param nombrePerfil the nombrePerfil to set
	 */
	public void setNombrePerfil(String nombrePerfil) {
		this.nombrePerfil = nombrePerfil;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the permiso
	 */
	public Permiso getPermiso() {
		return permiso;
	}
	/**
	 * @param permiso the permiso to set
	 */
	public void setPermiso(Permiso permiso) {
		this.permiso = permiso;
	}
	
	public void imprimir()
	{
		System.out.println("Perfil.");
		System.out.println(" ");
		System.out.println("Nombre del perfil: "+getNombrePerfil());
		System.out.println("Descripcion: "+getDescripcion());
		System.out.println(" ");
		System.out.println("Permisos.");
		System.out.println(" ");
		System.out.println("Nombre permiso: "+getPermiso().getNombrePermiso());
		System.out.println("Identificador: "+getPermiso().getIdentificador());
		System.out.println("Descripcion: "+getPermiso().getDescripcion());
		
	}

}

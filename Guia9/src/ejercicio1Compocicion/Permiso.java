/**
 * 
 */
package ejercicio1Compocicion;

/**
 * @author JuanClavero
 *
 */
public class Permiso 
{

	private String nombrePermiso;
	private int identificador;
	private String descripcion;
	/**
	 * 
	 */
	public Permiso() {
		
	}
	/**
	 * @param nombrePermiso
	 * @param identificador
	 * @param descripcion
	 */
	public Permiso(String nombrePermiso, int identificador, String descripcion) {
		this.nombrePermiso = nombrePermiso;
		this.identificador = identificador;
		this.descripcion = descripcion;
	}
	/**
	 * @return the nombrePermiso
	 */
	public String getNombrePermiso() {
		return nombrePermiso;
	}
	/**
	 * @param nombrePermiso the nombrePermiso to set
	 */
	public void setNombrePermiso(String nombrePermiso) {
		this.nombrePermiso = nombrePermiso;
	}
	/**
	 * @return the identificador
	 */
	public int getIdentificador() {
		return identificador;
	}
	/**
	 * @param identificador the identificador to set
	 */
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
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
}

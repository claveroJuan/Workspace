package ejercicio1.guia9;

public class Persona
{
	private String nombre;
	private String apellido;
	private String telefono;
	
	public Persona ()
	{
		this.nombre="juan";
		this.apellido="clavero";
		this.telefono="968712839";
		
	}

	/**
	 * @param nombre
	 * @param apellido
	 * @param telefono
	 */
	public Persona(String nombre, String apellido, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public boolean validarTelefono ()
	{
		
			return (this.telefono.length()==9);
		
	}
	public void imprimir()
	{
		System.out.println("nombre :" +this.nombre+" "+
	                        "apellido :" +this.apellido+" "+
				             "telefono :"+this.telefono); 
	}
}

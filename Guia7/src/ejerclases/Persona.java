
package ejerclases;

 /**
 * @author JuanClavero
 *
 */
public class Persona
 {
	 
	String nombre;
	String apellidoPaterno;
	String apellidoMaterno;
	int edad;
	
	
	public Persona()
	{
		this.nombre= "juan";
		this.apellidoPaterno="clavero";
		this.apellidoMaterno="de oliveira";
		this.edad=21;
	}
	public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, int edad) {
	
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.edad = edad;
	}
	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void imprimir ()
	{
		System.out.println(this.nombre+"\n"
				           + this.apellidoPaterno+"\n"
				           +this.apellidoMaterno+"\n"
				           + this.edad);
	}
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
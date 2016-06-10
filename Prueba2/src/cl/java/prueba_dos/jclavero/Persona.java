/**
 * 
 */
package cl.java.prueba_dos.jclavero;

/**
 * @author JuanClavero
 *
 */
public class Persona {

	private String nombre;
	private String rut;
	private int edad;
	private double peso;
	private double altura;
	/**
	 * constructor por defecto
	 */
	public Persona(){
		this.nombre = "juan";
		this.rut = "21424472-1";
		this.edad = 21;
		this.peso = 65;
		this.altura =1.82 ;
	}
	/**
	 * @param nombre
	 * @param rut
	 * @param edad
	 * @param peso
	 * @param altura
	 */
	public Persona(String nombre, String rut, int edad, int peso, int altura) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}
	public double calcularIMC(){
		double pesoIdeal=(this.peso/( this.altura*this.altura));
		return pesoIdeal;
		
	}
	public boolean esMayorDeEdad(){
		return (this.edad>=18);
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
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}
	/**
	 * @param rut the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}
	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
}

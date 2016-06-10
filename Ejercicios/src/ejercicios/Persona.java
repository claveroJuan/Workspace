package ejercicios;

public class Persona
{

	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private int edad;
	
	public Persona ()
	{
		this.nombre="juan";
		this.apellidoMaterno="de oliveira";
		this.apellidoPaterno="clavero";
		this.edad=21;
		
	}

	public Persona(String nombrex, String apellidoPaternox, String apellidoMaternox, int edadx) {
		super();
		this.nombre = nombrex;
		this.apellidoPaterno = apellidoPaternox;
		this.apellidoMaterno = apellidoMaternox;
		this.edad = edadx;
	}
	public void imprimir ()
	{
		System.out.println("nombre :"+ this.nombre);
		System.out.println("apellido paterno :"+ this.apellidoPaterno);
		System.out.println("apellido materno :"+ this.apellidoMaterno);
		System.out.println("edad :"+ this.edad);
	}
	
	
}

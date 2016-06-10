package herencia;

public class Profesor extends Persona 
{

	private String[] cursos;
	
	public Profesor (String[] cursos)
	{
		super();
		this.cursos=cursos;
	}

	/**
	 * @param cursos
	 */
	public Profesor(String nombre, String apellidoPaterno,String apellidoMaterno,String rut,String[]cursos)
	{
		super(nombre,apellidoPaterno,apellidoMaterno,rut);
		this.cursos = cursos;
	}
	
}

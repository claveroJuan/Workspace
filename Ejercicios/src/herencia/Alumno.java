package herencia;

public class Alumno extends Persona
{
private int[] notas;

public Alumno()
{
	super();
}

/**
 * @param nombre
 * @param apellidoPaterno
 * @param apellidoMaterno
 * @param rut
 */
public Alumno(String nombre, String apellidoPaterno, String apellidoMaterno, String rut,int[] notas) {
	super(nombre, apellidoPaterno, apellidoMaterno, rut);
	this.notas=notas;
}
}
package compocicion;
public class Alumno 
{
	private String nombre;
	private Nota[] nota;
	

public Alumno ()
{}


/**
 * @param nombre
 * @param nota
 */
public Alumno(String nombre, Nota[] nota) {
	super();
	this.nombre = nombre;
	this.nota = nota;
}

public double calcularPrpomedio ()
{
	double notaFinal=0;
	for (int i =0; i<this.getNota().length;i++)
	{
 double nota =(this.getNota()[i].getNota()*this.getNota()[i].getPorcentaje())/100; //valor de la nota en el arreglo
 notaFinal= notaFinal +nota;
	}
	return notaFinal;
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
 * @return the nota
 */
public Nota[] getNota() {
	return nota;
}


/**
 * @param nota the nota to set
 */
public void setNota(Nota[] nota) {
	this.nota = nota;
}






}
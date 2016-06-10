/**
 * 
 */
package cl.java.prueba_dos.jclavero;

/**
 * @author JuanClavero
 *
 */
public class Curso implements Imprimible {

	private String nombre;
	private Alumno[] alumno;

	/*
	 * calcular promedio
	 */
	public double calcularPromedioCurso() {
		double notaFinal = 0;
		double promCurso = 0;
		for (int i = 0; i < this.getAlumno().length; i++) {
			double nota = (this.getAlumno()[i].getPromedio());
			notaFinal = notaFinal + nota;
			promCurso = notaFinal / this.alumno.length;

		}
		return promCurso;

	}

	/*
	 * obtener mejor promedio
	 */
	public double obtenerMejorPromedio() {

		double notaMayor = 0;
		for (int i = 0; i <= this.getAlumno()[i].getPromedio(); i++) {

			if (this.getAlumno()[i].getPromedio() > notaMayor) {
				notaMayor = this.getAlumno()[i].getPromedio();
			}
		}

		return notaMayor;

	}

	/**
	 * costructor por defecto
	 */
	public Curso() {
		this.nombre = "java";

	}

	/**
	 * @param nombre
	 * @param alumno
	 */
	public Curso(String nombre, Alumno[] alumno) {
		super();
		this.nombre = nombre;
		this.alumno = alumno;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the alumno
	 */
	public Alumno[] getAlumno() {
		return alumno;
	}

	/**
	 * @param alumno
	 *            the alumno to set
	 */
	public void setAlumno(Alumno[] alumno) {
		this.alumno = alumno;
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.println(this.nombre + " " + this.getAlumno());

	}

}

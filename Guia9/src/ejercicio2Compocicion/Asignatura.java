package ejercicio2Compocicion;

public class Asignatura 
{

	private String nombreAsignatura;
	private String nombreProfesor;
	private Alumno[] listaAlumnos;
	
	
	
	/**
	 * 
	 */
	public Asignatura() {
	}

	

	/**
	 * @param nombreAsignatura
	 * @param nombreProfesor
	 * @param listaAlumnos
	 */
	public Asignatura(String nombreAsignatura, String nombreProfesor, Alumno[] listaAlumnos) {
		this.nombreAsignatura = nombreAsignatura;
		this.nombreProfesor = nombreProfesor;
		this.listaAlumnos = listaAlumnos;
	}



	/**
	 * @return the nombreAsignatura
	 */
	public String getNombreAsignatura() {
		return nombreAsignatura;
	}

	/**
	 * @param nombreAsignatura the nombreAsignatura to set
	 */
	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}

	/**
	 * @return the nombreProfesor
	 */
	public String getNombreProfesor() {
		return nombreProfesor;
	}

	/**
	 * @param nombreProfesor the nombreProfesor to set
	 */
	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}

	/**
	 * @return the listaAlumnos
	 */
	
	/**
	 * @return the listaAlumnos
	 */
	public Alumno[] getListaAlumnos() {
		return listaAlumnos;
	}

	/**
	 * @param listaAlumnos the listaAlumnos to set
	 */
	public void setListaAlumnos(Alumno[] listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}
	
	
	public String toString()
	{
		String aux = "\nAsignatura."
				+"\n"
				+"\nNombre de asignatura: "+getNombreAsignatura()
				+"\nNombre del profesor: "+getNombreProfesor()
				+"\n"
				+"\nLista de alumnos."
				+"\n";
		
		for (int i = 0; i < listaAlumnos.length; i++) {
		
			aux = aux + listaAlumnos[i].toString();
		}
			return aux;
	}

	

}

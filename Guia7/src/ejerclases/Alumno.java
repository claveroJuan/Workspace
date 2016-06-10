package ejerclases;

public class Alumno {

	String nombre;
	int nota1;
	int nota2;
	int nota3;
	int promedio;
	public Alumno ()
	{
		this.nombre="juan";
		this.nota1=4;
		this.nota2=4;
		this.nota3=4;
		
	}
	public Alumno(String nombre, int nota1, int nota2, int nota3) {
	
		this.nombre = nombre;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	public int promedio (int nota1, int nota2, int nota3)
	{
		int promedio;
			 promedio=(nota1+nota2+nota3)/3;
			return promedio;	
		
	}
	public void imprimir ()
	{
		System.out.println("nombre :" +this.nombre+"\n"
				           + "promedio : " + promedio+ "\n"
				           );
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNota1() {
		return nota1;
	}
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	public int getNota2() {
		return nota2;
	}
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	public int getNota3() {
		return nota3;
	}
	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}
	
	
}

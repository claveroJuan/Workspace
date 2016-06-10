package cl.cursos.java.control;

public class priogramaLibro {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("caperucita roja",4,5);
		libro1.prestarLibro();
		libro1.devolverLibro();
		libro1.imprimir();
		

	}

}

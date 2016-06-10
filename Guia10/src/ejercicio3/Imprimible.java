/**
 * 
 */
package ejercicio3;

/**
 * @author JuanClavero
 *
 */
public interface Imprimible {

	public static void main (String[]args)
	{
		Libro libro = new Libro("el alquimista", "Antartica");
		Revista revista = new Revista(5, "el cañamo", "el feo");
		libro.imprimible();
		System.out.println("---------------------");
		revista.imprimible();
		
		
	}
	public void imprimible();
}
/*
 * •	El método imprimir, imprimira todos los atributos de la clase por consola.
 */
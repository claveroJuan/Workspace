package cl.curso.java.prueba_tres.Decorador;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	PizzaMasaTradicional pizzaMasaTradicional = new PizzaMasaTradicional();
    	PizzaDecorador decorador = new PizzaDecorador();
    	decorador.setPizzaDecorador(pizzaMasaTradicional);
      
    }
}

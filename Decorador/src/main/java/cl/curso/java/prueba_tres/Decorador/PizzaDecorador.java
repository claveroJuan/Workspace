/**
 * 
 */
package cl.curso.java.prueba_tres.Decorador;

/**
 * @author JuanClavero
 *
 */
public class PizzaDecorador implements PizzaTarget {

	PizzaTarget pizzaDecorador;
	
	/**
	 * @param pizzaDecorador
	 */
	public PizzaDecorador() {
		// TODO Auto-generated constructor stub
	}
	public PizzaDecorador(PizzaTarget pizzaDecorador) {
		super();
		this.pizzaDecorador = pizzaDecorador;
	}

	public void cocinarPizzza() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return the pizzaDecorador
	 */
	public PizzaTarget getPizzaDecorador() {
		return pizzaDecorador;
	}

	/**
	 * @param pizzaDecorador the pizzaDecorador to set
	 */
	public void setPizzaDecorador(PizzaTarget pizzaDecorador) {
		this.pizzaDecorador = pizzaDecorador;
	}
}

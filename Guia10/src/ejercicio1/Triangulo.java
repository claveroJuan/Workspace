/**
 * 
 */
package ejercicio1;

/**
 * @author JuanClavero
 *
 */
public class Triangulo  extends FiguraGeometrica {

	/**
	 * @return the base
	 */
	public int getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(int base) {
		this.base = base;
	}

	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	private int base;
	private int altura;
	
	public Triangulo(){
		
	}
	
	/**
	 * @param color
	 * @param cantidadLados
	 */
	public Triangulo(String color, int cantidadLados,int base,int altura) {
		super(color, cantidadLados);
		this.altura=altura;
		this.base=base;
	
		// TODO Auto-generated constructor stub 
	}


	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
	System.out.println("/_\\");
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (this.altura*this.base)/2;
	}

	

}

/**
 * 
 */
package ejercicio1;

/**
 * @author JuanClavero
 *
 */
public class Cuadrado extends FiguraGeometrica {

	private int lado;
	
	public Cuadrado (){
		
	}
	
	/**
	 * @param color
	 * @param cantidadLados
	 */
	public Cuadrado(String color, int cantidadLados,int lado) {
		super(color, cantidadLados);
		this.lado=lado;
		// TODO Auto-generated constructor stub
	}


	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		System.out.println("[]");
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.pow(this.lado, 2);
	}

	/**
	 * @return the lado
	 */
	public int getLado() {
		return lado;
	}

	/**
	 * @param lado the lado to set
	 */
	public void setLado(int lado) {
		this.lado = lado;
	}

}

/**
 * 
 */
package ejercicio1;
/**
 * @author JuanClavero
 *
 */
public class Circulo extends FiguraGeometrica {

	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}

	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}

	private double radio;

	
	public Circulo (){
		
	}
	
	/**
	 * @param color
	 * @param cantidadLados
	 */
	public Circulo(String color, int cantidadLados,double radio) {
		super(color, cantidadLados);
		this.radio=radio;
		// TODO Auto-generated constructor stub
	}


	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		System.out.println("O");
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (this.radio* 2)*Math.PI;
	}

	

}

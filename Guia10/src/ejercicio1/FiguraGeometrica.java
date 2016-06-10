/**
 * 
 */
package ejercicio1;

/**
 * @author JuanClavero
 *
 */
public abstract class FiguraGeometrica {

	private String color;
	private int cantidadLados;
	/*
	 * constructor por defecto.
	 */
	public FiguraGeometrica()
	{
		
	}
	
	/**
	 * @param color
	 * @param cantidadLados
	 */
	public FiguraGeometrica(String color, int cantidadLados) {
		super();
		this.color = color;
		this.cantidadLados = cantidadLados;
	}

	/*
	 * metodo dibujar figura
	 */
	public abstract void dibujar();
	
	/*
	 * metodo calcular area figura
	 */
	public abstract double calcularArea();
	

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the cantidadLados
	 */
	public int getCantidadLados() {
		return cantidadLados;
	}

	/**
	 * @param cantidadLados the cantidadLados to set
	 */
	public void setCantidadLados(int cantidadLados) {
		this.cantidadLados = cantidadLados;
	}
}

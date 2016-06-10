/**
 * 
 */
package ejercicio1;

/**
 * @author JuanClavero
 *
 */
public class ProgramaFigura {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circulo circulo =new Circulo("rojo", 0,5);
		Cuadrado cuadrado=new Cuadrado("verde", 4,4);
		Triangulo triangulo = new Triangulo("violeta", 3,4,5);
		circulo.dibujar(); cuadrado.dibujar(); triangulo.dibujar();
		System.out.println("area circulo :"+circulo.calcularArea()+"\n"
				+"area cuadrado :" +cuadrado.calcularArea()+"\n"
				 +"area triangulo :"+triangulo.calcularArea());
		}

}
/*
 * •	Area de un cuadrado es igual al lado al cuadrado
 */
/*
 * •	Area de un circulo es PI por Radio al cuadrado.
 */
//•	Area de un triangulo es base por altura.

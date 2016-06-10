/**
 * 
 */
package ejercicio5;

/**
 * @author JuanClavero
 *
 */
public interface Desplazable {

	public static void main (String[] args){
		
		Barco barco = new Barco(133, "mata ratas", "rrata");
		Moto moto = new Moto("barco chulo", "feo");
		barco.desplazar(50);
		moto.desplazar(160);
	}
	public void desplazar(int km);
}
/*
 * •	Cada vehiculo, debe imprimir por consola, cual es la forma en la que se desplaza 
 */
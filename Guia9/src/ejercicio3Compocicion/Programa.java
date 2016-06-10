package ejercicio3Compocicion;

public class Programa 
{

	public static void main(String[] args) {

		Producto producto1 = new Producto("rata","tuile", 4, 2000);
		Producto producto2 = new Producto("detergente","omo", 3, 1000);
		Producto producto3 = new Producto("rolex","reloj", 15, 2500);
		
		Producto[] listaProd = new Producto[]{producto1, producto2, producto3};
		Tienda farmacia = new Tienda("clonazepan", "Farmacia", listaProd);
		
		System.out.println(farmacia.toString());
	}

}

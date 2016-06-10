package ejercicio2;

public class VenderAuto {

	public static void main(String[] args) 
	{
	
	Auto auto = new Auto();
	auto.vender(8);
	System.out.println("stock :" +auto.getCantidadVender());

	}

}

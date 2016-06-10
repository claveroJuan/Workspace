package ejercicio2;

public class Cafetera {

	int capacidadMaxima;
	int cantidadActual;
	int cantidadCafe;
	
	public Cafetera ()
	{
		this.capacidadMaxima=1000; //ml
	}
	public Cafetera (int cantidadActual)
	{
		this.cantidadActual=this.capacidadMaxima;
	}
	public Cafetera (int cantidadActual, int cantidadMaxima)
	{
		if (this.cantidadActual>this.capacidadMaxima)
		{
	    this.cantidadActual=this.capacidadMaxima;
		}
	}
	public void llenarCafetera()
	{
		  this.cantidadActual=this.capacidadMaxima;
	}
	public void servirTasa(int cc)
	{
		
		if (cc<this.cantidadActual)
		{
		this.cantidadActual= this.cantidadActual-cc;
			
		}
		else
		{
			this.cantidadActual=0;
		}
		System.err.println("cantidad de cafe servido :" + cc);
	}
	public void vaciarCafetera()
	{
		this.cantidadActual=0;
	}
	public void agregarCAfe(int gr)
	{
	
		this.cantidadCafe=gr;
	}
	public void imprimir ()
	{
		System.out.println("cantidad actual en cafetera :"+ this.cantidadActual + "\n"
				            + "cantidad de cafe en cafetera :"+ this.cantidadCafe);
	}

	
	
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	public int getCantidadCafe() {
		return cantidadCafe;
	}
	public void setCantidadCafe(int cantidadCafe) {
		this.cantidadCafe = cantidadCafe;
	}
	
	
	
	
	
	
}

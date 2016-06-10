package ejerclases2;

public class Calculadora {

	private int numero1;
	private int numero2;
    int  suma=0;
	int resta=0;
	int multiplicar=0;
	int dividir=0;

	public Calculadora()
	{
		
	}
	public Calculadora (int numero1, int numero2)
	{
		this.numero1=numero1;
		this.numero2=numero2;
	}
	public int sumar ()
	{
		 //this.suma = numero1+numero2;
		return this.numero1+this.numero2;
	}
	public int  restar ()
	{
		//this.resta = numero1-numero2;
		return this.numero1-this.numero2;
	}
	public int multiplicar()
	{
		 //this.multiplicar = numero1*numero2;
		return this.numero1*this.numero2;
	}
	public int dividir ()
	{
		//this.dividir = numero1/numero2;
		return this.numero1/this.numero2;
	}
	      public int getNumero1() {
		return numero1;
	}
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	public int getNumero2() {
		return numero2;
	}
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
		
}

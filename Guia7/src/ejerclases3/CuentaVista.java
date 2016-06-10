package ejerclases3;

public class CuentaVista {

	private int saldo;
	private int giroMaximo;

	//constructores
	public CuentaVista ()
	{
		this.saldo=0;
		this.giroMaximo=200000;	
	}
	public CuentaVista(int saldo, int giroMaximo) {
		super();
		this.saldo = saldo;
		this.giroMaximo = giroMaximo;
	}
	public void depositar (int montoDepositar)
	{
		this.saldo=this.saldo+montoDepositar;
	}
	public void girar (int montoGirar)
	{
		  if (montoGirar>this.saldo)
		  {
			  System.out.println("error");
		  }
		  else
		  {
			  if (montoGirar<this.saldo)
			  {
				  this.saldo=this.saldo-montoGirar;
			  }
			  else
			  {
				 System.out.println("error"); 
				  
			  }
		  }
	}
	//Getter and Setter

	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public int getGiroMaximo() {
		return giroMaximo;
	}
	public void setGiroMaximo(int giroMaximo) {
		this.giroMaximo = giroMaximo;
	}
	
}

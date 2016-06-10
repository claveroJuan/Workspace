package bip;

public class TarjetaEstudiante extends TarjetaBip
{

	public TarjetaEstudiante() {
		
	}
	

	@Override
	public void cargar(int monto) {
		// TODO Auto-generated method stub
		int nuevoSaldo=this.getSaldo()+monto;
		if (nuevoSaldo<=10000){
		this.setSaldo(nuevoSaldo);}
		else
		{
			System.out.println("tope maximo es 10.000");
		}
		
	}

	@Override
	public void pagarPasaje() {
		// TODO Auto-generated method stub
		if (this.getSaldo()>0)	
		{
			this.setSaldo(this.getSaldo()-210);
		}
		else
		{
			System.out.println("saldo insufucuiente");
		}
		
	}
	public void imprimir ()
	{
		System.out.println(this.getSaldo());
	}
	
	

}

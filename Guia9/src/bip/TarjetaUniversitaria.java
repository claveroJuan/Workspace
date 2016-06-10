package bip;

public class TarjetaUniversitaria extends TarjetaBip
{

	
	@Override
	public void cargar(int monto) {
		// TODO Auto-generated method stub

		int nuevoSaldo=this.getSaldo()+monto;
		if (nuevoSaldo<=10000){
		System.out.println(nuevoSaldo);}
		this.setSaldo(nuevoSaldo);
	
	}

	@Override
	public void pagarPasaje() {
		// TODO Auto-generated method stub
		this.setSaldo(this.getSaldo()-210);
		
	}
	public void imprimir ()
	{
		System.out.println(this.getSaldo());
	}
}

package bip;



public class TarjetaClasica extends TarjetaBip implements Pagable

{
	
	public TarjetaClasica ()
	{
		
	}

	public void pagable()
	{
		
	}
	/**
	 * @param saldo
	 * @param color
	 * @param nTarjeta
	 */
	public TarjetaClasica(int saldo, String color, int nTarjeta) {
		super(saldo, color, nTarjeta);
	}






	@Override
	public void cargar(int monto) {
            
			int nuevoSaldo=this.getSaldo()+monto;
			if (nuevoSaldo<=25000)
			{
				this.setSaldo(nuevoSaldo);
			}
			else
			{
				System.out.println("tope maximo es 25.000");
			}
		
		
	}

	@Override
	public void pagarPasaje() {
		int pasajeClasico=(this.getSaldo()-710);
		if(this.getSaldo()> pasajeClasico)	
		{
			this.setSaldo(pasajeClasico);
		}
		
		
		
	}

	public void imprimir ()
	{
		System.out.println(this.getSaldo());
		System.out.println(this.getnTarjeta());
	}
	


}

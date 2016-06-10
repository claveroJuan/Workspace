package ejercicio1;

public class CuentaBancaria {
	
int saldoInicial;


public CuentaBancaria()
{
	  this.saldoInicial=0;
}
public int getSaldoInicial()
{
	return saldoInicial;
}

public void setSaldoInicial(int saldoInicial)
{
	this.saldoInicial = saldoInicial;
}
public void abonar(int monto)
{
	saldoInicial=saldoInicial+monto;
}
public void retirar (int monto)
{
	if (monto<=saldoInicial)
	{
	saldoInicial=saldoInicial-monto;
	}
	else {
		System.err.println("error");
	}
}
public void imprimir()
{
	System.out.println("monto en cuenta :" +this.saldoInicial);
}

}

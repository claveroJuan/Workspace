/**
 * 
 */
package bip;

/**
 * @author JuanClavero
 *
 */
public abstract class TarjetaBip 
{

	private int saldo;
	private  String color;
	private int nTarjeta;
	
	public  TarjetaBip ()
	{
		
	}
	
	/**
	 * @param saldo
	 * @param color
	 * @param nTarjeta
	 */
	public TarjetaBip(int saldo, String color, int nTarjeta) {
		super();
		this.saldo = saldo;
		this.color = color;
		this.nTarjeta = nTarjeta;
	}

	public abstract void cargar(int monto);
	public abstract void pagarPasaje ();
	/**
	 * @return the saldo
	 */
	public int getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the nTarjeta
	 */
	public int getnTarjeta() {
		return nTarjeta;
	}
	/**
	 * @param nTarjeta the nTarjeta to set
	 */
	public void setnTarjeta(int nTarjeta) {
		this.nTarjeta = nTarjeta;
	}

	public void imprimir ()
	{
		System.out.println(this.nTarjeta);
		System.out.println(this.saldo);
	}

}

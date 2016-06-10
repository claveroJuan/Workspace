/**
 * 
 */
package ejercicio3;

/**
 * @author JuanClavero
 *
 */
public class VendedorMain
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Vendedor vendedor = new Vendedor ("patricio ", 1, 1, 1000);
		System.out.println(vendedor.getNombre()+vendedor.getArtVendidos()+" "+vendedor.comision(100000));
	}

}

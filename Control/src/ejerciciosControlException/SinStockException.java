/**
 * 
 */
package ejerciciosControlException;

/**
 * @author JuanClavero
 *
 */
public class SinStockException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3100936264661091911L;

	public SinStockException(String message)
	{
		super(message);
	}
}

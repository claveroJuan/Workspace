/**
 * 
 */
package dividiendo;

/**
 * @author JuanClavero
 *
 */
public class Division {

	private int divisor;
	private int dividendo;
	
	public Division (int divisor, int dividendo)
	{
		this.dividendo=dividendo;
		this.divisor=divisor;
	}

	public int  hacerDivision()
	{
		
		return (this.dividendo/this.divisor);
	}

	/**
	 * @return the divisor
	 */
	public int getDivisor() {
		return divisor;
	}

	/**
	 * @param divisor the divisor to set
	 */
	public void setDivisor(int divisor) {
		this.divisor = divisor;
	}

	/**
	 * @return the dividendo
	 */
	public int getDividendo() {
		return dividendo;
	}

	/**
	 * @param dividendo the dividendo to set
	 */
	public void setDividendo(int dividendo) {
		this.dividendo = dividendo;
	}
	
	
}

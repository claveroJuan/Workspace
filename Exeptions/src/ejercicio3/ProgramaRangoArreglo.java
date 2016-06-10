/**
 * 
 */
package ejercicio3;

/**
 * @author JuanClavero
 *
 */
public class ProgramaRangoArreglo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String str[] = { "foo" };
			String funcionStr = str[10];
			System.out.println(funcionStr);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.getMessage();
			System.out.println("error java.lang.ArrayIndexOutOfBoundsException");
		}

	}

}

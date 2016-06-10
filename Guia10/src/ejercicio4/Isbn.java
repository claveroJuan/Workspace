/**
 * 
 */
package ejercicio4;

/**
 * @author JuanClavero
 *
 */
public class Isbn implements Validable {

	private int numero;
	private String digitoVerificador;

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the digitoVerificador
	 */
	public String getDigitoVerificador() {
		return digitoVerificador;
	}

	/**
	 * @param digitoVerificador
	 *            the digitoVerificador to set
	 */
	public void setDigitoVerificador(String digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

	public Isbn() {

	}

	/**
	 * @param numero
	 * @param digitoVerificador
	 */
	public Isbn(int numero, String digitoVerificador) {
		super();
		this.numero = numero;
		this.digitoVerificador = digitoVerificador;
	}

	@Override
	public boolean validar() {
		int m = 2;
		int isbn = this.numero;
		int suma = 0;
		for (int i = 1; i <= 9; i++) {
			int n = isbn % 10;
			isbn = isbn / 10;
			suma = suma + (n * m);
			m++;

			if (suma % 11 == 0) {
				this.digitoVerificador = "0";
			} else if (suma % 11 == 10) {
				this.digitoVerificador = "X";
			} else {
				return false;

			}

		}
		return true;

	}
	/*
	 * 
	 * Los libros publicados tienen un código de 10 dígitos, usualmente
	 * localizado en la contraportada. El décimo dígito es un dígito de
	 * verificación. A este dígito se le conoce como checksum (o “suma de
	 * verificación”.) Esto significa que si solicitas un libro utilizando su
	 * ISBN (International Standard Book Number), la editorial puede verificar
	 * que no hayas cometido un error. Ellos simplemente verifican el dígito de
	 * checksum. A continuación se muestra cómo funciona el dígito de checksum:
	 * Multiplica el primer dígito por 10, el segundo por nueve, y así
	 * sucesivamente, hasta multiplicar el noveno dígito por dos. Luego suma los
	 * valores. Por ejemplo, el ISBN 0-13-911991-4 da el siguiente valor (0 ×
	 * 10) + (1 × 9) + (3 × 8) + (9 × 7) + (1 × 6) + (1×5)+(9×4)+(9×3)+(1×2) =
	 * 172 Luego divide el resultado por 11. ¿Cuál es el residuo? 172 ÷ 11 = 15
	 * residuo 7 Si el residuo es cero, entonces el dígito de checksum es cero,
	 * de otra manera sustrae el residuo de 11 para obtener el dígito de
	 * checksum (11–7= 4). Es posible que lleguemos a obtener un valor de
	 * checksum de 10, lo cual requiere de un dígito más. Cuando esto sucede, se
	 * utiliza el carácter X
	 */
}

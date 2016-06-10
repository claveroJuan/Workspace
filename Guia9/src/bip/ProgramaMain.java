
/**
 * 
 */
package bip;

import java.util.Calendar;
import java.util.Date;

/**
 * @author JuanClavero
 *
 */
public class ProgramaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal =Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 29);
		cal.set(Calendar.MONTH, 29);
		cal.set(Calendar.YEAR, 2016);
	
		Date date = cal.getTime();
		System.out.println(date);
				
		TarjetaClasica clasica = new TarjetaClasica(1000, "", 123);
		clasica.imprimir();
		
		clasica.pagarPasaje();
		clasica.pagarPasaje();
		//clasica.pagarPasaje();
		clasica.imprimir();
		

	}

}

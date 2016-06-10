/**
 * 
 */
package cl.curso.java.PatronBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JuanClavero
 *
 */
public class BuilderAutoTesla extends BuilderAuto {
	public BuilderAutoTesla() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Auto construir() {
		// TODO Auto-generated method stub
		List<Rueda> ruedas = new ArrayList<Rueda>();
		ruedas.add(new Rueda());
		ruedas.add(new Rueda());
		ruedas.add(new Rueda());
		ruedas.add(new Rueda());
		Auto auto = new Auto();
		auto.setMarca("tesla");
		auto.setModelo("tesla123");
		auto.setMotor(new Motor());// new + el nombrede la clase donde sta
									// elmotor
		auto.setGPS(new Gps());
		auto.setRuedas(ruedas);
		return null;
	}
}

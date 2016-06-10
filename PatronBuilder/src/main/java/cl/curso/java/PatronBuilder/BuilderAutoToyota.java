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
public class BuilderAutoToyota extends BuilderAuto {

	public BuilderAutoToyota() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Auto construir() {
		List<Rueda> ruedas = new ArrayList<Rueda>();
		ruedas.add(new Rueda());
		ruedas.add(new Rueda());
		ruedas.add(new Rueda());
		ruedas.add(new Rueda());
		Auto auto = new Auto();
		auto.setMarca("TOYOTA");
		auto.setModelo("TOYOTA123");
		auto.setMotor(new Motor());// new + el nombrede la clase donde sta
									// elmotor
		auto.setGPS(new Gps());
		auto.setRuedas(ruedas);
		// TODO Auto-generated method stub
		return null;
	}
}

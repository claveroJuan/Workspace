/**
 * 
 */
package cl.curso.java.PatronBuilder;

/**
 * @author JuanClavero
 *
 */
public class Director {

	BuilderAuto builderAuto;

	public Director() {
		// TODO Auto-generated constructor stub
	}
	public Auto construirAuto(){
		return builderAuto.construir();
		
	}
}

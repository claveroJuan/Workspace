/**
 * 
 */
package seleccionChilena;

import java.util.ArrayList;

/**
 * @author JuanClavero
 *
 */
public class Programa {

	private static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleccionFutbol bravo = new Futbolista(2,"claudio","bravo",31,1,"portero");
		SeleccionFutbol pizzi= new Entrenador(3,"rata","pizzi",43,"Argentino");
		SeleccionFutbol paraM= new Paramedicos(3,"jose","peres",36,10);
		//agregar a la lista de array
		integrantes.add(bravo);
		integrantes.add(pizzi);
		integrantes.add(paraM);
		

		System.out.println("comportamiento general de la seleccion al concentrarce");
		for(SeleccionFutbol integrantes : integrantes)
		{
			System.out.println(integrantes.getNombre()+" "+integrantes.getApellidos()
			                          +" "+ integrantes.getEdad()+"--> "  );
			integrantes.concentrarce();
		} 
		System.out.println("comportamiento general de la seleccion al viajar");
		for(SeleccionFutbol integrantes : integrantes)
		{
			System.out.println(integrantes.getNombre()+" "+integrantes.getApellidos()
			                                          +" "+integrantes.getEdad()+"--->");
			integrantes.viajar();
			}
		

		System.out.println("comportamiento especifico a la hora de entrenar");
		for(SeleccionFutbol integrantes : integrantes)
		{
			System.out.println(integrantes.getNombre()+" "+integrantes.getApellidos()
			                                          +" "+ integrantes.getEdad()+"--->");
			integrantes.entrenar();
			}
		
	
	System.out.println("comportamiento especifico a la hora de un encuentro");
	for(SeleccionFutbol integrantes : integrantes)
	{
		System.out.println(integrantes.getNombre()+" "+integrantes.getApellidos()
		                                          +" "+ integrantes.getEdad()+"--->");
		integrantes.partidoFutbol();
		}
	System.out.println("comportamiento especifico a la hora de entrenar");
	for(SeleccionFutbol integrantes : integrantes)
	{
		System.out.println(integrantes.getNombre()+" "+integrantes.getApellidos()
		                                          +" "+ integrantes.getEdad()+"--->");
		integrantes.entrenar();
		}
	System.out.println("planificar partido");
	
	System.out.println(pizzi.getNombre()+" "+pizzi.getApellidos()
    +" "+ pizzi.getEdad()+"--->");
	((Entrenador)pizzi).planificarPartido();
	System.out.println("dar entrevista");
	
	System.out.println(bravo.getNombre()+" "+bravo.getApellidos()
    +" "+ bravo.getEdad()+"--->");
	((Futbolista)bravo).darEntrevista();
	System.out.println("ayudar en caso de lesiones");

	System.out.println(bravo.getNombre()+" "+bravo.getApellidos()
    +" "+ bravo.getEdad()+"--->");
	((Paramedicos)paraM).brindarAux();
	
	
	}
	
	
	
	


	/**
	 * 
	 */
	public Programa() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}

/**
 * 
 */
/**
 * @author JuanClavero
 *
 */
package cl.cursos.java.control;

public class ProgramaArticulos 
{
	public static void main (String []args)
	{
		
		Articulo articulo1= new Articulo ("auto",4000000);
	
		articulo1.setNombre("auto");
		articulo1.precioAlDetalle(4000000);
		articulo1.precioAlMayor(4000000);
		articulo1.imprimir();
		System.out.println("precio Articulo al detalle :"+ articulo1.getDetalle() );
		System.out.println("precio Articulo al mayor :"+ articulo1.getMayor());
		
		
		
	}
	
	
	
	
	
	
	
}
package cl.cursos.java.control;

public class Libro 
{

	private String titulo;
	private int numEjemplares;
	private int numEjemPrestados;
	private String prestamo;


	private String dev;
	
	
	public Libro(String titulo, int numEjemplares, int numEjemPrestados)
	{
		super();
		this.titulo = titulo;
		this.numEjemplares = numEjemplares;
		this.numEjemPrestados = numEjemPrestados;
	}
	public void  prestarLibro ()
	{
		boolean prestar =false;
		if (this.numEjemPrestados<this.numEjemplares)
		{
			prestar=!prestar;
			prestamo = "prestar libro";
		
		}
		else
		{
			prestamo = "no prestar libro";
		}
		
	}
	public void devolverLibro()
	{
		boolean devolucion=false;
		if (!devolucion)
		{
			dev = "libro devuelto";
		}
		else
		{
			dev = "libro no devuelto";
		}
	}
	public void imprimir ()
	{
		System.out.println("prestamo"+prestamo);
		System.out.println("devolucion :" +dev);
		System.out.println("titulo :" +titulo);
		System.out.println("n ejemplares :" +numEjemplares);
		System.out.println("prestados :" +numEjemPrestados);
		
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the numEjemplares
	 */
	public int getNumEjemplares() {
		return numEjemplares;
	}
	/**
	 * @param numEjemplares the numEjemplares to set
	 */
	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}
	/**
	 * @return the numEjemPrestados
	 */
	public int getNumEjemPrestados() {
		return numEjemPrestados;
	}
	/**
	 * @param numEjemPrestados the numEjemPrestados to set
	 */
	public void setNumEjemPrestados(int numEjemPrestados) {
		this.numEjemPrestados = numEjemPrestados;
	}
	/**
	 * @return the prestamo
	 */
	public String getPrestamo() {
		return prestamo;
	}
	/**
	 * @param prestamo the prestamo to set
	 */
	public void setPrestamo(String prestamo) {
		this.prestamo = prestamo;
	}
	
	}
	


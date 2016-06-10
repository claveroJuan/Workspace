package fecha;

public class Fecha 
{
	
	private int dia;
	private int mes;
	private int a�o;
	public final String[]nombreMeses={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiempbre","octubre","noviembre","diciembre"};
	public final int[] dias= {31,28,31,30,31,30,31,31,30,31,30,31};
	public Fecha()
	{
		this.dia=23;
		this.mes=5;
		this.a�o=1995;
		
	}
	/**
	 * @param dia
	 * @param mes
	 * @param a�o
	 */
	public Fecha(int dia, int mes, int a�o) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}
	/**
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}
	/**
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}
	/**
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}
	/**
	 * @param mes the mes to set
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}
	/**
	 * @return the a�o
	 */
	public int getA�o() {
		return a�o;
	}
	/**
	 * @param a�o the a�o to set
	 */
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	
		public boolean esBiciesto ()
		{
			if ((this.getA�o()%4==0 || this.getA�o()%400==0) && (this.getA�o()%100!=0 ))
			{
				return true;
			}
				else
				{
					return false;
						
				}
					
			}
		public void imprimirFecha()
		{
			System.out.println(this.getDia()+"-"+this.getMes()+"-"+this.getA�o());
		}
			
		public void imprimirFechaFormato()
		{
			String[]nombreMeses={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiempbre","octubre","noviembre","diciembre"};
			String nombreMes=nombreMeses[this.getMes()-1];
			System.out.println(
					this.getDia()+" de "+
			nombreMes+ " de "+
							this.getA�o());
		}
		public boolean validarDia ()
		{
			if (validarMes())
			{
			if(this.getMes()==2 && this.esBiciesto())
			{
				return (this.getMes()>=1 && this.getDia()<=29);
			}
			else
			{
				int cantDias=dias[this.getMes()-1];
			return this.getDia()>=1 && this.getDia()<=cantDias ;
			}
			}
			return false;
			
		}
		public boolean validarMes ()
		{
			return this.getMes()>=1 && this.getMes()<=12;
		}
			public String toString()
			{
				return this.getA�o() +" "+
			          this.getMes() +""+
						this.getDia()
			         ;
			}
			
	}


	
//	2.	Crear la Clase Fecha la cual tendra como atributos : dia , mes y a�o.
//	a.	Debe crear dos constructores uno que por defecto inicialice el dia en 23, el mes en 5 y el a�o en 1995.
//	b.	El segundo constructor debera permitir ingresar el dia, mes y a�o.
//	c.	Usar getters y Setter para cada atributo de la clase.
//	d.	Crear el metodo validarDia considerando que limite de dias depende del mes 
//    {31,28,31,30,31,30,31,31,30,31,30,31}, ademas si el a�o es bisiesto el mes de febrero puede tener 29 dias.
//	e.	Crear el metodo validarMes considere que los meses pueden ser entre 1 y 12.
//	f.	Crear el metodo para verificar si el a�o es bisiesto, metodo debe retorna un booleano.
//	g.	Crear un metodo que permita imprimir la fecha con el siguiente formato dd-mm-aaaa
//	h.	Crear un metodo que permita imprimir la fecha con el siguiente formato 23 de mayo de 1995. 





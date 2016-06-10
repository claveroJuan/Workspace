package fecha;

public class Fecha 
{
	
	private int dia;
	private int mes;
	private int año;
	public final String[]nombreMeses={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiempbre","octubre","noviembre","diciembre"};
	public final int[] dias= {31,28,31,30,31,30,31,31,30,31,30,31};
	public Fecha()
	{
		this.dia=23;
		this.mes=5;
		this.año=1995;
		
	}
	/**
	 * @param dia
	 * @param mes
	 * @param año
	 */
	public Fecha(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
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
	 * @return the año
	 */
	public int getAño() {
		return año;
	}
	/**
	 * @param año the año to set
	 */
	public void setAño(int año) {
		this.año = año;
	}
	
		public boolean esBiciesto ()
		{
			if ((this.getAño()%4==0 || this.getAño()%400==0) && (this.getAño()%100!=0 ))
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
			System.out.println(this.getDia()+"-"+this.getMes()+"-"+this.getAño());
		}
			
		public void imprimirFechaFormato()
		{
			String[]nombreMeses={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiempbre","octubre","noviembre","diciembre"};
			String nombreMes=nombreMeses[this.getMes()-1];
			System.out.println(
					this.getDia()+" de "+
			nombreMes+ " de "+
							this.getAño());
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
				return this.getAño() +" "+
			          this.getMes() +""+
						this.getDia()
			         ;
			}
			
	}


	
//	2.	Crear la Clase Fecha la cual tendra como atributos : dia , mes y año.
//	a.	Debe crear dos constructores uno que por defecto inicialice el dia en 23, el mes en 5 y el año en 1995.
//	b.	El segundo constructor debera permitir ingresar el dia, mes y año.
//	c.	Usar getters y Setter para cada atributo de la clase.
//	d.	Crear el metodo validarDia considerando que limite de dias depende del mes 
//    {31,28,31,30,31,30,31,31,30,31,30,31}, ademas si el año es bisiesto el mes de febrero puede tener 29 dias.
//	e.	Crear el metodo validarMes considere que los meses pueden ser entre 1 y 12.
//	f.	Crear el metodo para verificar si el año es bisiesto, metodo debe retorna un booleano.
//	g.	Crear un metodo que permita imprimir la fecha con el siguiente formato dd-mm-aaaa
//	h.	Crear un metodo que permita imprimir la fecha con el siguiente formato 23 de mayo de 1995. 





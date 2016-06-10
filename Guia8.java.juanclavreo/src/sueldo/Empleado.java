package sueldo;

public class Empleado 
{

	private String nombre;
	private String rut;
	private int sueldoBase;
	private int pagoHoraExtra;
	private int horasExtraRealizadas;
	/**
	 * @param nombre
	 * @param rut
	 * @param sueldoBase
	 * @param pagoHoraExtra
	 * @param horasExtraRealizadas
	 */
	public Empleado(String nombre, String rut, int sueldoBase, int pagoHoraExtra, int horasExtraRealizadas) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.sueldoBase = sueldoBase;
		this.pagoHoraExtra = pagoHoraExtra;
		this.horasExtraRealizadas = horasExtraRealizadas;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}
	/**
	 * @param rut the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}
	/**
	 * @return the sueldoBase
	 */
	public int getSueldoBase() {
		return sueldoBase;
	}
	/**
	 * @param sueldoBase the sueldoBase to set
	 */
	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	/**
	 * @return the pagoHoraExtra
	 */
	public int getPagoHoraExtra() {
		return pagoHoraExtra;
	}
	/**
	 * @param pagoHoraExtra the pagoHoraExtra to set
	 */
	public void setPagoHoraExtra(int pagoHoraExtra) {
		this.pagoHoraExtra = pagoHoraExtra;
	}
	/**
	 * @return the horasExtraRealizadas
	 */
	public int getHorasExtraRealizadas() {
		return horasExtraRealizadas;
	}
	/**
	 * @param horasExtraRealizadas the horasExtraRealizadas to set
	 */
	public void setHorasExtraRealizadas(int horasExtraRealizadas) {
		this.horasExtraRealizadas = horasExtraRealizadas;
	}
	public int sueldoBruto ()
	{
		int sueldo_bruto=this.sueldoBase+this.pagoHoraExtra;
		return sueldo_bruto;
	}
	public int sueldoLiquido (int sueldo_bruto)
	{
		double isapre = (sueldo_bruto*0.07);
		double afp= (sueldo_bruto*0.10);
		double sueldo_liquido =sueldo_bruto-(isapre+afp);
		return (int) sueldo_liquido;
	}
}
//3.	Crear la clase Empleado que tenga los siguientes atributos : nombre, rut, sueldoBase, pagoHoraExtra y horasExtrasRealizadas.
//a.	Crear un constructor permita ingresar todos los atributos de la clase.
//b.	Usar getters y Setter para cada atributo de la clase.
//c.	Crear el metodo para obtener el sueldo liquido. (Isapre 7% y AFP 10%)
//d.	Crear el metodo para obtener el sueldo bruto.

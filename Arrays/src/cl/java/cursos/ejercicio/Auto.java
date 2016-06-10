package cl.java.cursos.ejercicio;
public class Auto {
	String color ="";
	String marca="";
	String patente="";
	Motor motor; //motor como tipo de objeto motor
	int kmRecorridos=0;

	public int getKmRecorridos() {
		return kmRecorridos;
	}
	public void setKmRecorridos(int kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}
	public void encender()
	{
		this.motor.setEncendido(true);
	}
	/**
	 * @return the tipo
	 */
	/**
	 * @return the motor
	 */
	public Motor getMotor() {
		return motor;
	}
	/**
	 * @param motor the motor to set
	 */
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}

	public void escribir()
	{
		
		System.out.println(this.color+" "+this.marca +" "+this.patente + "km recorridos :"+ kmRecorridos);
	
	}

	public Auto()
	{
		color="azul";
		marca="honda";
		patente="xxdc52";
	}
	public Auto(String color, String marca, String patente)
	{
		this.color=color;
		this.marca=marca;
		this.patente=patente;
	}
	
	public void avanzar(int km)
	{
		if (this.motor.isEncendido())
		{
	
		System.out.println("avanzar " + this.marca );
		
		System.out.println("kilometros recorridos :" +km);
		this.kmRecorridos = this.kmRecorridos + km;
		}
		else
		{
		System.out.println("no esta encendido");
		}
		
		
	}
	

}

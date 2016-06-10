/**
 * 
 */
/**
 * @author JuanClavero
 *
 */
package reloj;

public class Reloj 
{
	private int horas;
	private int minutos;
	private int segundos;
	
	public Reloj ()
	{
		
	}
	
	public void avanzarSeg ()
	{
		
	    System.out.println(this.segundos);
		this.segundos++;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		if (this.segundos==60){
			this.segundos=0;}
		
	}
	public void avanzarMin ()
	{
	
	    System.out.println(this.minutos);
		this.minutos++;

		if (this.minutos==60){
			this.minutos=0;}
		try {
			Thread.sleep((1000)*60);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
	}
	public void avanzarHora ()
	{
	
	    System.out.println(this.horas);
		this.horas++;
		
		if (this.horas==24){
			this.horas=0;}
		try {
			Thread.sleep(((1000)*60)*60);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
	}
	
	
				
	public Reloj (int horasx, int minutosx, int segundosx)
	{
		this.horas=horasx;
		this.minutos=minutosx;
		this.segundos=segundosx;
		
	}
	
	/*public void avanzarSegundos ()
	{
		
		
	do
		{ 
			System.out.println(this.segundos);
			this.segundos=this.segundos+1;
			if (this.segundos==60){
				this.segundos=0;
				this.minutos=this.minutos+1;}
			
			
			if (this.minutos==60){
			
				this.minutos=0;
				this.horas=this.horas+1;
			System.out.println("minutos"+this.minutos);}
	
			if(this.horas==24){
				this.horas=0; System.out.println("hora "+this.horas);}
			
			
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}	while (this.segundos<=60);
	}	
	
	public void retrocederSegundos ()
	{
	
		while (this.segundos<=60)
		{ 
			
			if (this.segundos==0)
			{
				this.segundos=60;
				this.minutos=this.minutos-1;
				System.out.println(this.segundos);
			}
		
			if (this.minutos==0)
			{
				this.minutos=60;
				this.horas=this.horas-1;
				System.out.println(this.minutos);
			}
	
			if(this.horas==0)
			{
				this.horas=24;
				System.out.println(this.horas);
			}
			this.segundos+=this.segundos-1;
		
			
		}
	}
	public void imprimirHora()
	{
		System.out.println("hora :" +this.horas+ "\n"
				           + "minutos :"+this.minutos+ "\n"
				             + "segundos :"+this.segundos+"\n");
	}
	/**
	 * @return the horas
	 */
	public int getHoras() {
		return horas;
	}
	/**
	 * @param horas the horas to set
	 */
	public void setHoras(int horas) {
		this.horas = horas;
	}
	/**
	 * @return the minutos
	 */
	public int getMinutos() {
		return minutos;
	}
	/**
	 * @param minutos the minutos to set
	 */
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	/**
	 * @return the segundos
	 */
	public int getSegundos() {
		return segundos;
	}
	/**
	 * @param segundos the segundos to set
	 */
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	
	
	
	
}
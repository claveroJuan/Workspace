/**
 * 
 */
package thread;

/**
 * @author JuanClavero
 *
 */
public class Bobamzo  extends Thread  {

//	public void run() {
//		try{
//			for(int i =10;i>=0;i--){
//			sleep(1000); 
//			System.out.println(i);
//			}
//		}
//			catch(InterruptedException e){
//				  
//			}
	//}
	
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		Bobamzo bomba =new Bobamzo();
		bomba.start();
		bomba.join(); 
		System.out.println("BOOOOMMMMM");
	}
	
}	
	



package trabajo;

public class main {

	private static Process p;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		p = Runtime.getRuntime().exec("shutdown -s");
	    p.waitFor();

	    
	}

}

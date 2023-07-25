package ma.enset;

public class Application {
	
	public static void main(String[] args) {
		
		try {
			EntierNaturel e1 = new EntierNaturel(0);
			e1.decrementer();
		} catch (NombreNegatifException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			EntierNaturel e2 = new EntierNaturel(0);
			e2.decrementer();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

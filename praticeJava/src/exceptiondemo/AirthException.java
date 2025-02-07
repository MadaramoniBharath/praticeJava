package exceptiondemo;

public class AirthException {
	public static void division() {
		int a=6,b=0,c;
		
		try {
			c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
				
		
	}

}

package exceptiondemo;

public class NestedTry {
	
	public static void show() {
	String name="tkr";
	int nlength=name.length();
	System.out.println(nlength);
	
	String name2=null;
	int a=4;
	
	try {
		try {
		System.out.println(name.charAt(a));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("-----------------------------------------");
		}
		System.out.println(name2.length());
	}
	catch(NullPointerException ex) {
		System.out.println(ex.getMessage());
	}
	}
}

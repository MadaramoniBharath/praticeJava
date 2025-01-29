package praticeJava;
public class JavaDemo {

		public void display() {
			
			int a=10;
			int b=120;
			int sum=a+b;
			int subtraction=a-b;
			int multiplication =a*b;
			int division=(a/b);
			System.out.println("the addition is : "+sum);
			System.out.println("the Subtraqction is : "+subtraction);
			System.out.println("the multiplication is : "+multiplication);
			System.out.println("the Division is : "+division);
		}
		public static void main(String[] args) {
			JavaDemo obj=new JavaDemo();
			obj.display();
		}
	

	}



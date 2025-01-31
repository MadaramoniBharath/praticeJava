package praticeJava;
import com.tkr.program.*;
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
			AcessModPublic ob=new AcessModPublic();
			System.out.println("accesseed from another class and another package: "+ob.a);
			obj.display();
			
			//creating to check if protected is accesed 
			
//			AcessProtected objj=new AcessProtected();
//			System.out.println(objj.prot);
		}
	

	}



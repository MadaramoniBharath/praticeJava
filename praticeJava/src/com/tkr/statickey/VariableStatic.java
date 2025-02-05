package com.tkr.statickey;

public class VariableStatic {
	
	int rollno;
	String fullName;
	static String collegeName="TKREC(R9)";
	
	VariableStatic(int roll,String flname){
		rollno=roll;
		fullName=flname;
	}
	
	void display() {
		System.out.println("------------------------------------------");
		System.out.println("the roll no is " +rollno);
		System.out.println("the name is " +fullName);
		System.out.println("the college no is " +collegeName);
		System.out.println("------------------------------------------");
	}

		public static void main(String[] args) {
			VariableStatic vs=new VariableStatic(7411,"madaramoni Bharath");
			VariableStatic vs1=new VariableStatic(7402,"Ambati Sai");
			VariableStatic vs2=new VariableStatic(7415,"Jakkula Prashjanth");
			
			vs.display();
			vs1.display();
			vs2.display();
		}
}

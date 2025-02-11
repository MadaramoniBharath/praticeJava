package com.tkr.exception;

public class FinalException {
	
		
	
	void method1() {
		try{
		System.out.println("welcome");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("welcome to stranger things");
		}
	}
	public static void main(String[] args) {
	FinalException fe = new FinalException();
	fe.method1();

	
}
}

package com.tkr.program;

public class AcessPrivate {
	private int b=10;
	public static void main(String[] args) {
		AcessPrivate obj=new AcessPrivate();
		System.out.println(obj.b);
		
		//checking private acesss modifier
		//creating a object using the class
		
		AcessPrivate obj1 = new AcessPrivate();
		System.out.println(obj1.a);
	}

}

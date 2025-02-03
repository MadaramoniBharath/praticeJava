package com.tkr.polymorphism;

public class MethodOverriding {
	int a=10;
	int b=20;
	
	void show() {
		System.out.println("the sum is: "+(a+b));
	}
	
	class Main extends MethodOverriding{
	@Override
	 void show() {
		System.out.println("the sub is :"+(a-b));
	}
	}
}
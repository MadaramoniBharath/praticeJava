package com.tkr.polymorphism;

public class ConstructerOverloading {
	
	int a;
	int b;
	int c;
	
	//created a parameterized constructer constructer 
	ConstructerOverloading(int a, int b){
		this.a=a;
		this.b=b;
		System.out.println("sum is=" +(a+b));
	}
	//created another parameterized constructer
	ConstructerOverloading(int a, int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println("sum is=" +(a+b+c));
	}
	
	public static void main(String[] args) {
		ConstructerOverloading col=new ConstructerOverloading(5,5);
		ConstructerOverloading col1=new ConstructerOverloading(5,5,5);
		
		
	}
}

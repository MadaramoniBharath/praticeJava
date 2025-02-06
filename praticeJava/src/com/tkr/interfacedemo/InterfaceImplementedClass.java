package com.tkr.interfacedemo;

public class InterfaceImplementedClass implements InterfaceSum.InterfaceMul {

	@Override
	public void mul() {
		System.out.println("The mul is :" +(a*b));
		
	}
	
	public void sum() {
		System.out.println("the sum is :"+(a+b));
	}

}

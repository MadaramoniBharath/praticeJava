package com.tkr.interfacedemo;

public class InterfaceMain implements InterfaceFather,InterfaceChild{

	@Override
	public void mul() {
		int a=10;
		int b=20;
		System.out.println("the mul is:"+(a*b));
		
	}

	@Override
	public void div() {
		int a =100;
		int b=20;
		System.out.println("the div is :"+(a/b));
		
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		int a=10;
		int b=40;
		System.out.println("the sum is :"+(a+b));
		
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		System.out.println("the sub is :"+(a-b));
		
	}
	
public static void main(String[] args) {
	InterfaceMain im=new InterfaceMain();
	im.sum();
	im.sub();
	im.mul();
	im.div();
}
}

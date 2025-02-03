package com.tkr.polymorphism;

public class MethodOverloading {

	int add(int a , int b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		MethodOverloading mol= new MethodOverloading();
		System.out.println(mol.add(10, 20));
		System.out.println(mol.add(10, 10, 20));
	}
}

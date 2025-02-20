package com.tkr.features;

public class MainAddition {
	public static void main(String[] args) {
AdditionInterface ai = (a,b)->{System.out.println("the addition is :"+(a+b));};
AdditionInterface ai2 = (a,b)->{System.out.println("the Subtraction is :"+(a-b));};
AdditionInterface ai3 = (a,b)->{System.out.println("the multiplication is :"+(a*b));};
ai.add(5,5);
ai2.add(5, 10);
ai3.add(12, 5);
}
}
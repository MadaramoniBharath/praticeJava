package com.tkr.circle;

import java.util.Scanner;

public class MainCircle {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter the radius:");
	float radius=sc.nextFloat();
	System.out.println("please enter the colour");
	String colour=sc.next();
	
	Circle cl = new Circle(radius,colour);
	cl.calArea();
	cl.print();
}
}

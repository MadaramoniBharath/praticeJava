package com.tkr.circle;

public class Circle {
	private float radius;
	private String colour;
	private float area;
	
	Circle(float radius,String colour){
		this.radius=radius;
		this.colour=colour;
		this.area=calArea();
	}
	
	public float calArea() {
		area=(float) (Math.PI*radius*radius);
		return area;
	}
	
	public void print() {
		System.out.println("colour is: "+colour);
		System.out.println("area is : "+area);
	}
	
}

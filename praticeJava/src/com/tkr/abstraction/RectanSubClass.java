package com.tkr.abstraction;

public class RectanSubClass extends Rectangle{
	protected static float area=0.5f;
	protected int breadth;
	protected int height;
	
	
	
	RectanSubClass(int breadth,int height){
		
		this.breadth=breadth;
		this.height=height;
		
	}




	void calRect() {
		// TODO Auto-generated method stub
		super.calrect=(area*breadth*height);
		System.out.println(calrect);
	}
	public static void main(String[] args) {
		Rectangle rt=new RectanSubClass(5,7);
		rt.calRect();
		
	}
}
	
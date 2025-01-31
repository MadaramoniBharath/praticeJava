package com.tkr.constructor;

public class ConstructParam {
	
	ConstructParam(){
		System.out.println("this is default Parameter");
		
	}
	ConstructParam(int a,int b){
		System.out.println("2 param");
	}
	ConstructParam(String name,int b){
		System.out.println("thiss is 3rd parameter");
	}
	
	
	
//creating main method
	public static void main(String[] args) {
		ConstructParam cp1 = new ConstructParam(1,12);
		ConstructParam cp2 = new ConstructParam("bharath",11);
		
	}
}

	
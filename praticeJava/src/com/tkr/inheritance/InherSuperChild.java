package com.tkr.inheritance;

public class InherSuperChild extends InherSuperParent{
	int a=15;
	
	public void dispaly() {
		System.out.println("i love to drink butter milk");
		System.out.println(super.a);
	}
	
		public static void main(String[] args) {
	
		InherSuperChild isc=new InherSuperChild();
		System.out.println(isc.a);
		isc.dispaly();
		
		
	}
}

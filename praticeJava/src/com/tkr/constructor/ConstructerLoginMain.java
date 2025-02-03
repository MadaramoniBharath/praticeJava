package com.tkr.constructor;

import java.util.Scanner;

public class ConstructerLoginMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("please Enter the FUll Name:");
		String Name=sc.nextLine();
		System.out.println("please Enter the Email ID:");
		String Email=sc.nextLine();
		System.out.println("please Enter the mobile NO:");
		double mobileNo=sc.nextInt();
	
		ConstructerLogin cl = new ConstructerLogin(Name,Email,mobileNo);

}

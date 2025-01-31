package com.tkr.constructor;

import java.util.Scanner;

public class ConstStudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the roll no:");
		int rollno = sc.nextInt();
		
		System.out.println("enter the  name:");
		String name = sc.next();
		
		System.out.println("Enter the branch name:");
		String branch = sc.next();
		
		ConstStudent cs =new ConstStudent(rollno,name,branch);
		cs.setRollNo(rollno);
		cs.setName(name);
		cs.setBranch(branch);
	
		System.out.println(cs.toString());

	}

}
               
package com.tkr.stringdemo;

public class StringMethods {
public static void main(String[] args) {
	String s1="bamu";
	String s2="bhai";
	String s3="bamu";
	String s4=new String("bamu");
	String s5=new String("BAMU");
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.compareTo(s3));
	System.out.println(s1==s3);
	System.out.println(s2==s3);
	System.out.println(s1==s4);
	System.out.println(s1==s5);
}
}

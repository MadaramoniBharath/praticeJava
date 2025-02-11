package com.tkr.exception;

import java.util.Scanner;

public class ThrowException {
	
	
	void ageLogic(int age) {
		
		try{
								if(age<18) {
									
										throw new ArithmeticException("you are not Eligible");
								}
							}
		try {
								else if(age>18) {
									
								
									throw new ArithmeticException("yoou are Eligible");
								}
								}
								catch(Exception e) {
									System.out.println(e.getMessage());
								}
							
}

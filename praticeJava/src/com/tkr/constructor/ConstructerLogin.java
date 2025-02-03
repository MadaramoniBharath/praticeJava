package com.tkr.constructor;

public class ConstructerLogin {
	private String Name;
	private String Email;
	private double mobileNo;
	
	ConstructerLogin(String Name,String Email,double mobileNo){
		
		this.Name=Name;
		this.Email=Email;
		this.mobileNo=mobileNo;
		
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public double getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(double mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public void show() {
		System.out.println("Name of the coustumer is :"+Name);
		System.out.println("Email ID of the coustumer is :"+Email);
		System.out.println("Name of the coustumer is :"+mobileNo);
	}

}

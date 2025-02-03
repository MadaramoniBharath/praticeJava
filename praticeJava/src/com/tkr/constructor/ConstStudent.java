package com.tkr.constructor;

public class ConstStudent {
	
	private int rollNo;
	private String name;
	private String branch;
	
	//creating parameterized constructer 
	
	public ConstStudent(int rollNo, String name, String branch) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.branch = branch;
	}
	
	//creating getter and setter to allow the concept for next class
	

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "[rollNo=" + rollNo + ", name=" + name + ", branch=" + branch + "]";
	}
	
	
	
	
	
	
}

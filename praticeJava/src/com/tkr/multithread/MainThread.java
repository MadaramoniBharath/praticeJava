package com.tkr.multithread;

public class MainThread {
	public static void main(String[] args) {
		Vmware vm = new Vmware();
		BraveBrowser bb=new BraveBrowser();
		TaskManager tm= new TaskManager();
		
		vm.start();
		bb.start();
		tm.start();
	}
}

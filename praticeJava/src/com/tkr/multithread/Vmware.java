package com.tkr.multithread;

public class Vmware extends Thread{
	public void run() {
		System.out.println("Vmware:"+Thread.currentThread().getId());
	}

}

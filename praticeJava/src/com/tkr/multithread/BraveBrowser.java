package com.tkr.multithread;

public class BraveBrowser extends Thread{
	public void run() {
		System.out.println("BraveBrowser:"+Thread.currentThread().getId());
	}
}

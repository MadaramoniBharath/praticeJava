package com.tkr.multithread;

public class TaskManager extends Thread {
	public void run() {
		System.out.println("TaskManager:"+Thread.currentThread().getId());
	}
}

package com.mustafa.Aug01.ITC;
public class MultiThread extends Thread
{	
	public static void main(String[] args) {
		MultiThread m1 = new MultiThread();
		MultiThread m2 = new MultiThread();
		MultiThread m3 = new MultiThread();
		m1.start();
		m2.start();
		m3.start();
	}
	
public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

package com.mustafa.Aug01.ITC;

public class MultiThread11 extends Thread
{	
	public static void main(String[] args) {
		MultiThread11 m1 = new MultiThread11();
		MultiThread11 m2 = new MultiThread11();
		MultiThread11 m3 = new MultiThread11();
		m1.start();
		m2.start();
		m3.start();
	}
	
public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
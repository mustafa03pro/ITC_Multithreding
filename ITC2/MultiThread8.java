package com.mustafa.Aug01.ITC;

public class MultiThread8 implements Runnable
{
	Thread thread;
	public MultiThread8() {
		thread = new Thread(this);
		thread.start();
	}
	public void run() {
		System.out.println(thread);
		
	}	
	public static void main(String[] args) {
		new MultiThread8();
	}
}

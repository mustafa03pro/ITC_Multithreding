package com.mustafa.Aug01.ITC;

public class MultiThread9 implements Runnable
{
	Thread thread;
	public MultiThread9() {
		thread = new Thread(this,"NareshIT");
		thread.setPriority(6);
		thread.start();
	}
	public void run() {
		System.out.println(thread);
		
	}
	public static void main(String[] args) {
		new MultiThread9();
	}
}

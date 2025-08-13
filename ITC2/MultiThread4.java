package com.mustafa.Aug01.ITC;

public class MultiThread4 extends Thread
{
	public void run() {
		System.out.println(Thread.currentThread().threadId());
	}
	public static void main(String[] args) {
		MultiThread4 nit = new MultiThread4();
		//nit.start();
		for(int i=0;i<10;i++)
		{
			nit.start();
		}
	}
}
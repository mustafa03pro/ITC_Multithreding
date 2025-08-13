package com.mustafa.Aug01.ITC;

class Test1 extends Thread
{
	int a;
	
	public void run() {
		a++;
	}
}
public class MultiThread3
{
	public static void main(String[] args) {
		Test1 test = new Test1();
		test.start();
		System.out.println(test.a);
		test.run();
		System.out.println(test.a);
		
	//test.start();
		//System.out.println(test.a);
		System.out.println(test.isAlive());
		System.out.println(test.getName());		
	}
}


package com.mustafa.Aug01.ITC;

public class ATMMachine {

	public static void main(String[] args) {
		Account a1=new Account();
		Drawer d1=new Drawer(a1);
	d1.start();
	Depositor d2=new Depositor(a1);
	d2.start();
	
		

	}

}

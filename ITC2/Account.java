package com.mustafa.Aug01.ITC;

public class Account {
	private int amount=0;
	public synchronized void withdraw (int wamount) {
		while(wamount>amount) {
			System.err.println("waiting for some one to deposite");
			try {
				wait();
			}
			catch (InterruptedException e) {
				
			}
			this.amount=this.amount-wamount;
			System.out.println("Amount withdraw sucessfully "+wamount+" avilable balance "+this.amount);
			notify();
			
		}
		
	}
	public synchronized void deposit(int damount) {
		this.amount=this.amount+damount;
		System.out.println("Amount deposit sucessfully "+damount+" avilable balance "+this.amount);
		notify();
		
	}

}

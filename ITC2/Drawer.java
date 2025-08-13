package com.mustafa.Aug01.ITC;

public class Drawer extends Thread{
	private Account account;

	public Drawer(Account account) {
		super();
		this.account = account;
	} 
	@Override
	public void run() {
		int withdrawals[]= {2000,3000,1500};
		for(int with:withdrawals) {
			account.withdraw(with);
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				// TODO: handle exception
			}
			
		}
		
	}

}

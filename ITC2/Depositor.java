package com.mustafa.Aug01.ITC;

public class Depositor  extends Thread{
	private Account account;

	public Depositor(Account account) {
		super();
		this.account = account;
	}
	@Override
	public void run() {
		int deposits[]= {3000,2000,1400};
		for(int dept:deposits) {
			account.deposit(dept);
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}

}

package com.mustafa.Aug01.ITC;

public class Restaurant {
	private String name;
	private String order;
	boolean isOrderReady = false;
	public Restaurant(String name, String order, boolean isOrderReady) {
		super();
		this.name = name;
		this.order = order;
		this.isOrderReady = isOrderReady;
	}
	public synchronized void placeOrder(String orderName) {
		System.out.println("Welcome to "+name+" Restaurant!!!");
		while(!isOrderReady) {
			try {
				
				System.out.println("Waiter: Placed order for fried chicken");
				wait();
			}
			catch (InterruptedException e) {
				// TODO: handle exception
			}
			
		}
		System.out.println("Waiter: Serving the fried chicken");
		
	}
	public synchronized void prepareOrder()
	{
		System.out.println("Chef: Preparing fried chicken");
		try {
			Thread.sleep(2000);
			
		}
		catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("Chef: fried chicken is ready!");
		notify();
	}
	public String getName() {
		return this.name;
	}
	

}

package com.mustafa.july31.ITC;

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
	public  synchronized void placeOrder(String orderType) 
	{
		System.out.println("welcome to "+name+" resturent");
		 while (!isOrderReady) {
		        try {
		            wait();
		        } catch (InterruptedException e) {
		            
		        }
		    }
		    System.out.println("Waiter: Serving the fried chicken");
	}
	public  synchronized void prepareOrder() 
	{
		
		System.out.println("Chef: Preparing fried chicken");
	    try {
	        Thread.sleep(1000); 
	        
	    } catch (InterruptedException e) {
	        
	    }
	    isOrderReady = true;
	    System.out.println("Chef : Fried chicken is ready!");
	    notify();
	}
	public String getName() {
		return this.name;
	}
	
	

}

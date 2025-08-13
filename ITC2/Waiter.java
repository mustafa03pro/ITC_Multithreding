package com.mustafa.Aug01.ITC;

public class Waiter extends Thread{
	 private Restaurant restaurant;
	   private String orderName;
	public Waiter(Restaurant restaurant, String orderName) {
		super();
		this.restaurant = restaurant;
		this.orderName = orderName;
	}
	   public void acceptOrder(String oderName) {
		   this.orderName=oderName;
	   }
	   @Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		restaurant.placeOrder(orderName);
	}


}

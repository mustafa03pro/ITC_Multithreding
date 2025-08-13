package com.mustafa.Aug01.ITC;

public class Chef extends Thread{
	 private Restaurant restaurant;

	public Chef(Restaurant restaurant) {
		super();
		this.restaurant = restaurant;
	}
	 @Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		restaurant.prepareOrder();
	}


}

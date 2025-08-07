package com.mustafa.july31.ITC;

public class Chef extends Thread
{
    private Restaurant restaurant;

	public Chef(Restaurant restaurant) {
		super();
		this.restaurant = restaurant;
	}
    @Override
    public void run() {
    	restaurant.prepareOrder();
    }
}

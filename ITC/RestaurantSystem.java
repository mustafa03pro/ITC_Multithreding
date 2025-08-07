package com.mustafa.july31.ITC;

public class RestaurantSystem {

	public static void main(String[] args) {
		Restaurant r1=new Restaurant("albaik", "friedchicken", false);
		Waiter waiter=new Waiter(r1, "fried chicken");
		waiter.start();
		//waiter.acceptOrder("fried chicken");
		Chef chef=new Chef(r1);
		
		
		chef.start();
		waiter.acceptOrder("fried chicken");
	}

}

package com.mustafa.Aug01.ITC;

public class RestaurantSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant r1=new Restaurant("al-baik", "friedchicken/", false);
		Waiter waiter=new Waiter(r1, "friedchicken");
		Chef chef=new Chef(r1);
		waiter.start();
		chef.start();

	}

}

package com.mustafa.Aug04;

public class DoseBooking {

	private boolean booked=false;

	public synchronized void bookDose() {
		if(booked) {
			throw new RuntimeException("alrady booked");
		}
		booked=true;
	}
	 public boolean isDoseBooked() {
	        return booked;
	    }
	
	

}

package com.mustafa.Aug01.ITC;
class TicketSystem{
	private int avilableTicket=5;
	public synchronized void BookTicket(int numberTicket) {
		while(numberTicket>avilableTicket) {
			System.err.println("Ticket are not avilable waiting for cancelation");
			try {
				wait();
			}
			catch (InterruptedException e) {
				System.err.println("interupted because of some resaon");
			}
		}
		this.avilableTicket=this.avilableTicket-numberTicket;
		System.out.println("booked ticket "+numberTicket+ "avilable ticket"+avilableTicket);
		notify();
	}
	public synchronized void cancelTicket(int numberTicket) {
		this.avilableTicket=this.avilableTicket+numberTicket;
		System.out.println("cancel number of ticket "+numberTicket+"avilabe ticket(s)"+avilableTicket);
		notify();
	}
}

public class ITCDemo3 {

	public static void main(String[] args) {
		TicketSystem ticketsystem=new TicketSystem();
		Thread bookticket=new Thread() {
			@Override
			public void run() {
				int tickets[]= {4,2,5};
				for(int ticket:tickets) {
					ticketsystem.BookTicket(ticket);
					try {
						Thread.sleep(500);
					}
					catch (InterruptedException e) {
						System.err.println("boking thread is interupted");
					}
				}
			}
			
		};
		bookticket.start();
		Thread cancelThread=new Thread() {
			@Override
			public void run() {
				int tickets[]= {1,3,2};
				for( int ticket:tickets) {
					ticketsystem.cancelTicket(ticket);
					try {
						Thread.sleep(1000);
					}
					catch (InterruptedException e) {
						System.err.println("cancel thred is interrupted");
					}
				}
			}
		};
		cancelThread.start();

	}

}

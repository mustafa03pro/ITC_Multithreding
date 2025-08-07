package com.mustafa.july31.ITC;
class Test extends Thread{
	private int val=0;
	@Override
	public void run() {
		
			try {
				Thread.sleep(5
						);
			}
			catch(InterruptedException e) {
				System.err.println("thread is interupted");
				
			}
			for(int i=1;i<=10;i++) {
				val=val+i;
				
			}
			
			
		}
	
	public int getVal() {
		return this.val;
	}
	
}

public class ITCDemo1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main thead started");
		Test t1=new Test();
		t1.start();
		Thread.sleep(10);
		System.out.println(t1.getVal());
		System.out.println("main thread endend");
		
		
		
		

	}

}

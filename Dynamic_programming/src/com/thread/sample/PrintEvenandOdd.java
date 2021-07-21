package com.thread.sample;

public class PrintEvenandOdd {

	public static void main(String[] args) {

		EvenOddThread evenOddThread=new EvenOddThread(10);
		
		Thread eventhread=new Thread(new Runnable() {
			public void run() {
				try {
					evenOddThread.EvenThread();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}) ;
		
		Thread oddthread=new Thread(new Runnable() {
			public void run() {
				try {
					evenOddThread.oddThread();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}) ;
		
		eventhread.start();
		oddthread.start();

	}

}

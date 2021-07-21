package com.thread.sample;

import java.util.concurrent.Semaphore;

public class EvenOddThread {
	
	private int Numbers = 1;
	private int naturalNum;
	 
	private Semaphore evenSem=new Semaphore(1);
	private Semaphore oddSem=new Semaphore(1);
	
	
	public EvenOddThread(int naturalNum) {
		this.naturalNum = naturalNum;
		try {
			evenSem.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void oddThread() throws InterruptedException{
		
		
		while(Numbers < naturalNum){
			oddSem.acquire();
			if(this.Numbers % 2 != 0){
				System.out.println("Odd Thread :"+Numbers++);
			}
			evenSem.release();
		}
		
	}
	
	public void EvenThread() throws InterruptedException{
		
		
		while(Numbers < naturalNum){
			evenSem.acquire();
			if(this.Numbers % 2 == 0){
				System.out.println("Even Thread :"+Numbers++);
			}
			oddSem.release();
		}
		
	}

	
}

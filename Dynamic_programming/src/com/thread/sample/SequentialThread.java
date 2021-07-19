package com.thread.sample;

import com.sample.Logictricks.PrintFirst;
import com.sample.Logictricks.PrintSecond;
import com.sample.Logictricks.PrintThird;

public class SequentialThread extends Thread{
	

	public static void main(String[] args) throws InterruptedException {
		
	Foo f=new Foo();
	Runnable pf=new PrintFirst();
	Runnable ps=new PrintSecond();
	Runnable pt=new PrintThird();
	
	for (int i = 0; i < 10; i++) {
		
		f.first(pf);
		f.second(pt);
		f.third(ps);
	}

	
	}

	/*public void printFirst(){
		sem.acquire(n);
		System.out.println("Hi");
		sem.release(permits);
		firstLatch.countDown();
		firstLatch.await();
	}
	
	public void printSecond(){
		System.out.println("Hello");
	}
	
	public void run(){
		printFirst();
		printSecond();
	}*/
}

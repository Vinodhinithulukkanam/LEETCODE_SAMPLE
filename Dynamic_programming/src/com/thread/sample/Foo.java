package com.thread.sample;

import java.util.concurrent.CountDownLatch;

class Foo {
    
    private CountDownLatch firstLatch;
    private CountDownLatch secondtLatch;

   public Foo() {
   firstLatch=new CountDownLatch(1);
   secondtLatch=new CountDownLatch(1);
   }

   public void first(Runnable printFirst) throws InterruptedException {
       
       printFirst.run();
       firstLatch.countDown();
   }

   public void second(Runnable printSecond) throws InterruptedException {
	   firstLatch.await();
       printSecond.run();
       secondtLatch.countDown();
   }

   public void third(Runnable printThird) throws InterruptedException {
       secondtLatch.await();
       printThird.run();
   }
}

package com.threadDemo;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantClassDemo {
	ReentrantLock rl=new ReentrantLock();
	public void dispaly(String name){
		rl.lock();
		  System.out.println(Thread.currentThread().getName() +" is accuired  the lock");
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e){
		}
	  rl.unlock();
	  System.out.println(Thread.currentThread().getName() +" is released the lock");
	  
	  for (int i = 0; i < 5; i++) {
		  System.out.println(i+ " is executed by "+Thread.currentThread().getName());
		
	}
	}
}

package com.threadDemo;

public class MyThread extends Thread{
	String name;
	ReentrantClassDemo reentrantClassDemo; 
	MyThread(String name,ReentrantClassDemo reentrantClassDemo){
		this.name=name;
		this.reentrantClassDemo=reentrantClassDemo;
	}
	public void run(){
	reentrantClassDemo.dispaly(name);
	}

}

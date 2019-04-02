package com.threadDemo;

public class ReentrantDemo {
public static void main(String[] args) {
	ReentrantClassDemo r=new ReentrantClassDemo();
	MyThread m1=new MyThread("Dhoni",r);
	MyThread m2=new MyThread("Yuvi",r);

	m1.start();
	m2.start();

}
}

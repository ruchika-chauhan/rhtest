package com.asserttest;

public class AssertTest {
	public static void main(String[] args) {
		int i =10;
		int a=20;
		int c=i+a;
		assert(c<20):"value of c must be  30";
		int j=c+30;
		System.out.println(j);
	}

}

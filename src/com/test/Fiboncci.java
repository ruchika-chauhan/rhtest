package com.test;

public class Fiboncci {
	public static void main(String[] args) {
		int j=1;
		int a=0,b=1,c;
		System.out.print(a+" "+b);
		while(j<5){
			c=a+b;
			a=b;
			b=c;
		System.out.print(" "+c);	
		j++;
		}
	}

}

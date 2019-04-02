package com.test;

public class TribonaaciSeries {
	public static void main(String[] args) {
		int a=0, b=1,c=2;
		System.out.print(a+","+b+","+c);
		int sum=0;
		for (int i = 0; i < 7; i++) {
			sum=a+b+c;
			System.out.print(","+sum);
			a=b;
			b=c;
			c=sum;
		}
	} 
	

}

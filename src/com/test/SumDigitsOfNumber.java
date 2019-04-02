package com.test;

public class SumDigitsOfNumber {
public static void main(String[] args) {
	int sum=0, a,b;
	int n =345;
	while(n>0){
	  a=n%10;
	  sum=sum+a;
	  n=n/10;
		
	}
	System.out.println(sum);
}
}

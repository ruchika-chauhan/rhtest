package com.test;

public class TestPalindrom {
	public static void main(String[] args) {
		int no=33333;int temp=no;
		int  sum=0;
		int a=0;
		
		while(no>0){
			a=no%10;
		//	System.out.println("a: "+a);
			sum =(sum*10)+a;
		//	System.out.println("sum: "+sum);
			no=no/10;
		//	System.out.println("no: "+no);
		}
if(sum==temp)
	System.out.println("yes");
else
	System.out.println("No");
	}
}

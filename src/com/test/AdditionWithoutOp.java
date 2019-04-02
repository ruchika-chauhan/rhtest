package com.test;

import java.util.Scanner;

public class AdditionWithoutOp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two no>>>");
		int a=sc.nextInt();
		int b= sc.nextInt();
		int sum=a-~b-1;
		System.out.println(~b);

		System.out.println("sum>>"+sum);
		
	}

}
